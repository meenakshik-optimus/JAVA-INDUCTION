package edu.javalearn.domain.deadlock;

public class Deadlock {

	public static void main(String s[]) {

		/**
		 * ResourceClass objects are created
		 */
		ResourceClass resourceA = new ResourceClass();
		ResourceClass resourceB = new ResourceClass();

		/**
		 * MyFirstRunnable and MySecondRunnable objects are created
		 */
		MyFirstRunnable threadOneRunnable = new MyFirstRunnable(resourceA,
				resourceB);
		MySecondRunnable threadTwoRunnable = new MySecondRunnable(resourceA,
				resourceB);

		/**
		 * Thread class objects are created
		 */
		Thread threadOne = new Thread(threadOneRunnable);
		Thread threadTwo = new Thread(threadTwoRunnable);

		/**
		 * starting the Threads which automatically execute run() method
		 */
		threadOne.start();
		threadTwo.start();

	}

}
