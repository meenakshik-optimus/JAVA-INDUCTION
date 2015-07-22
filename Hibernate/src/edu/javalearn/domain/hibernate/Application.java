package edu.javalearn.domain.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Application {
	public static void main(String[] args) {

		/**
		 * creating session factory object
		 */
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory =configuration.buildSessionFactory();
		
		/**
		 * creating session object
		 */
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee sumit = new Employee();
		sumit.setId(1);
		sumit.setFirstName("Sumit");
		sumit.setLastName("sherwal");

		session.save(sumit);
		transaction.commit();
		session.close();

		System.out.println("Data successfully saved");

	}
}
