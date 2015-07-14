package mypackage;

public class Testclass {

	public static void main(String str[]) {

		/**
		 * An object of Ggsipu class is created
		 */
		University u1 = new Ggsipu();

		/**
		 * calling setName() method inherited from University
		 */
		u1.setName("Ipu");

		/**
		 * conductExam() is called for Ggsipu class object
		 */
		u1.conductExam();

		/**
		 * setName() method overloaded in Ggsipu
		 */
		Ggsipu u;
		u = (Ggsipu) u1;
		u.setName(1, "GEC");

		/**
		 * calling getColDetail() method of class Ggsipu
		 */
		u.getColDetail();

		/**
		 * u1.setLocation("Dwarka"); This will give error as setLocation is not
		 * defined for University class. So use reference variable of type
		 * Detailing
		 */
		Detailing d1 = (Ggsipu) u1;
		d1.setLocation("Dwarka");

		try {
			System.out.println(" Location is " + d1.getLocation());
		}

		catch (Exception e) {
			System.out.println("no location found");
		}

		/**
		 * System.out.println(" Location is " +d1.location); will not run as
		 * variable location is private
		 */

		University u2 = new Amity();
		u2.setName("AMITY");

		/**
		 * calling overridden getName() method
		 */
		u2.getName();

		/**
		 * conductExam() is called for Amity class object
		 */
		u2.conductExam();

		Detailing d2 = (Amity) u2;

		/**
		 * getLocation() will throw exception as location is not set yet
		 */
		System.out.println(" Location is " + d2.getLocation());

		/**
		 * set the location of Amity class object
		 */
		d2.setLocation("Noida");

		/**
		 * calling getLocation() method after setting the location
		 */
		System.out.println(" Location is " + d2.getLocation());

		/**
		 * System.out.println(" Location is " +d2.location); variable location
		 * is private
		 */

	}

}
