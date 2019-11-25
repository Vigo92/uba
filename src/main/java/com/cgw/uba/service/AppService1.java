package com.cgw.uba.service;


import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cgw.uba.model.PaymentDetailsBauTransfer;

public class AppService1 {
	
	
	
	

	private static SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(PaymentDetailsBauTransfer.class).buildSessionFactory();
	private static Session session;
	private static Transaction transaction;
	
	public static List<PaymentDetailsBauTransfer> getBankList()
	
	{
		
		List<PaymentDetailsBauTransfer> lists = null;
		session = sessionFactory.openSession();
		
		try {
			transaction = session.beginTransaction();
			TypedQuery<PaymentDetailsBauTransfer> query = session.createQuery("select b from PaymentDetailsBauTransfer b", PaymentDetailsBauTransfer.class);
			
			 	 lists = query.getResultList();
		    transaction.commit();
		}
		catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally {
			session.close();
	}
		return lists;
	}
	
}
