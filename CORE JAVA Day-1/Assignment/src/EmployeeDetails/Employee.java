package EmployeeDetails;

public class Employee extends GenericEmployee {

	/**
	 * variables declaration
	 */
	public String name;
	private int salary;
	private int basic;
	private int houseRentAllowance;
	private int dearnessAllowance;
	private int bonus = 0;

	/**
	 * constructor with one argument as name and other as bonus
	 * 
	 * @param name
	 * @param bonus
	 */
	Employee(String name, int bonus) {
		leaveLeft = MAX_LEAVES;
		this.name = name;
		this.bonus = bonus;
	}

	/**
	 * constructor with only name as argument
	 * 
	 * @param name
	 */
	Employee(String name) {
		leaveLeft = MAX_LEAVES;
		this.name = name;
	}

	/**
	 * getName method returns the name of the employee
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * setDetails() method for setting details about salary
	 * 
	 * @param basic
	 * @param houseRentAllowance
	 * @param dearnessAllowance
	 */
	public void setDetails(int basic, int houseRentAllowance,
			int dearnessAllowance) {
		this.basic = basic;
		this.houseRentAllowance = houseRentAllowance;
		this.dearnessAllowance = dearnessAllowance;
	}

	/**
	 * implementation of overridden calculate() method
	 */
	public int calculate() {
		this.salary = basic + houseRentAllowance + dearnessAllowance + bonus;
		return salary;
	}

	/**
	 * takeLeave() method which maintains the leave left in the account and will
	 * throw an exception if leave demand exceeds the leave left in the account
	 * 
	 * @param leave
	 */
	public void takeLeave(int leave) {
		leaveLeft = leaveLeft - leave;

		try {

			if (leaveLeft < 0) {
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

	/**
	 * countLeave method which returns the numbers of leaves left in account
	 */
	public int countLeaves() {
		return leaveLeft;
	}

	/**
	 * overloading countLeaves method() which counts the number of leaves in the
	 * account of employee using name of employee
	 * 
	 * @param name
	 */
	public void countLeaves(String name) {
		String EmpName = name;
		System.out.println(" The leaves in " + EmpName + "'s account is "
				+ leaveLeft);
	}
}
