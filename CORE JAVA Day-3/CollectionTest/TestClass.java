package CollectionTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

/**
 * enum declaration for Department
 */
enum Department {
	IT, Sales, Operations
}

/**
 * TestClass definition
 */
public class TestClass {

	/**
	 * variable declaration of Department type
	 */
	Department department;

	/**
	 * main starts here
	 * 
	 * @param s
	 * @throws IOException
	 */
	public static void main(String s[]) throws IOException {

		System.out.println("Enter the identity "
				+ "and name of employee line by line");

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		/**
		 * collections defined
		 */
		List<Employee> list = new ArrayList<Employee>();
		LinkedHashMap<Integer, Department> hashMap = new LinkedHashMap<Integer, Department>();

		/**
		 * Objects of Employee class are created and added to HashMap as well as
		 * ArrayList
		 */
		Employee sumit = new Employee(Integer.parseInt(bufferedReader
				.readLine()), bufferedReader.readLine(), Department.IT);

		hashMap.put(sumit.getIdentity(), sumit.getDepartment());

		list.add(sumit);

		Employee amit = new Employee(
				Integer.parseInt(bufferedReader.readLine()),
				bufferedReader.readLine(), Department.Sales);

		hashMap.put(amit.getIdentity(), amit.getDepartment());

		list.add(amit);

		Employee nitish = new Employee(Integer.parseInt(bufferedReader
				.readLine()), bufferedReader.readLine(), Department.Operations);

		hashMap.put(nitish.getIdentity(), nitish.getDepartment());

		list.add(nitish);

		Employee meenakshi = new Employee(Integer.parseInt(bufferedReader
				.readLine()), bufferedReader.readLine(), Department.Sales);

		hashMap.put(meenakshi.getIdentity(), meenakshi.getDepartment());

		list.add(meenakshi);

		/**
		 * variable count is declared to track the iteration index in
		 * employeeEntry
		 */
		int count = 0;
		
		System.out.println("The list of Employees not in Sales Department");

		for (Map.Entry<Integer, Department> employeeEntry : hashMap.entrySet()) {

			if ((employeeEntry.getValue()) == Department.Sales) {
				count++;
				continue;
			}

			System.out.print(employeeEntry.getKey() + " :: "
					+ employeeEntry.getValue());
			System.out.println(" :: " + list.get(count).getName());
			count++;
		}

	}

}
