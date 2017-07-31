package com.process;

import java.util.List;

import com.dao.RestFactory;
import com.dao.SeqController;
import com.model.Item;
import com.model.ItemDetail;
import com.model.ItemSize;
import com.model.ItemType;
import com.model.Seq;

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
