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
public class UpdateEmployee 
{

	/**
	 * main method starts here
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPADEMO");

		EntityManager entitymanager = emfactory.createEntityManager();

		/**
		 * transaction begins here
		 */
		entitymanager.getTransaction().begin();
		Employee employee = entitymanager.find(Employee.class, 302);

		/**
		 * before update
		 */
		System.out.println(employee);
		employee.setSalary(30000);
		/**
		 * transaction committed
		 */
		entitymanager.getTransaction().commit();

		/**
		 * after update
		 */
		System.out.println(employee);
		entitymanager.close();
		emfactory.close();
	}
}
