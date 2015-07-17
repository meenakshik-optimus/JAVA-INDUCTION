package edu.javalearn.domain.employeedetails;

/**
 * This is testClass having main method
 * 
 * @author optimus157
 *
 */
public class TestClass {

	/**
	 * main() method starts
	 * 
	 * @param s
	 */
	public static void main(String string[]) {

		/**
		 * objects of Employee class are created
		 */
		Employee sumit = new Employee("Sumit", 1000);
		Employee nitish = new Employee("Nitish", 500);
		Employee abhay = new Employee("Abhay");
		Employee parveen = new Employee("Parveen");

		/**
		 * setting the salary details of employees
		 */
		sumit.setBasic(10000);
		sumit.setHouseRentAllowance(1500);
		sumit.setDearnessAllowance(1000);

		nitish.setBasic(12000);
		nitish.setHouseRentAllowance(2500);
		nitish.setDearnessAllowance(1000);

		abhay.setBasic(14000);
		abhay.setHouseRentAllowance(3000);
		abhay.setDearnessAllowance(2000);

		parveen.setBasic(14000);
		parveen.setHouseRentAllowance(3000);
		parveen.setDearnessAllowance(2000);

		/**
		 * calling getName() and calculate() method on employee objects
		 */
		System.out.println(" Salary of " + sumit.getName() + " is "
				+ sumit.calculate());
		System.out.println(" Salary of " + nitish.getName() + " is "
				+ nitish.calculate());
		System.out.println(" Salary of " + abhay.getName() + " is "
				+ abhay.calculate());
		System.out.println(" Salary of " + parveen.getName() + " is "
				+ parveen.calculate());

		/**
		 * counting the leave before taking the leave
		 */
		System.out.println(" Leaves left in " + sumit.getName()
				+ "'s account is " + sumit.countLeaves());

		/**
		 * Employee sumit took leave for 2 days
		 */
		try {
			sumit.takeLeave(2);
			if (sumit.leaveLeft < 0) {
				throw new MyException(); // Exception thrown
			} else {
				System.out.println(" Leave granted");
			}

		}

		catch (MyException e) {
			System.out.println(" Leave cannot be granted.");
		}

		finally {
			System.out.println("Check balanced leave in your account First "
					+ "before requesting for leave.");
		}

		/**
		 * calling countLeaves() method to count the leaves for employee
		 */
		System.out.println(" Leaves left in " + nitish.getName()
				+ "'s account is " + nitish.countLeaves());

		/**
		 * Employee nitish took leave for 4 days
		 */
		try {
			nitish.takeLeave(4);
			if (nitish.leaveLeft < 0) {
				throw new MyException(); // Exception thrown
			} else {
				System.out.println(" Leave granted");
			}

		}

		catch (MyException e) {
			System.out.println(" Leave cannot be granted.");
		}

		finally {
			System.out.println("Check balanced leave in your account First "
					+ "before requesting for leave.");
		}

		/**
		 * calling countLeaves() method to count the leaves for employee
		 */
		System.out.println(" Leaves left in " + sumit.getName()
				+ "'s account is " + sumit.countLeaves());

		/**
		 * Employee sumit took leave for 2 days
		 */
		try {
			sumit.takeLeave(2);
			if (sumit.leaveLeft < 0) {
				throw new MyException(); // Exception thrown
			} else {
				System.out.println(" Leave granted");
			}

		}

		catch (MyException e) {
			System.out.println(" Leave cannot be granted.");
		}

		finally {
			System.out.println("Check balanced leave in your account First "
					+ "before requesting for leave.");
		}

		/**
		 * using reference variable of GenericEmployee class but the objects are
		 * different
		 */
		GenericEmployee generic;

		/**
		 * assigning object sumit and nitish to GenericEmployee one by one for
		 * the purpose of polymorphism
		 */
		generic = sumit;
		System.out.println(" Salary of " + sumit.getName() + " is "
				+ generic.calculate());
		generic = nitish;
		System.out.println(" Salary of " + nitish.getName() + " is "
				+ generic.calculate());

		/**
		 * calling overloaded countLeaves() method
		 */
		sumit.countLeaves("Sumit");

		/**
		 * Employee sumit took leave for 12 days
		 */
		try {
			sumit.takeLeave(12);
			if (sumit.leaveLeft < 0) {
				throw new MyException(); // Exception thrown
			} else {
				System.out.println(" Leave granted");
			}

		}

		catch (MyException e) {
			System.out.println(" Leave cannot be granted.");
		}

		finally {
			System.out.println("Check balanced leave in your account First "
					+ "before requesting for leave.");
		}
		nitish.countLeaves("Nitish");

		/**
		 * Employee nitish took leave for 2 days
		 */
		try {
			nitish.takeLeave(2);
			if (nitish.leaveLeft < 0) {
				throw new MyException(); // Exception thrown
			} else {
				System.out.println(" Leave granted");
			}

		}

		catch (MyException e) {
			System.out.println(" Leave cannot be granted.");
		}

		finally {
			System.out.println("Check balanced leave in your account First "
					+ "before requesting for leave.");
		}
	}
}
