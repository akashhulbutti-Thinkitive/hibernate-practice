package com.akash;

import java.util.HashSet;
import java.util.Set;

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
		Address add1 = new Address(411001, "Pune","MH");
		Address add2 = new Address(411002, "Pune","MH");
		Address add3 = new Address(411003, "Pune","MH");
		Set<Address> list=new HashSet<Address>();
		list.add(add3);
		list.add(add2);
		list.add(add1);
		Employee emp = new Employee(1, "User 1", 12000, list);
		session.save(emp);
		t.commit();
		session.close();
		factory.close();
	}
}
