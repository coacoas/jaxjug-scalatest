package com.jaxjug.simple

import java.util.ArrayList
import org.scalatest.FunSuite

class SimpleFunSuite extends FunSuite { 

	test ("Simple equality should pass with the same value") {
		assert(3 === 3)
	}

	test ("get() on an empty array list should produce IndexOutOfBoundsException") {
		intercept[IndexOutOfBoundsException] {
			new ArrayList().get(0)
		}
	}
}
