package com.chahar.webservice;

import java.util.Date;


//@WebService(endpointInterface = "com.chahar.webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name + " at "+ new Date() ;
	}

}