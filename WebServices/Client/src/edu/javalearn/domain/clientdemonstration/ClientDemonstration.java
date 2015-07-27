package edu.javalearn.domain.clientdemonstration;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Client to use web services
 * 
 * @author optimus157
 *
 */

public class ClientDemonstration {

	/**
	 * main() starts here
	 * 
	 * @param args
	 * @throws Exception
	 */

	public static void main(String[] args) throws Exception {

		BufferedReader bufferedReader = null;

		String url = "http://localhost:8282/Hello?wsdl";

		URL object = new URL(url);

		HttpURLConnection connection = (HttpURLConnection) object
				.openConnection();

		connection.setRequestMethod("POST");

		connection.setRequestProperty("Content-Type", "text/xml");

		String urlParameters;

		StringBuilder stringBuilder = new StringBuilder();

		bufferedReader = new BufferedReader(new FileReader(
				"soaprequesthello.txt"));

		connection.setDoOutput(true);

		DataOutputStream writer = new DataOutputStream(
				connection.getOutputStream());

		while ((urlParameters = bufferedReader.readLine()) != null) {
			stringBuilder.append(urlParameters);

		}
		String data = stringBuilder.toString();

		System.out.println(data);

		data = data.replace("name", "Meenakshi");

		writer.writeBytes(data);

		writer.flush();
		writer.close();

		int responseCode = connection.getResponseCode();
		System.out.println("Response Code: " + responseCode);

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				connection.getInputStream()));

		String input;
		StringBuffer response = new StringBuffer();
		while ((input = reader.readLine()) != null) {

			response.append(input);
		}

		reader.close();

		System.out.println(response.toString());

		bufferedReader.close();
	}
}
