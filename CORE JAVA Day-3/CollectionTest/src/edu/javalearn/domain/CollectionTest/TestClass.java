package edu.javalearn.domain.CollectionTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collections;

/**
 * TestClass definition
 */
public class TestClass {

	Department department;

	/**
	 * main starts here
	 * 
	 * @param s
	 * @throws IOException
	 */
	public static void main(String s[]) throws IOException {

		System.out.println("Enter the identity, "
				+ " name of employee and department name line by line");

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		/**
		 * collections defined
		 */
		List<Employee> list = new ArrayList<Employee>();
		LinkedHashMap<Integer, Department> linkedHashMap = new LinkedHashMap<Integer, Department>();

		/**
		 * Objects of Employee class are created and added to HashMap as well as
		 * ArrayList
		 */
		for (int number = 1; number < 5; number++) {
			Employee employee = new Employee(Integer.parseInt(bufferedReader
					.readLine()), bufferedReader.readLine(),
					Department.valueOf(bufferedReader.readLine()));
			linkedHashMap.put(employee.getIdentity(), employee.getDepartment());
			list.add(employee);
		}

		/**
		 * variable count is declared to track the iteration index in
		 * employeeEntry
		 */
		int count = 0;

		System.out.println("The list of Employees not in Sales Department");

		for (Map.Entry<Integer, Department> employeeEntry : linkedHashMap
				.entrySet()) {

			if ((employeeEntry.getValue()) == Department.Sales) {
				count++;
				continue;
			}

			System.out.print(employeeEntry.getKey() + " :: "
					+ employeeEntry.getValue());
			System.out.println(" :: " + list.get(count).getName());
			count++;
		}

		/**
		 * calling sort() method to sort the list collection
		 */
		Collections.sort(list);
		System.out.println("Sorted list of employees by identity is:");
		System.out.println(list);
	}

}
