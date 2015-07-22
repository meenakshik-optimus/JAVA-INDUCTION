package edu.javalearn.domain.hibernateBean;

/**
 * @author optimus157
 *
 */

public class User {
	private int id;
	private String userName;
	private String password1;

	/**
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return
	 */
	public String getPassword1() {
		return password1;
	}

	/**
	 * @param password1
	 */
	public void setPassword1(String password1) {
		this.password1 = password1;
	}

}
