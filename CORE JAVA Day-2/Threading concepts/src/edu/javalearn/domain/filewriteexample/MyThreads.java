package edu.javalearn.domain.filewriteexample;

import java.io.*;

/**
 * Class MyThreads definition
 */
public class MyThreads implements Runnable {

	/**
	 * variables declaration
	 */
	private FileWriter fileWriter = TestClass.fileWriter;
	private String name;

	/**
	 * constructor definition
	 * 
	 * @param name
	 */
	public MyThreads(String name) {
		this.name = name;
	}

	/**
	 * run() method definition which writes the data in the file
	 */
	public void run() {

		/**
		 * try and catch block as the write() method throws IOException
		 */
		try {
			fileWriter.write("Run by " + Thread.currentThread().getName()
					+ " \n");
			fileWriter.flush();
		}

		catch (IOException exception) {
		}

	}

}
