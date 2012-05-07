package com.jaxjug;

public class JavaSample {
	private static final String audience = "JaxJUG";

	public static String sayHello(String name) { 
		return "Hello, " + name + "!";
	}

	public static void main(String[] args) {
		System.out.println(sayHello(audience));
	}
}