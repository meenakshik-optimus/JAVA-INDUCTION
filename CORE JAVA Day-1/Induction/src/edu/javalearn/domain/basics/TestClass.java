package edu.javalearn.domain.basics;

public class TestClass {

	public static void main(String str[]) {

		/**
		 * An object of Ggsipu class is created
		 */
		University ggsipu = new Ggsipu();

		/**
		 * calling setName() method inherited from University
		 */
		ggsipu.setName("Ipu");

		/**
		 * conductExam() is called for Ggsipu class object
		 */
		ggsipu.conductExam();

		/**
		 * setName() method overloaded in Ggsipu
		 */
		Ggsipu university;
		university = (Ggsipu) ggsipu;
		university.setName(1, "GEC");

		/**
		 * calling getColDetail() method of class Ggsipu
		 */
		university.getColDetail();

		/**
		 * university.setLocation("Dwarka"); This will give error as setLocation
		 * is not defined for University class. So use reference variable of
		 * type Detailing
		 */
		Detailing detailGgsipu = (Ggsipu) ggsipu;
		detailGgsipu.setLocation("Dwarka");

		try {

			if (detailGgsipu.getLocation() == null) {

				throw new MyException();

			} else {

				System.out
						.println(" Location is " + detailGgsipu.getLocation());
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

		/**
		 * System.out.println(" Location is " +detailGgsipu.location); will not
		 * run as variable location is private
		 */
		University amity = new Amity();
		amity.setName("AMITY");

		/**
		 * calling overridden getName() method
		 */
		amity.getName();

		/**
		 * conductExam() is called for Amity class object
		 */
		amity.conductExam();

		Detailing detailAmity = (Amity) amity;

		/**
		 * getLocation() will throw exception as location is not set yet
		 */

		try {

			if (detailAmity.getLocation() == null) {

				throw new MyException();

			} else {

				System.out.println(" Location is " + detailAmity.getLocation());
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

		/**
		 * set the location of Amity class object
		 */
		detailAmity.setLocation("Noida");

		/**
		 * calling getLocation() method after setting the location
		 */

		try {

			if (detailAmity.getLocation() == null) {

				throw new MyException();

			} else {

				System.out.println(" Location is " + detailAmity.getLocation());
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

		/**
		 * System.out.println(" Location is " +detailAmity.location); variable
		 * location is private
		 */
	}

}
