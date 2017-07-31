package com.dao;

import java.util.List;

public interface RestDao {
	public Object save(Object object) throws Exception;
	public Object update(Object object) throws Exception;
	public Object delete(Object object) throws Exception;
	public Object getObjectList(Class className) throws Exception;
	public String getSeguence(String tableName) throws Exception;
	public int getCount() throws Exception;
	public int saveSequence(int seq, String tableName) throws Exception;
}
