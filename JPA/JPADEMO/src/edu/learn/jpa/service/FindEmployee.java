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
public class FindEmployee 
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
		 * employee is found out
		 */
		Employee employee = entitymanager.find(Employee.class, 302);

		System.out.println("employee ID = " + employee.getEid());
		System.out.println("employee NAME = " + employee.getEname());
		System.out.println("employee SALARY = " + employee.getSalary());
		System.out.println("employee DESIGNATION = " + employee.getDeg());
	}
}
