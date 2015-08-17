package edu.learn.jpa.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author optimus
 *
 */
@Entity
@Table
@NamedQuery(query = "Select e from Employee e where e.eId = :id", name = "find employee by id")

public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eId;
	private String ename;
	private double salary;
	private String deg;

	 @OneToOne
	   private Department department;
	/**
	 * @param eId
	 * @param ename
	 * @param salary
	 * @param deg
	 *            constructor definition
	 */
	public Employee(int eId, String ename, double salary, String deg) 
	{
		super();
		this.eId = eId;
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
	}

	/**
	 * Default constructor
	 */
	public Employee() 
	{
		super();
	}

	/**
	 * @return
	 */
	public int getEid() 
	{
		return eId;
	}

	/**
	 * @param eId
	 */
	public void setEid(int eId) 
	{
		this.eId = eId;
	}

	/**
	 * @return
	 */
	public String getEname() 
	{
		return ename;
	}

	/**
	 * @param ename
	 */
	public void setEname(String ename) 
	{
		this.ename = ename;
	}

	/**
	 * @return
	 */
	public double getSalary() 
	{
		return salary;
	}

	/**
	 * @param salary
	 */
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	/**
	 * @return
	 */
	public String getDeg() 
	{
		return deg;
	}

	/**
	 * @param deg
	 */
	public void setDeg(String deg) 
	{
		this.deg = deg;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "Employee [eId=" + eId + ", ename=" + ename + ", salary="
				+ salary + ", deg=" + deg + "]";
	}
	
	public Department getDepartment() {
	      return department;
	   }

	   public void setDepartment(Department department) {
	      this.department = department;
	   }	
}
