package edu.javalearn.domain.springDemo;

public class Address {
	private String city;
	private String state;
	private String country;

	/**
	 * Constructor definition
	 * 
	 * @param city
	 * @param state
	 * @param country
	 */
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	/**
	 * toString() method overridden
	 */
	public String toString() {
		return "city is:" + city + ".Stste is: " + state + ".Country is:"
				+ country;
	}

}
