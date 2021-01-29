package com.akash;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.akash.Employee;

public class MyDBClass {
	public void showListEmployee() {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		Criteria c =session.createCriteria(Employee.class);
		c.add(Restrictions.gt("salary",25000));
		List<Employee> list = c.list();
		  for(Employee e:list)
		  System.out.println(e.getEmpid()+" : "+e.getEname()+" : "+e.getSalary());
		 
		tx.commit();
		session.close();
		factory.close();
	}

}
