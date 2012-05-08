package com.jaxjug;

object ScalaSample extends App {
	def sayHello(name: String) = "Hello, %s!".format(name);

	val audience = "JaxJUG";

	println(sayHello(audience));
}