package mypackage;

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
		university = (Ggsipu)ggsipu;
		university.setName(1, "GEC");

		/**
		 * calling getColDetail() method of class Ggsipu
		 */
		university.getColDetail();

		/**
		 * university.setLocation("Dwarka"); This will give error as setLocation is not
		 * defined for University class. So use reference variable of type
		 * Detailing
		 */
		Detailing detailOne = (Ggsipu)ggsipu;
		detailOne.setLocation("Dwarka");

		try {
			System.out.println(" Location is " + detailOne.getLocation());
		}

		catch (Exception e) {
			System.out.println("no location found");
		}

		/**
		 * System.out.println(" Location is " +detailOne.location); will not run as
		 * variable location is private
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

		Detailing detailTwo = (Amity)amity;

		/**
		 * getLocation() will throw exception as location is not set yet
		 */
		System.out.println(" Location is " + detailTwo.getLocation());

		/**
		 * set the location of Amity class object
		 */
		detailTwo.setLocation("Noida");

		/**
		 * calling getLocation() method after setting the location
		 */
		System.out.println(" Location is " + detailTwo.getLocation());

		/**
		 * System.out.println(" Location is " +detailTwo.location); variable location
		 * is private
		 */

	}

}
