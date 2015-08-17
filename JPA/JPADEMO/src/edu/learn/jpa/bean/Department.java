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
public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;

	/**
	 * @return
	 */
	public int getId() 
	{
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) 
	{
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * @param deptName
	 */
	public void setName(String deptName) 
	{
		this.name = deptName;
	}
}
