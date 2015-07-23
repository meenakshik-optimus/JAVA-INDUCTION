package edu.javalearn.domain.hibernateBean;

/**
 * @author optimus157
 *
 */

public class User {
	private int id;
	private String userName;
	private String password;

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
	public String getPassword() {
		return password;
	}

	/**
	 * @param password1
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
