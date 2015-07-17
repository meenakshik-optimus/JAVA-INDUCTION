package edu.javalearn.domain.employeedetails;

public class Employee extends GenericEmployee {

	/**
	 * variables declaration
	 */
	private String name;
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
	public Employee(String name, int bonus) {
		leaveLeft = MAX_LEAVES;
		this.name = name;
		this.bonus = bonus;
	}

	/**
	 * constructor with only name as argument
	 * 
	 * @param name
	 */
	public Employee(String name) {
		leaveLeft = MAX_LEAVES;
		this.name = name;
	}

	/**
	 * getBasic() method returns the basic salary
	 * 
	 * @return
	 */
	public int getBasic() {
		return basic;
	}

	/**
	 * setBasic() method set the basic salary
	 * 
	 * @param basic
	 */
	public void setBasic(int basic) {
		this.basic = basic;
	}

	/**
	 * getHouseRentAllowance() method returns the houseRentAllowance
	 * 
	 * @return
	 */
	public int getHouseRentAllowance() {
		return houseRentAllowance;
	}

	/**
	 * setHouseRentAllowance() method set the houseRentAllowance
	 * 
	 * @param basic
	 */
	public void setHouseRentAllowance(int houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	/**
	 * getDearnessAllowance() method returns the dearnessAllowance
	 * 
	 * @return
	 */
	public int getDearnessAllowance() {
		return dearnessAllowance;
	}

	/**
	 * setDearnessAllowance() method set the dearnessAllowance
	 * 
	 * @param basic
	 */
	public void setDearnessAllowance(int dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
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
	 * implementation of overridden calculate() method
	 * @calculate()
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
	public void takeLeave(int leave) throws MyException {
		leaveLeft = leaveLeft - leave;
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
