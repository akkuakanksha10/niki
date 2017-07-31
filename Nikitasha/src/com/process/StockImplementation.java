package com.process;

import java.util.List;

import com.dao.RestFactory;
import com.dao.SeqController;
import com.model.PurchaseOrder;
import com.model.PurchaseOrderDetail;
import com.model.SalesBill;
import com.model.SalesBillDetail;
import com.model.Seq;
import com.model.Uom;

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
	
	public Uom saveUom(Uom  uom){
		try {
			Seq s=controller.findUomSequence();
			String strq=s.getKey();
			uom.setUomId(strq);
			s.increment();
			update(s);
			save(uom);
			return uom;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Uom updateUom(Uom uom){
		try {
			update(uom);
			return uom;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Uom> getUoms(){
		try {
			List<Uom> uomList=(List<Uom>)getObjectList(Uom.class);
			return uomList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	/*************************** Sales Bill ******************************************************/
	
	public SalesBill saveSalesBill(SalesBill salesBill){
		try {
			Seq s=controller.findPurchaseOrderSequence();
			String strq=s.getKey();
			salesBill.setSalesBillId(strq);
			s.increment();
			update(s);
			save(salesBill);
			return salesBill;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	public SalesBill updateSalesBill(SalesBill salesBill){
		try {
			update(salesBill);
			return salesBill;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	public List<SalesBill> getSalesBills(){
		try {
			List<SalesBill> soList=(List<SalesBill>)getObjectList(SalesBill.class);
			return soList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	/*************************** Sales Bill Detail ******************************************************/
	
	public SalesBillDetail saveSoDetail(SalesBillDetail soDetail){
		try {
			Seq s=getController().findSalesBillDetailSequence();
			String strq=s.getKey();
			soDetail.setSalesBillDetailId(strq);
			s.increment();
			update(s);
			save(soDetail);
			return soDetail;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	public SalesBillDetail updateSoDetail(SalesBillDetail soDetail){
		try {
			update(soDetail);
			return soDetail;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	public List<SalesBillDetail> getSoDetails(){
		try {
			List<SalesBillDetail> soDetailList=(List<SalesBillDetail>)getObjectList(SalesBillDetail.class);
			return soDetailList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
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
