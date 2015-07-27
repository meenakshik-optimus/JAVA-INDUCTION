package edu.javalearn.domain.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "edu.javalearn.domain.webservice.HelloWorld")
public class HelloWorldImplementation implements HelloWorld {

	@Override
	public String getHelloWorldString(String name) {
		return "Hello" + name;
	}

}
