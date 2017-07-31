package com.process;

import java.util.List;

import com.dao.RestFactory;
import com.dao.SeqController;
import com.model.Employee;
import com.model.ItemSize;
import com.model.Seq;

public class ItemSizeImplementation extends RestFactory{
	private RestFactory factory;
	private SeqController controller;
	
	public ItemSize saveItemSize(ItemSize itemSize){
		try {
			Seq s=controller.findEmployeeSequence();
			itemSize.setItemSizeId(s.getKey());
			s.increment();
			factory.update(s);
			factory.save(itemSize);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return itemSize;
	}
	public ItemSize updateItemSize(ItemSize itemSize){
		try {
			factory.update(itemSize);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return itemSize;
	}
	public List<ItemSize> getEmployees(){
		try {
			List<ItemSize> itemSizeList=(List<ItemSize>)factory.getObjectList(ItemSize.class);
			return itemSizeList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
