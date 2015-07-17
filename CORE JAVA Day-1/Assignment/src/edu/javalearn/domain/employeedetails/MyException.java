package edu.javalearn.domain.employeedetails;

public class MyException extends Exception {

	/**
	 * constructor for MyException class
	 */
	public MyException() {
		super(" The number of leaves you demanded "
				+ "exceeds the maximum leave left in your account");
	}
}
