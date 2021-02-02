package com.akash;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		et.begin();
		Employee emp = new Employee(999,"Akash",50000);
		em.persist(emp);
		et.commit();
		
		em.close();
		emf.close();

	}

}
