package edu.javalearn.domain.basics;

public abstract class University {

	private String name;

	/**
	 * getName() method of University class
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * setName() method of University class
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * abstract method conductExam()
	 */
	public abstract void conductExam();

}
