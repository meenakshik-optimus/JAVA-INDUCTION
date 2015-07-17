package edu.javalearn.domain.basics;

/**
 * interface declaration Detailing is an interface having setLocation() and
 * getLocation() method
 */
public interface Detailing {
	public void setLocation(String s);

	public String getLocation() throws MyException;
}
