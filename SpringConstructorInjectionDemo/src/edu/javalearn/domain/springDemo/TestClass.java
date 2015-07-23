package edu.javalearn.domain.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class TestClass {

	/**
	 * main() starts here
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employee meenakshi = (Employee) factory.getBean("employee");
		meenakshi.show();

	}
}
