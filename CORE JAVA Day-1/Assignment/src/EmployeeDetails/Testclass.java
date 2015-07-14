package EmployeeDetails;

/**
 * This is testcalss having main method
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
	public static void main(String s[]) {

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
		sumit.setDetails(10000, 2500, 1500);
		nitish.setDetails(12000, 3500, 2000);
		abhay.setDetails(20000, 3500, 2500);
		parveen.setDetails(30000, 4500, 2000);

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
		System.out.println(" Leaves left in " + sumit.getName() + "'s account is "
				+ sumit.countLeaves());

		/**
		 * Employee sumit took leave for 2 days
		 */
		sumit.takeLeave(2);

		/**
		 * calling countLeaves() method to count the leaves for employee
		 */
		System.out.println(" Leaves left in " + nitish.getName() + "'s account is "
				+ nitish.countLeaves());

		/**
		 * Employee nitish took leave for 4 days
		 */
		nitish.takeLeave(4);

		/**
		 * calling countLeaves() method to count the leaves for employee
		 */
		System.out.println(" Leaves left in " + sumit.getName() + "'s account is "
				+ sumit.countLeaves());

		/**
		 * calling takeLeave() method
		 */
		sumit.takeLeave(2);

		/**
		 * using refeernce variable of GenericEmployee class but the objects are
		 * different
		 */
		GenericEmployee generic;

		/**
		 * assigning object E1 and E2 to ab one by one for the purpose of
		 * polymorphism
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
		sumit.takeLeave(12);
		nitish.countLeaves("Nitish");
		nitish.takeLeave(5);
	}
}
