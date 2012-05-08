package com.jaxjug.simple

import java.util.ArrayList
import org.scalatest.Suite

class SimpleSuite extends Suite { 
	def ignoreTestSimpleEquality = assert(3 === 3)

	def ignoreTestException = intercept[IndexOutOfBoundsException] {
		new ArrayList().get(0)
	}
}
