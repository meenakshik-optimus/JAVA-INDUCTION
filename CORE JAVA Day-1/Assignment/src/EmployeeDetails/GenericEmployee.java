package EmployeeDetails;

/**
 * Abstract class declaration GenericEmployee class having two methods common to
 * all employee
 */
public abstract class GenericEmployee implements Calculation {

	/**
	 * final variable maximum leave for an employee
	 */
	final int MAX_LEAVES = 15;

	/**
	 * variables declaration
	 */
	private int salary;
	private int basic;
	private int houseRentAllowance;
	private int dearnessAllowance;
	public int leaveLeft;

	/**
	 * countLeaves() method declaration which counts the number of leaves of the
	 * employee
	 */
	public abstract int countLeaves();

	/**
	 * definition of claculate method() which calculate the salary of the
	 * employee.
	 */
	public int calculate() {
		salary = basic + houseRentAllowance + dearnessAllowance;
		return salary;
	}
}
