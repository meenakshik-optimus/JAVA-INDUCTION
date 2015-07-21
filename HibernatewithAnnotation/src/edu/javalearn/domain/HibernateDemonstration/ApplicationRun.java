package edu.javalearn.domain.HibernateDemonstration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ApplicationRun {
	public static void main(String[] args) {

		/**
		 * creating session factory object
		 */
		SessionFactory sessionFactory = new AnnotationConfiguration()
				.configure().buildSessionFactory();

		/**
		 * creating session object
		 */
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		Employee sumit = new Employee();
		sumit.setId(1);
		sumit.setFirstName("Sumit");
		sumit.setLastName("sherwal");

		session.save(sumit);
		session.getTransaction().commit();
		session.close();

		System.out.println("successfully saved");

	}
}
