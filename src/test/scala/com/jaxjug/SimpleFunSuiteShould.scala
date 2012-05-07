package com.jaxjug

import org.scalatest._
import org.scalatest.matchers._

import java.util.ArrayList


class SimpleFunSuiteShould extends FunSuite with ShouldMatchers { 
	test("Simple equality should pass with the same value") { 
		3 should equal (3)
		true should be (true)
	}

	test("Lots of testers for strings") { 
		"" should be ('empty)
		"scalatest" should startWith ("scala")
		"jaxjug" should include ("ax")
		"scalatest" should include regex ("""t.st""")
		"scala test" should fullyMatch regex ("scala\\s\\w+")
	}

	test("get() on an empty array list should produce IndexOutOfBoundsException") {
		evaluating { new ArrayList().get(2) } should produce[IndexOutOfBoundsException]
	}

	test("Hardcoded strings are referentially equal") { 
		val s = "test string"
		s should be theSameInstanceAs ("test string")
	}
}