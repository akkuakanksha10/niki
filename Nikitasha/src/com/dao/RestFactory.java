package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.db.SingletonDBConnection;
import com.model.Seq;

public abstract class RestFactory implements RestDao{
	@Override
	public Object save(Object object) throws Exception {
		Session session=SingletonDBConnection.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(object);
		t.commit();
		session.close();
		return object;
	}

	@Override
	public Object update(Object object) throws Exception {
		Session session=SingletonDBConnection.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.update(object);
		t.commit();
		session.close();
		return object;
	}

	@Override
	public Object delete(Object object) throws Exception {
		Session session=SingletonDBConnection.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.delete(object);
		t.commit();
		session.close();
		return object;
	}

	@Override
	public Object getObjectList(Class className) throws Exception {
		Session session=SingletonDBConnection.getSessionFactory().openSession();
		List<Object> list=session.createCriteria(className).list();
		session.close();
		return list;
	}

	@Override
	public String getSeguence(String tableName) throws Exception {
		
		return null;
	}

	@Override
	public int getCount() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveSequence(int seq, String tableName) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Seq save(Seq seq) throws Exception{
		save(seq);
		return seq;
		
	}
	
	
}
