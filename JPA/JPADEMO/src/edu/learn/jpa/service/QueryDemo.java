package edu.learn.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * 
 * @author optimus
 *
 */
public class QueryDemo {
	public static void main(String args[]) 
	{

		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("JPADEMO");
		EntityManager entitymanager = emfactory.createEntityManager();
		Query query;
		/**
		 * Scalar function
		 */
		query = entitymanager
				.createQuery("SELECT UPPER(emp.ename) FROM Employee emp");
		List<String> list = query.getResultList();

		for (String emp : list) 
		{
			System.out.println("Employee NAME :" + emp);
		}

		/**
		 * Aggregate function
		 */
		query = entitymanager
				.createQuery("SELECT MAX(e.salary) FROM Employee e");
		Double result = (Double) query.getSingleResult();
		System.out.println("Max Employee Salary :" + result);
	}
}
