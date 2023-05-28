package org.simplilearn.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.simplilearn.app.entities.Emp;

public class Test {

	public static void main(String[] args) {

		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		/*
		 * Transaction tx=session.beginTransaction(); try { Emp e=new Emp();
		 * e.setName("Ankit"); e.setAddress("Hyd"); session.save(e); tx.commit(); }
		 * catch (Exception e) { tx.rollback(); } session.close();
		 */
        Emp e=session.load(Emp.class,2);
        System.out.println(e.getEno()+"\t" +e.getName()+"\t" +e.getAddress());
	    session.close();
	}
	
}
