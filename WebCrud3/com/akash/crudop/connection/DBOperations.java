package com.akash.crudop.connection;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.akash.crudop.model.Employee;

public class DBOperations {
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

	public List showListEmployee() {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		List list = session.createQuery("FROM Employee").list(); 
//		List<Employee> list = session.createQuery("SELECT a FROM Employee a", Employee.class).getResultList(); ;
		 		 
		tx.commit();
		session.close();
		factory.close();
		return list;
	}
	
	public void deleteEmployee(String id) {
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
	
	public Employee getEmployeeForId(int id) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		List list =session.createQuery("select * from employee where eid="+id).list();
		Employee emp = null;
		if(!list.isEmpty()) {
			emp=(Employee)list.get(0);
		}
		tx.commit();
		session.close();
		factory.close();
		return emp;
	}
}
