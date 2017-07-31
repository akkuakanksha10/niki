package com.process;

import java.util.List;

import com.dao.RestFactory;
import com.dao.SeqController;
import com.model.ItemDetail;

import com.model.Seq;

public class ItemDetailImplementation extends RestFactory{
	private RestFactory factory;
	private SeqController controller;
	
	public ItemDetail saveItemType(ItemDetail itemDetail){
		try {
			Seq s=controller.findEmployeeRoleMappingSequence();
			itemDetail.setItemDetailId(s.getKey());
			s.increment();
			factory.update(s);
			factory.save(itemDetail);
			return itemDetail;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	public List<ItemDetail> getItemDetails(){
		try {
			List<ItemDetail> itemDetailList=(List<ItemDetail>)factory.getObjectList(ItemDetail.class);
			return itemDetailList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}