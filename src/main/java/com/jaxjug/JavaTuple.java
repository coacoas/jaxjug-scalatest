package com.jaxjug;

import scala.Tuple2;

public class JavaTuple {
	private static final Tuple2<String, String> name = new Tuple2<String, String>("Bill", "Carlson");
	
	public String getFirstName() { 
		return (name._1);
	}

	public String getLastName() {
		return(name._2);
	}
}
