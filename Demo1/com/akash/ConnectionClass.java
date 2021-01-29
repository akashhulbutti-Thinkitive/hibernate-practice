package com.akash;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class ConnectionClass {

	public void insertEmployee() {
		Employee e = new Employee(12, "MNO", 77600);
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();

		session.save(e);


		tx.commit();

		session.close();
		factory.close();

	}
	
	public void insertEMployeeByQuery() {
		Employee e = new Employee(12, "MNO", 77600);
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();

		Query q=session.createQuery("From employee where salary>35000");
		List list=q.list();
System.out.println(list);
		tx.commit();

		session.close();
		factory.close();
	}

}
