package com.cgw.uba.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cgw.uba.model.PaymentDetailsBauTransferFees;

public class AppService {
	
	
	
	

	private static SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(PaymentDetailsBauTransferFees.class).buildSessionFactory();
	private static Session session;
	private static Transaction transaction;
	
	public static List<PaymentDetailsBauTransferFees> getBankList()
	
	{
		
		List<PaymentDetailsBauTransferFees> lists = null;
		session = sessionFactory.openSession();
		
		try {
			transaction = session.beginTransaction();
			TypedQuery<PaymentDetailsBauTransferFees> query = session.createQuery("select b from PaymentDetailsBauTransferFees b", PaymentDetailsBauTransferFees.class);
			
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
