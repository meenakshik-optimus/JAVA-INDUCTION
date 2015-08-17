package edu.learn.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.learn.jpa.bean.Employee;

/**
 * 
 * @author optimus
 *
 */
public class NamedQuery 
{
	public static void main(String[] args) 
	{

		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("JPADEMO");
		EntityManager entitymanager = emfactory.createEntityManager();
		Query query = entitymanager.createNamedQuery("find employee by id");

		query.setParameter("id", 302);
		List<Employee> list = query.getResultList();

		for (Employee employee : list) 
		{
			System.out.print("Employee ID :" + employee.getEid());
			System.out.println("\t Employee Name :" + employee.getEname());
		}
	}
}
