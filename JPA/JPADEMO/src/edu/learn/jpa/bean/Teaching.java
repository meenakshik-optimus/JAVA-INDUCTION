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
@DiscriminatorValue(value = "TS")
public class Teaching extends Staffss 
{
	private String qualification;
	private String subjectexpertise;

	/**
	 * @param sid
	 * @param sname
	 * @param qualification
	 * @param subjectexpertise
	 */
	public Teaching(int sid, String sname,

	String qualification, String subjectexpertise) 
	{
		super(sid, sname);
		this.qualification = qualification;
		this.subjectexpertise = subjectexpertise;
	}

	public Teaching() {
		super();
	}

	/**
	 * @return
	 */
	public String getQualification() 
	{
		return qualification;
	}

	/**
	 * @param qualification
	 */
	public void setQualification(String qualification) 
	{
		this.qualification = qualification;
	}

	/**
	 * @return
	 */
	public String getSubjectexpertise() 
	{
		return subjectexpertise;
	}

	/**
	 * @param subjectexpertise
	 */
	public void setSubjectexpertise(String subjectexpertise) 
	{
		this.subjectexpertise = subjectexpertise;
	}
}
