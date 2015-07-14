package ThreadLifeCycle;

import java.io.*;

/**
 * Class MyThreads definition
 */
public class MyThreads implements Runnable {

	/**
	 * variables declaration
	 */
	FileWriter filewriter = TestClass.filewriter;
	String name;

	/**
	 * constructor definition
	 * 
	 * @param name
	 */
	MyThreads(String name) {
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
			filewriter.write("Run by " + Thread.currentThread().getName()
					+ " \n");
			filewriter.flush();
		}

		catch (IOException exception) {}
		
	}

}
