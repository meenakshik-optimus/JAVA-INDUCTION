package edu.javalearn.domain.hibernatedataaccess;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.javalearn.domain.hibernateBean.User;

public class UserDataAccess {
	private Configuration configuration;
	private SessionFactory sessionFactory;
	private Session session;
	private User user;

	public UserDataAccess() {
		configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		/**
		 * create sessionfactory
		 */
		sessionFactory = configuration.buildSessionFactory();
	}

	/**
	 * 
	 * @param userName
	 * @param password
	 *            This method is used to add details of user
	 */
	public void addUserDetails(String userName, String password) {
		try {

			/**
			 * Get Session object
			 */
			session = sessionFactory.openSession();

			/**
			 * Starting Transaction
			 */
			Transaction transaction = session.beginTransaction();
			user = new User();

			user.setUserName(userName);
			user.setPassword1(password);

			session.persist(user);

			transaction.commit();
			session.close();
			System.out.println("\n\n Details Added in database \n");

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * This method retrieves the object from database
	 */
	public void retrieve() {
		session = sessionFactory.openSession();

		/**
		 * Starting Transaction
		 */
		Transaction transaction = session.beginTransaction();

		user = (User) session.get(User.class, 1);
		System.out.print(user.getUserName());
		;
		transaction.commit();
		session.close();
	}
}
