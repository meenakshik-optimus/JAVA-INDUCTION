package edu.javalearn.domain.CollectionTest;

/**
 * class Employee declaration
 */
public class Employee implements Comparable<Employee> {

	/**
	 * variables declaration
	 */
	private int identity;
	private String name;
	private Department department;

	/**
	 * Constructor definition
	 * 
	 * @param identity
	 * @param name
	 * @param department
	 */
	public Employee(int identity, String name, Department department) {
		this.identity = identity;
		this.name = name;
		this.department = department;
	}

	/**
	 * getIdentity() method which returns identity
	 * 
	 * @return
	 */
	public int getIdentity() {
		return identity;
	}

	/**
	 * getName() method which returns name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * getDepartment() method which returns department
	 * 
	 * @return
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * Overriding of equals() method
	 */
	public boolean equals(Object o) {

		if ((o instanceof Employee) && (((Employee) o).name == name)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * overriding of hashCode() method
	 */
	public int hashCode() {
		return name.length();
	}

	/**
	 * overriding toString() method
	 */
	public String toString() {
		return name + " " + identity + " " + department;
	}

	/**
	 * implementing compareTo() method of Comparable interface to sort by
	 * identity
	 */
	public int compareTo(Employee employee) {
		return new Integer(identity).compareTo(new Integer(employee
				.getIdentity()));
	}
}
