package com.akash;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DBOps {

	public void insertEmployee() {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Address add = new Address(411093, "Pune","MH");
		Employee emp = new Employee(71, "Mapping1", 12000, add);
		session.save(emp);
		t.commit();
		session.close();
		factory.close();
	}
}
