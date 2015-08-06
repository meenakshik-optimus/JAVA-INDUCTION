package edu.learn.test.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import edu.java.test.beans.Employee;

public class WriteToCsv {

	/**
	 * Delimiter used in CSV file
	 */

	private static final String COMMA_DELIMITER = ",";

	private static final String NEW_LINE_SEPARATOR = "\n";

	/**
	 * CSV file header
	 */

	private static final String FILE_HEADER = "id,firstName,lastName,address,phoneNumber,emailAddress";

	public static int writeCsvFile(String fileName, List list) {

		List<Employee> employees = list;

		FileWriter fileWriter = null;

		try {

			fileWriter = new FileWriter(fileName);

			/**
			 * Write the CSV file header
			 */

			fileWriter.append(FILE_HEADER.toString());

			/**
			 * Add a new line separator after the header
			 */

			fileWriter.append(NEW_LINE_SEPARATOR);

			/**
			 * Write a new student object list to the CSV file
			 */

			for (Employee employee : employees) {

				fileWriter.append(String.valueOf(employee.getId()));

				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(employee.getFirstName());

				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(employee.getLastName());

				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(employee.getAddress());

				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(employee.getPhoneNumber());

				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(String.valueOf(employee.getEmailAddress()));

				fileWriter.append(NEW_LINE_SEPARATOR);

			}

			System.out.println("CSV file was created successfully !!!");

		} catch (Exception exception) {

			exception.printStackTrace();

		} finally {

			try {

				fileWriter.flush();

				fileWriter.close();

			} catch (IOException exception) {
				exception.printStackTrace();

			}

		}
		return 1;
	}

}
