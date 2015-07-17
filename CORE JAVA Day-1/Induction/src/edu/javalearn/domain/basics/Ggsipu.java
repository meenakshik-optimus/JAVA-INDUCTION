package edu.javalearn.domain.basics;

//class declaration

public class Ggsipu extends University implements Detailing {

	/**
	 * variable declarations
	 */
	private String location;
	private int collegeId;
	private String colName;

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
	 * setName() method is overloaded to set the name of college under
	 * university
	 * 
	 * @param num
	 * @param s
	 */
	public void setName(int collegeId, String colName) {
		this.collegeId = collegeId;
		this.colName = colName;
	}

	/**
	 * getColDetail() method gives detail of college under university
	 */
	public void getColDetail() {
		System.out.println("college name is " + colName + " and college ID is "
				+ collegeId);
	}

	/**
	 * conductExam() implementation which gives the schedule of exam in
	 * university
	 */
	public void conductExam() {
		System.out.println("The exam is conducted in " + getName()
				+ " every three months");

	}
}
