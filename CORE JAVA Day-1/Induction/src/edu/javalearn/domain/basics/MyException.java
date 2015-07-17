package edu.javalearn.domain.basics;

public class MyException extends Exception {

	/**
	 * constructor for MyException class
	 */
	MyException() {
		super("The location for the university is not available,set location first");
	}
}
