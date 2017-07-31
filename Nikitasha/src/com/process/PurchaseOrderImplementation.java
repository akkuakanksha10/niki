package com.process;

import java.util.List;

import com.dao.RestFactory;
import com.dao.SeqController;
import com.model.PurchaseOrder;
import com.model.PurchaseOrderDetail;
import com.model.Seq;

public class PurchaseOrderImplementation extends RestFactory{
	private RestFactory factory;
	private SeqController controller;
	
	public PurchaseOrder savePurchaseOrder(PurchaseOrder po){
		try {
			Seq s=controller.findPurchaseOrderSequence();
			po.setPurchaseOrderId(s.getKey());
			s.increment();
			factory.update(s);
			factory.save(po);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return po;
	}
	public PurchaseOrder updatePurchaseOrder(PurchaseOrder po){
		try {
			factory.update(po);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return po;
	}
	public List<PurchaseOrder> getPurchaseOrders(){
		try {
			List<PurchaseOrder> poList=(List<PurchaseOrder>)factory.getObjectList(PurchaseOrder.class);
			return poList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
