package com.process;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.json.JSONArray;
import org.json.JSONObject;

import com.dao.RestFactory;
import com.dao.SeqController;
import com.db.SingletonDBConnection;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.model.FacebookLike;
import com.model.Item;
import com.model.ItemDetail;
import com.model.ItemSize;
import com.model.ItemType;
import com.model.Rating;
import com.model.Seq;
import com.model.Uom;
import com.model.User;

public class ItemImplementation extends RestFactory{
	
	private SeqController controller;
	public SeqController getController() {
		if(controller==null){
			controller=new SeqController();
		}
		return controller;
	}

	public void setController(SeqController controller) {
		this.controller = controller;
	}
	
	public Item saveItem(Item item){
		try {
			Seq s=getController().findItemSequence();
			String strseq=s.getKey();
			item.setItemId(strseq);
			s.increment();
			update(s);
            save(item);
			return item;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	public List<Item> getItems(){
		try {
			List<Item> itemList=(List<Item>)getObjectList(Item.class);
			return itemList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/****************************  Item Type *************************************************/
	
	public ItemType saveItemType(ItemType itemType){
		try {
			Seq s=getController().findItemTypeSequence();
			String strseq=s.getKey();
			itemType.setItemTypeId(strseq);
			s.increment();
			update(s);
            save(itemType);
			return itemType;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	public List<ItemType> getItemTypes(){
		try {
			List<ItemType> itemTypeList=(List<ItemType>)getObjectList(ItemType.class);
			return itemTypeList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	/*
	 * get Item Details
	 */
	public Object getItemCategory() {
		Session session=SingletonDBConnection.getSessionFactory().openSession();
		String hql = "SELECT it.itemTypeId,it.itemName,id.image1 FROM ItemType it,ItemDetail id";
		Query query = session.createQuery(hql);
		List results = query.list();
		
		return results;
	}
	
	/***************************************** Item Detail ***********************************************/
	
	public ItemDetail saveItemDetail(ItemDetail itemDetail){
		try {
			Seq s=getController().findItemDetailSequence();
			String strseq=s.getKey();
			itemDetail.setItemDetailId(strseq);
			s.increment();
			update(s);
            save(itemDetail);
			return itemDetail;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	/*
	 * 
	 */
	public JSONArray findJsonArrayItemTypeById(String id){
		JSONArray jsonArrayOfItemById=new JSONArray();
		JSONObject parentObject=new JSONObject();
		
		String typeid="ITY-2017-13";
		Session session=SingletonDBConnection.getSessionFactory().openSession();
		Query query=session.createQuery("select it from ItemType it where it.itemTypeId= :typeid");
		query.setParameter("typeid", typeid);
		ItemType itemType=(ItemType)query.uniqueResult();
		
		try{
			
			List<Item> list=itemType.getItems();
			
			for(Item items:list)
			{
				JSONObject jsonItem=new JSONObject();
				jsonItem.put("item_name", items.getName());	
				jsonItem.put("item_id",items.getItemId());
				Uom uom=items.getUom();
				JSONObject jUom=new JSONObject();
				jUom.put("uom_id",uom.getUomId());
				jUom.put("uom_name", uom.getUomName());
				jsonItem.put("uom", jUom);
				
				List<ItemDetail> itemDetailsList=items.getItemDetails();
				
				for(ItemDetail idet:itemDetailsList)
				{
					
					JSONObject jsonObjiteDetail=new JSONObject();
					jsonObjiteDetail.put("item_detail_id", idet.getItemDetailId());
					//jsonObjiteDetail.put(, idet.getItem());
					jsonObjiteDetail.put("mrp", idet.getMrp());
					jsonObjiteDetail.put("sell_price", idet.getSalesPrice());
					jsonObjiteDetail.put("weight", idet.getWeight());
					jsonObjiteDetail.put("discount", idet.getDiscount());
					
					ItemSize itemSize =idet.getItemSize();
					JSONObject jItemSize=new JSONObject();
					jItemSize.put("item_size_id",itemSize.getItemSizeId());
					jItemSize.put("size_name",itemSize.getItemSizeName());
					jsonObjiteDetail.put("size_dtls",jItemSize);
					
					
					jsonObjiteDetail.put("color", idet.getColor());
					jsonObjiteDetail.put("sleave_type", idet.getSleeveType());
					jsonObjiteDetail.put("fabric", idet.getFabric());
					jsonObjiteDetail.put("pattern", idet.getPattern());
					jsonObjiteDetail.put("image1", idet.getImage1());
					jsonObjiteDetail.put("image2", idet.getImage2());
					jsonObjiteDetail.put("image3", idet.getImage3());
					jsonObjiteDetail.put("image4", idet.getImage4());
					jsonObjiteDetail.put("image5", idet.getImage5());
					jsonItem.put("item_details",jsonObjiteDetail );
						
				}
				List<FacebookLike> fblist= items.getFacebookLikes();
				if(fblist.size()>0){
					for(FacebookLike fb:fblist){
						JSONObject jFb=new JSONObject();
						User user=new User();
						user=fb.getUserId();
						JSONObject userjson=new JSONObject();
						userjson.put("user_id",user.getUserId());
						userjson.put("user_mail",user.getEmailId());
						userjson.put("user_name",user.getUserName());
						
						jFb.put("user_id", userjson);
						jFb.put("likecount", fb.getFacebookLike());
						jsonItem.put("facebook", jFb);
					}	
				}
				
				List<Rating> rt= items.getRatings();
				if(rt.size()>0){
					for(Rating r:rt){
						JSONObject object=new JSONObject();
						object.put("rating_val", r.getRateValue());
						object.put("rating_id", r.getRateId());
						jsonItem.put("rating_dtls", object);
					}	
				}
				jsonArrayOfItemById.put(jsonItem);
			}	
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return jsonArrayOfItemById;
	}
	

	
	

	public List<ItemDetail> getItemDetails(){
		try {
			List<ItemDetail> itemDetailList=(List<ItemDetail>)getObjectList(ItemDetail.class);
			return itemDetailList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/********************************************** Item Size ************************************************/
	
	public ItemSize saveItemSize(ItemSize itemSize){
		try {
			Seq s=getController().findItemSizeSequence();
			String strq=s.getKey();
			itemSize.setItemSizeId(strq);
			s.increment();
			update(s);
			save(itemSize);
			return itemSize;
			} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public ItemSize updateItemSize(ItemSize itemSize){
		try {
			update(itemSize);
			return itemSize;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<ItemSize> getItemSize(){
		try {
			List<ItemSize> itemSizeList=(List<ItemSize>)getObjectList(ItemSize.class);
			return itemSizeList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
