package edu.javalearn.domain.Application;

import edu.javalearn.domain.DataAccessObject.UserDataAccess;

public class Application {
	/**
	 * main() method starts
	 * 
	 * @param string
	 */
	public static void main(String string[]) {
		UserDataAccess userDataAccess = new UserDataAccess();
		userDataAccess.AddDetails();
	}
}
