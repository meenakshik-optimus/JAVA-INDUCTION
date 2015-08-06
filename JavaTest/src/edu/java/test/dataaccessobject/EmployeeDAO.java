package edu.java.test.dataaccessobject;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.java.test.beans.Employee;
import edu.learn.test.controller.AddressBookDetails;


public class EmployeeDAO {
	
	private Configuration configuration;
	private SessionFactory sessionFactory;
	private Session session;
	private Employee employee;
	//static Logger log = Logger.getLogger(EmployeeDAO.class);
	public EmployeeDAO() {
		configuration = new Configuration();
		
		configuration.configure("hibernate.cfg.xml");

		/**
		 * create sessionfactory
		 */
		sessionFactory = configuration.buildSessionFactory();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param phoneNumber
	 * @param address
	 * @param emailAddress
	 */
	public int addEmployee(String firstName,String lastName, String address,String phoneNumber,String emailAddress) {
		int status=0;
		try {

			/**
			 * Get Session object
			 */
			session = sessionFactory.openSession();

			/**
			 * Starting Transaction
			 */
			Transaction transaction = session.beginTransaction();
			employee = new Employee();
			employee.setFirstName(firstName);
			employee.setLastName(lastName);
			employee.setPhoneNumber(phoneNumber);
			employee.setAddress(address);
			employee.setEmailAddress(emailAddress);
			session.persist(employee);

			transaction.commit();
			status=1;
			session.close();
			System.out.println("\n\n Details Added in database \n");

		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public List<Employee> getDetails() {
		//log.info("Entering in method for getting details of employee...");
		//ropertyConfigurator.configure(this.getClass().getClassLoader().getResource("log4j.properties"));
		
		/**
		 * Get Session object
		 */
		session = sessionFactory.openSession();
		
		/**
		 * Starting Transaction
		 */
		Transaction transaction = session.beginTransaction();

		Query query = session.createQuery("FROM Employee");

		List<Employee> lists = (List<Employee>) query.list();

		transaction.commit();

		session.close();

		return (lists);

	

}
	public List<Employee> searchEmployee(String lastName) {
		 List employees= null;
		try{
		/**
		 * Get Session object
		 */
		session = sessionFactory.openSession();
		
		/**
		 * Starting Transaction
		 */
		Transaction transaction = session.beginTransaction();
			 
			 
			  transaction= session.beginTransaction();
			   Query query  = session.createQuery("FROM User  WHERE lastName like :lastName");
			   query.setParameter("lastName", "%"+lastName+"%");
			   employees = query.list();
			  /** for(Iterator iterator = users.iterator();iterator.hasNext();){
			    Employee employee = (Employee) iterator.next();
			    System.out.println("FIRST_NAME: "+employee.getFirstName());
			    System.out.println("LAST_NAME: "+employee.getLastName());
			    System.out.println(employee.getEmail());
			   }
			   */
			  }catch(HibernateException hibernateException){
			   
			     hibernateException.printStackTrace();
			  }
			  
			  return employees;
			 }
	
	public int deleteEmployee(String firstName,int id) {
		
		int result = 0;
		
		try {

			/**
			 * Get Session object
			 */
			session = sessionFactory.openSession();

			/**
			 * Starting Transaction
			 */
			Transaction transaction = session.beginTransaction();
			String hql = "DELETE FROM Employee WHERE id = :id AND firstName = :firstName";
			Query query = session.createQuery(hql);
			query.setParameter("id", id);
			query.setParameter("firstName", firstName);
			
			result = query.executeUpdate();
			transaction.commit();

		} catch (HibernateException exception) {

			exception.printStackTrace();

			result = 0;
		}
		return result;
	
	}
	
}
