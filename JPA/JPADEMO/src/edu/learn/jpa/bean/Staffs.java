package edu.learn.jpa.bean;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

/**
 * 
 * @author optimus
 *
 */
@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Staffs implements Serializable 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;

	/**
	 * @param sid
	 * @param sname
	 */
	public Staffs(int sid, String sname) 
	{
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public Staffs() 
	{
		super();
	}

	/**
	 * @return
	 */
	public int getSid() 
	{
		return sid;
	}

	/**
	 * @param sid
	 */
	public void setSid(int sid) 
	{
		this.sid = sid;
	}

	/**
	 * @return
	 */
	public String getSname() 
	{
		return sname;
	}

	/**
	 * @param sname
	 */
	public void setSname(String sname) 
	{
		this.sname = sname;
	}

}
