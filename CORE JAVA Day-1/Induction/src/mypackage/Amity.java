package mypackage;

public class Amity extends University implements Detailing {

	/**
	 * variable declaration
	 */
	private String location;
	private String uName;

	/**
	 * overridden getName() method
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
		if (location == null) {

			try {
				throw new MyException();
			}

			catch (MyException e) {
				System.out.println(e.getMessage());
			}

			finally {
				System.out.println("set location first");
			}
			return null;
		}

		else {
			return location;
		}

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
