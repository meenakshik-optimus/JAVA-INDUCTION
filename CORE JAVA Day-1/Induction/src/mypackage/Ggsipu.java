package mypackage;

//class declaration

public class Ggsipu extends University implements Detailing {

	/**
	 * variable declarations
	 */
	private String location;
	private int college_id;
	private String col_name;

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
	public void setName(int college_id, String col_name) {
		this.college_id = college_id;
		this.col_name = col_name;
	}

	/**
	 * getColDetail() method gives detail of college under university
	 */
	public void getColDetail() {
		System.out.println("college name is " + col_name
				+ " and college ID is " + college_id);
	}

	/**
	 * conductExam() implementation which gives the schedule of exam in
	 * university
	 */
	public void conductExam() {

		try {
			System.out.println("The exam is conducted in " + getName()
					+ " every three months");
		}

		catch (Exception e) {
			System.out.println("no name found");
		}

	}
}
