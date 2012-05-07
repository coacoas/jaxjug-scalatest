package com.jaxjug;

object ScalaSample {
	def main(args: Array[String]) {
		def sayHello(name: String): String = {
			"Hello, %s!".format(name);
		}

		val audience = "JaxJUG";

		println(sayHello(audience));
	}
}