package edu.learn.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.learn.jpa.bean.Department;
import edu.learn.jpa.bean.Employee;

public class OneToOne 
{
	/**
	 * main starts here
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{

		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("JPADEMO");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		/**
		 * Create Department Entity
		 */
		Department department = new Department();
		department.setName("Development");

		/**
		 * Store Department
		 */
		entitymanager.persist(department);

		/**
		 * Create Employee Entity
		 */
		Employee employee = new Employee();
		employee.setEname("Satish");
		employee.setSalary(45000.0);
		employee.setDeg("Technical Writer");
		employee.setDepartment(department);

		Employee employee1 = new Employee();
		employee1.setEname("Manish");
		employee1.setSalary(25000.0);
		employee1.setDeg("Technical support");
		employee1.setDepartment(department);

		/**
		 * Store Employee
		 */
		entitymanager.persist(employee);
		entitymanager.persist(employee1);

		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
}
