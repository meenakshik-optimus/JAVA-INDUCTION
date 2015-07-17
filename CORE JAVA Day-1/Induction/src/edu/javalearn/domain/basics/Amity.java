package edu.javalearn.domain.basics;

public class Amity extends University implements Detailing {

	/**
	 * variable declaration
	 */
	private String location;
	private String uName;

	/**
	 * overridden @getName() method
	 */
	public String getName() {
		uName = "Deemed university " + super.getName();
		return uName;
	}

	/**
	 * getLocation() implementation which gives the location of the university
	 * 
	 * @return
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * setLocation() implementation which sets the location of the university
	 * 
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * conductExam() implementation which gives the schedule of exam in
	 * university
	 */
	public void conductExam() {
		System.out.println("The exam is conducted in " + uName
				+ " every six months");
	}
}
