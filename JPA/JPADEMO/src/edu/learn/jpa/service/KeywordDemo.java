package edu.learn.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.learn.jpa.bean.Employee;

public class KeywordDemo 
{
	public static void main(String[] args) 
	{

		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("JPADEMO");
		EntityManager entitymanager = emfactory.createEntityManager();
		Query query = entitymanager
				.createQuery("SELECT e FROM Employee e WHERE e.salary BETWEEN 25000 AND 40000");
		List<Employee> list = (List<Employee>) query.getResultList();

		/**
		 * BETWEEN keyword
		 */
		for (Employee employee : list) 
		{
			System.out.print("Employee ID :" + employee.getEid());
			System.out.println("\t Employee salary :" + employee.getSalary());
		}

		/**
		 * LIKE keyword
		 */
		Query query1 = entitymanager.createQuery("SELECT e "
				+ "FROM Employee e " + "WHERE e.ename LIKE '%i%'");

		List<Employee> list1 = (List<Employee>) query1.getResultList();

		for (Employee e : list1) 
		{
			System.out.print("Employee ID :" + e.getEid());
			System.out.println("\t Employee name :" + e.getEname());
		}
		Query query2 = entitymanager.createQuery("SELECT e "
				+ "FROM Employee e " + "ORDER BY e.ename ASC");

		List<Employee> list2 = (List<Employee>) query2.getResultList();

		for (Employee e : list2) {
			System.out.print("Employee ID :" + e.getEid());
			System.out.println("\t Employee Name :" + e.getEname());
		}
	}
}
