package com.tec.HibernateThirdChinnu;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
    	
    	Question q1 = new Question();
    	q1.setQno(10);
    	q1.setQuestion("what is your name");
    	
    	Answere a1 = new Answere();
    	a1.setAnsno(20);
    	a1.setAnswere("My name is sujatha");
    	
    	Answere a2 = new Answere();
    	a2.setAnsno(21);
    	a2.setAnswere("My name is sam");
    	
    	Answere a3 = new Answere();
    	a3.setAnsno(22);
    	a3.setAnswere("My name is Suzuki");
    	
    	
    	List<Answere> list = new ArrayList<Answere>();
    	list.add(a1);
    	list.add(a2);
    	list.add(a3);
    	
    	q1.setAnswere(list);
    	
    	Transaction tx = session.beginTransaction();
    	
    	session.save(q1);
    	
    	tx.commit();
    	
    	
    	
    }
}
