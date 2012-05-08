package com.jaxjug.simple

import org.scalatest._
import org.scalatest.matchers._

class SimpleFunSpec extends FunSpec with ShouldMatchers { 
	describe ("An empty string") {
		val s = ""
		it("should have length 0") { 
			s.length should equal (0)
		}
		it("should throw IndexOutOfBounds attempting to read any character") {
			evaluating {s.charAt(2)} should produce[IndexOutOfBoundsException]
		}
	}
	describe ("A one-character string") {
	 	val s = "a"
	 	it ("should have length 1") {
	 		s.length should be (1) 
	 	}
	}
}