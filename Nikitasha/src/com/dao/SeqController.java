package com.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.db.SingletonDBConnection;
import com.model.Employee;
import com.model.EmployeeRoleMapping;
import com.model.FacebookLike;
import com.model.Item;
import com.model.ItemDetail;
import com.model.ItemType;
import com.model.PurchaseOrder;
import com.model.PurchaseOrderDetail;
import com.model.Rating;
import com.model.SalesBill;
import com.model.SalesBillDetail;
import com.model.Seq;
import com.model.Stock;
import com.model.Uom;
import com.model.User;
import com.model.Vendor;

public class SeqController {
	
	private Seq seq;
	
	
	public Seq getSeq() {
		return seq;
	}

	public void setSeq(Seq seq) {
		this.seq = seq;
	}

	public SeqController() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Seq findSequenceForClass(Class c) throws Exception{
		Session session=SingletonDBConnection.getSessionFactory().openSession();
		try {
			Transaction transaction=session.beginTransaction();
			Query query=session.createQuery("select s from Seq s where s.name=:c");
			query.setParameter("c", c.getSimpleName());
			Seq seq=(Seq)query.uniqueResult();
			transaction.commit();
			session.close();
			return seq;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	public Seq findEmployeeSequence()throws Exception{
		return findSequenceForClass(Employee.class);
		
	}
	public Seq findEmployeeRoleMappingSequence()throws Exception{
		return findSequenceForClass(EmployeeRoleMapping.class);
		
	}
	public Seq findFacebookLikeSequence()throws Exception{
		return findSequenceForClass(FacebookLike.class);
		
	}
	public Seq findItemSequence()throws Exception{
		return findSequenceForClass(Item.class);
		
	}
	public Seq findItemDetailSequence()throws Exception{
		return findSequenceForClass(ItemDetail.class);
		
	}
	public Seq findItemTypeSequence()throws Exception{
		return findSequenceForClass(ItemType.class);
		
	}
	public Seq findPurchaseOrderSequence()throws Exception{
		return findSequenceForClass(PurchaseOrder.class);
		
	}
	public Seq findPurchaseOrderDetailSequence()throws Exception{
		return findSequenceForClass(PurchaseOrderDetail.class);
		
	}
	public Seq findRatingSequence()throws Exception{
		return findSequenceForClass(Rating.class);
		
	}
	public Seq findSalesBillSequence()throws Exception{
		return findSequenceForClass(SalesBill.class);
		
	}
	public Seq findSalesBillDetailSequence()throws Exception{
		return findSequenceForClass(SalesBillDetail.class);
		
	}
	public Seq findStockSequence()throws Exception{
		return findSequenceForClass(Stock.class);
		
	}
	public Seq findUomSequence()throws Exception{
		return findSequenceForClass(Uom.class);
		
	}
	public Seq findUserSequence()throws Exception{
		return findSequenceForClass(User.class);
		
	}
	public Seq findVendorSequence()throws Exception{
		return findSequenceForClass(Vendor.class);
		
	}
	
	
}
