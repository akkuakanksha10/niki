package com.process;

import java.util.List;

import com.dao.RestFactory;
import com.dao.SeqController;
import com.model.Item;
import com.model.Seq;

public class ItemImplementation extends RestFactory{
	private RestFactory factory;
	private SeqController controller;
	
	public Item saveItem(Item item){
		try {
			Seq s=controller.findEmployeeRoleMappingSequence();
			item.setItemId(s.getKey());
			s.increment();
			factory.update(s);
			factory.save(item);
			return item;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	public List<Item> getItems(){
		try {
			List<Item> itemList=(List<Item>)factory.getObjectList(Item.class);
			return itemList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
