package com.jaxjug.simple

import java.util.ArrayList
import org.scalatest.FunSuite

class SimpleFunSuite extends FunSuite { 

	ignore ("Simple equality should pass with the same value") {
		assert(3 === 3)
	}

	ignore ("get() on an empty array list should produce IndexOutOfBoundsException") {
		intercept[IndexOutOfBoundsException] {
			new ArrayList().get(0)
		}
	}
}
