package edu.javalearn.domain.endpoint;

import javax.xml.ws.Endpoint;

import edu.javalearn.domain.webservice.HelloWorldImplementation;

public class HelloWorldPublisher {
	/**
	 * main() starts here
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Endpoint.publish("http://localhost:8282/Hello",
				new HelloWorldImplementation());
	}
}
