package Threading;

/**
 * Class ResourceClass is defined which is having synchronized method
 */
public class ResourceClass {

	/**
	 * variable declaration
	 */
	private int resourceValue;

	/**
	 * synchronized method getResourceValue() is defined
	 * 
	 * @return
	 */
	public synchronized int getResourceValue() {
		return resourceValue;
	}

	/**
	 * synchronized method setresourceValue() is defined
	 * 
	 * @param resourceValue
	 */
	public synchronized void setResourceValue(int resourceValue) {
		this.resourceValue = resourceValue;
	}

}
