package edu.javalearn.domain.springDemo;

public class Employee {
	private int id;
	private String name;
	private Address address;

	/**
	 * Constructor definition
	 * 
	 * @param id
	 * @param name
	 * @param address
	 */
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	/**
	 * show() method for showing the details of employee
	 */
	void show() {
		System.out.println(id + " " + name);
		System.out.println(address.toString());
	}

}
