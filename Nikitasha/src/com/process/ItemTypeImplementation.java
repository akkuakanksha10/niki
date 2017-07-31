package com.process;

import java.util.List;

import com.dao.RestFactory;
import com.dao.SeqController;

import com.model.ItemType;
import com.model.Seq;

public class ItemTypeImplementation extends RestFactory{
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
}
