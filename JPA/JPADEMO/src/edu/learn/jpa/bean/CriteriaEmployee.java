package edu.learn.jpa.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author optimus
 *
 */
@Entity
public class CriteriaEmployee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private double salary;
	private String deg;

	/**
	 * @param eid
	 * @param ename
	 * @param salary
	 * @param deg
	 */
	public CriteriaEmployee(int eid, String ename, double salary, String deg) 
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
	}

	/**
	 * default constructor
	 */
	public CriteriaEmployee() 
	{
		super();
	}

	/**
	 * @return
	 */
	public int getEid() 
	{
		return eid;
	}

	/**
	 * @param eid
	 */
	public void setEid(int eid) 
	{
		this.eid = eid;
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
		return "Employee [eid = " + eid + ", ename = " + ename + ", salary = "
				+ salary + ", deg = " + deg + "]";
	}
}
