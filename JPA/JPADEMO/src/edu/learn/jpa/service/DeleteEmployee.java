package edu.learn.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.learn.jpa.bean.Employee;

/**
 * 
 * @author optimus
 *
 */
public class DeleteEmployee 
{

	/**
	 * main method starts here
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{

		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("JPADEMO");
		EntityManager entitymanager = emfactory.createEntityManager();

		/**
		 * transaction begins here
		 */
		entitymanager.getTransaction().begin();

		/**
		 * employee which is to be deleted is found out
		 */
		Employee employee = entitymanager.find(Employee.class, 301);

		/**
		 * employee is deleted from database
		 */
		entitymanager.remove(employee);

		/**
		 * transaction committed
		 */
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
}
