package Threading;

/**
 * class MyFirstRunnable is defined which implements Runnable interface
 */
public class MyFirstRunnable implements Runnable {

	/**
	 * Reference variables of ResourceClass is declared as member variables of
	 * MyFirstRunnable
	 */
	private ResourceClass resourceA;
	private ResourceClass resourceB;

	/**
	 * constructor definition
	 * 
	 * @param resourceA
	 * @param resourceB
	 */
	MyFirstRunnable(ResourceClass resourceA, ResourceClass resourceB) {
		this.resourceA = resourceA;
		this.resourceB = resourceB;
	}

	/**
	 * run() method which calls synchronized methods
	 * resulting in deadlock
	 */
	public void run() {

		synchronized (resourceA) {

			    System.out.println("lock for resourceA is"
			    		+ " acquired by first thread");
			    resourceA.setResourceValue(25);

			synchronized (resourceB) {
				System.out.println("lock for resourceB is"
						+ " acquired by first thread");
				System.out.println(resourceB.getResourceValue());
			}

		}

	}

}
