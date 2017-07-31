package com.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class SingletonDBConnection {
	private static SessionFactory factory;

	public static SessionFactory getSessionFactory(){
		Configuration con=new AnnotationConfiguration();
		con.configure();
		factory=con.buildSessionFactory();
		return factory;
		
	}
  
}
