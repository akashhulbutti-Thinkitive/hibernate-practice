package com.akash.connections;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.akash.models.Dictionary;

public class DictionaryOperations {

	public void saveWord(String word,String meaning) {
		Dictionary di = new Dictionary(word, meaning);
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Dictionary.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		session.save(di);
		tx.commit();
		session.close();
		factory.close();
	}
	
	public List getAllWords() {
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Dictionary.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession(); 
		Transaction tx = session.beginTransaction();
		List<Dictionary> list = session.createQuery("From Dictionary").list();
		 for(Dictionary e:list)
			  System.out.println(e.getDid()+" : "+e.getWord()+" : "+e.getMeaning());
		tx.commit();
		session.close();
		factory.close();
		return list;
	}
}
