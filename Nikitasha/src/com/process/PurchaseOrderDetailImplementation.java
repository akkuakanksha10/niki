package com.process;

import java.util.List;

import com.dao.RestFactory;
import com.dao.SeqController;

import com.model.PurchaseOrderDetail;
import com.model.Seq;

public class PurchaseOrderDetailImplementation extends RestFactory{
	private RestFactory factory;
	private SeqController controller;
	
	public PurchaseOrderDetail savePoDetail(PurchaseOrderDetail poDetail){
		try {
			Seq s=controller.findPurchaseOrderDetailSequence();
			poDetail.setPodId(s.getKey());
			s.increment();
			factory.update(s);
			factory.save(poDetail);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return poDetail;
	}
	public PurchaseOrderDetail updatePoDetail(PurchaseOrderDetail poDetail){
		try {
			factory.update(poDetail);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return poDetail;
	}
	public List<PurchaseOrderDetail> getPoDetails(){
		try {
			List<PurchaseOrderDetail> poDetailList=(List<PurchaseOrderDetail>)factory.getObjectList(PurchaseOrderDetail.class);
			return poDetailList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
