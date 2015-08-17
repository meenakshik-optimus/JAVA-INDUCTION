package edu.learn.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.learn.jpa.bean.CriteriaEmployee;


/**
 * 
 * @author optimus
 *
 */
public class CreateEmployee 
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
		 * employee object created
		 */
		CriteriaEmployee employee = new CriteriaEmployee();

		/**
		 * setting the values of employee's property
		 */
		employee.setEid(302);
		employee.setEname("minu");
		employee.setSalary(25000);
		employee.setDeg("SET");

		
		/**
		 * employee object created
		 */
		CriteriaEmployee employee1 = new CriteriaEmployee();

		/**
		 * setting the values of employee's property
		 */
		employee1.setEid(303);
		employee1.setEname("mixu");
		employee1.setSalary(20000);
		employee1.setDeg("SE");
		
		/**
		 * employee object created
		 */
		CriteriaEmployee employee2 = new CriteriaEmployee();

		/**
		 * setting the values of employee's property
		 */
		employee2.setEid(304);
		employee2.setEname("meenu");
		employee2.setSalary(35000);
		employee2.setDeg("SET");
		entitymanager.persist(employee);
		entitymanager.persist(employee1);
		entitymanager.persist(employee2);
		
		/**
		 * transaction committed
		 */
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();
	}
}
