package edu.java.test.dataaccessobject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.java.test.beans.Employee;
import edu.java.test.beans.Guest;

public class GuestDAO {
	private Configuration configuration;
	private SessionFactory sessionFactory;
	private Session session;
	private Guest guest;
	static Logger log = Logger.getLogger(EmployeeDAO.class);

	public GuestDAO() {

		configuration = new Configuration();

		configuration.configure("hibernate.cfg.xml");

		/**
		 * create sessionfactory
		 */
		sessionFactory = configuration.buildSessionFactory();
		PropertyConfigurator.configure(this.getClass().getClassLoader()
				.getResource("log4j.properties"));
	}

	/**
	 * @param guestName
	 * @param password
	 */
	public void addGuestDetails(String guestName, String password) {
		try {
			log.info("Entering in method for adding guest...");
			/**
			 * Get Session object
			 */
			session = sessionFactory.openSession();

			/**
			 * Starting Transaction
			 */
			Transaction transaction = session.beginTransaction();
			guest = new Guest();
			guest.setGuestName(guestName);
			guest.setPassword(password);
			session.persist(guest);

			transaction.commit();
			session.close();
			System.out.println("\n\n Details Added in database \n");

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
