package com.process;

import java.util.List;

import com.dao.RestFactory;
import com.dao.SeqController;
import com.model.PurchaseOrder;
import com.model.PurchaseOrderDetail;
import com.model.Seq;

public class StockImplementation extends RestFactory{
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
	/*************************** UOM ******************************************************/
	/*************************** Sales Bill ******************************************************/
	/*************************** Sales Bill Detail ******************************************************/
	/******************************Purchase Order ******************************************************/
	
	public PurchaseOrder savePurchaseOrder(PurchaseOrder po){
		try {
			Seq s=controller.findPurchaseOrderSequence();
			String strq=s.getKey();
			po.setPurchaseOrderId(strq);
			s.increment();
			update(s);
			save(po);
			return po;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	public PurchaseOrder updatePurchaseOrder(PurchaseOrder po){
		try {
			update(po);
			return po;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	public List<PurchaseOrder> getPurchaseOrders(){
		try {
			List<PurchaseOrder> poList=(List<PurchaseOrder>)getObjectList(PurchaseOrder.class);
			return poList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	/******************************Purchase Order Detail******************************************************/
	
	public PurchaseOrderDetail savePoDetail(PurchaseOrderDetail poDetail){
		try {
			Seq s=getController().findPurchaseOrderDetailSequence();
			String strq=s.getKey();
			poDetail.setPodId(strq);
			s.increment();
			update(s);
			save(poDetail);
			return poDetail;
		} catch (Exception e) {
			e.printStackTrace();
			return poDetail;
		}
		
		
	}
	public PurchaseOrderDetail updatePoDetail(PurchaseOrderDetail poDetail){
		try {
			update(poDetail);
			return poDetail;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<PurchaseOrderDetail> getPoDetails(){
		try {
			List<PurchaseOrderDetail> poDetailList=(List<PurchaseOrderDetail>)getObjectList(PurchaseOrderDetail.class);
			return poDetailList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	/******************************Vendor ******************************************************/
	
	
}
