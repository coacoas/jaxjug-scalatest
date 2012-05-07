package com.jaxjug

import java.util.ArrayList

import org.scalatest._

class SimpleSuite extends Suite { 
	def testSimpleEquality = assert(3 === 3)

	def testException = intercept[IndexOutOfBoundsException] {
		new ArrayList().get(0)
	}
}
