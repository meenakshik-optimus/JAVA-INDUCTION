package edu.learn.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.learn.jpa.bean.NonTeaching;
import edu.learn.jpa.bean.Teaching;
/**
 * 
 * @author optimus
 *
 */
public class SaveEmployee 
{
	public static void main(String[] args) 
	{

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPADEMO");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		/**
		 * Teaching staff entity
		 */
		Teaching ts1 = new Teaching(1, "Gopal", "MSc MEd", "Maths");
		Teaching ts2 = new Teaching(2, "Manisha", "BSc BEd", "English");

		/**
		 * Non-Teaching Staff entity
		 */
		NonTeaching nts1 = new NonTeaching(3, "Satish", "Accounts");
		NonTeaching nts2 = new NonTeaching(4, "Krishna", "Office Admin");

		/**
		 * storing all entities
		 */
		entitymanager.persist(ts1);
		entitymanager.persist(ts2);
		entitymanager.persist(nts1);
		entitymanager.persist(nts2);

		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();
	}
}
