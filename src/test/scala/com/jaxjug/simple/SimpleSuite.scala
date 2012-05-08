package com.jaxjug.simple

import java.util.ArrayList
import org.scalatest.Suite

class SimpleSuite extends Suite { 
	def testSimpleEquality = assert(3 === 3)

	def testException = intercept[IndexOutOfBoundsException] {
		new ArrayList().get(0)
	}
}
