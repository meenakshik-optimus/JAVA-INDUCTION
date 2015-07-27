package edu.javalearn.domain.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {

	@WebMethod
	String getHelloWorldString(String name);

}
