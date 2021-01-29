package com.akash.crud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.akash.crud.Employee;


public class MyConnectionClass {
	public MyConnectionClass() {

	}

	public void saveEmployee(Employee emp) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
		factory.close();
	}

	public void updateEmployee(Employee emp) {

		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
		factory.close();
	}

	public void showListEmployee() {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		List<Employee> list = session.createQuery("from employee").list();
		  for(Employee e:list)
		  System.out.println(e.getEmpid()+" : "+e.getEname()+" : "+e.getSalary());
		 
		tx.commit();
		session.close();
		factory.close();
	}
	
	public void deleteEmployee(int id) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		Query qu =session.createQuery("Delete from employee where eid="+id);
		qu.executeUpdate();
		tx.commit();
		session.close();
		factory.close();
		
	}
}
