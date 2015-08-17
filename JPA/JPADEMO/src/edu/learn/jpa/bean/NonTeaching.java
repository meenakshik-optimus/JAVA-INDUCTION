package edu.learn.jpa.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * 
 * @author optimus
 *
 */
@Entity
@DiscriminatorValue(value = "NT")
public class NonTeaching extends Staffss 
{
	private String areaexpertise;

	/**
	 * @param sid
	 * @param sname
	 * @param areaexpertise
	 */
	public NonTeaching(int sid, String sname, String areaexpertise) 
	{
		super(sid, sname);
		this.areaexpertise = areaexpertise;

	}

	/**
	 * default constructor
	 */
	public NonTeaching() 
	{
		super();
	}

	/**
	 * @return
	 */
	public String getAreaexpertise() 
	{
		return areaexpertise;
	}

	/**
	 * 
	 * @param areaexpertise
	 */
	public void setAreaexpertise(String areaexpertise) 
	{
		this.areaexpertise = areaexpertise;
	}
}
