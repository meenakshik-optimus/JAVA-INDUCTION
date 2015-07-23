package edu.javalearn.domain.DataAccessObject;

import java.util.ArrayList;

import org.hibernate.*;
import org.hibernate.cfg.*;
import edu.javalearn.domain.hibernateMappingDemo.*;

public class UserDataAccess {

	public void AddDetails() {

		/**
		 * creating session object
		 */
		Session session = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		/**
		 * beginning of a transaction
		 */
		Transaction transaction = session.beginTransaction();
		/**
		 * creating Answer class objects
		 */
		Answer ansMeenakshi = new Answer();
		ansMeenakshi.setAnswerName("java is a programming language");
		ansMeenakshi.setPostedBy("Meenakshi");

		Answer ansManan = new Answer();
		ansManan.setAnswerName("java is a platform");
		ansManan.setPostedBy("Manan");

		Answer ansRishab = new Answer();
		ansRishab.setAnswerName("Servlet is an Interface");
		ansRishab.setPostedBy("Rishab");

		Answer ansNitish = new Answer();
		ansNitish.setAnswerName("Servlet is an API");
		ansNitish.setPostedBy("Nitish");
		/**
		 * Adding answer class objects into lists
		 */
		ArrayList<Answer> listJava = new ArrayList<Answer>();
		listJava.add(ansMeenakshi);
		listJava.add(ansManan);

		ArrayList<Answer> listServlet = new ArrayList<Answer>();
		listServlet.add(ansRishab);
		listServlet.add(ansNitish);

		/**
		 * creating Question class objects
		 */
		Question questionJava = new Question();
		questionJava.setQuestionName("What is Java?");
		questionJava.setAnswers(listJava);

		Question questionServlet = new Question();
		questionServlet.setQuestionName("What is Servlet?");
		questionServlet.setAnswers(listServlet);
		/**
		 * saving the object in database
		 */
		session.persist(questionJava);
		session.persist(questionServlet);

		transaction.commit();
		session.close();
		System.out.println("success");

	}

}