package Threading;

/**
 * class MySecondRunnable is defined which implements Runnable interface
 */
public class MySecondRunnable implements Runnable {

	/**
	 * Reference variables of ResourceClass is declared as member variables of
	 * MySecondRunnable
	 */
	private ResourceClass resourceA;
	private ResourceClass resourceB;

	/**
	 * constructor definition
	 * 
	 * @param resourceA
	 * @param resourceB
	 */
	MySecondRunnable(ResourceClass resourceA, ResourceClass resourceB) {
		this.resourceA = resourceA;
		this.resourceB = resourceB;
	}

	/**
	 * run() method which calls synchronized methods
	 * resulting in deadlock
	 */
	public void run() {

		synchronized (resourceB) {

			System.out.println("lock for resourceB "
					+ "is acquired by second thread");
			resourceB.setResourceValue(35);

			synchronized (resourceA) {
				System.out.println("lock for resourceA is"
						+ " acquired by second thread");
				System.out.println(resourceA.getResourceValue());

			}

		}

	}

}
