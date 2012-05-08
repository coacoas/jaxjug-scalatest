package com.jaxjug.simple

import org.scalatest._
import org.scalatest.matchers._
import java.util.{Stack => juStack}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class `Simple Functional Specification` extends FunSpec with ShouldMatchers with GivenWhenThen {
	describe ("A stack") {
		it ("should throw an exception when popping an empty stack") {
			given("An empty stack")
			val s = new juStack[Int]

			when("calling pop") 
			then("An exception is thrown") 
			evaluating(s.pop) should produce[java.util.EmptyStackException]
		}
		it ("should pop in lifo order") { 
			given("A non-empty stack")
			val s = new juStack[Int]
			s.push(1)
			s.push(2)
			val oldSize = s.size

			when ("calling pop") 
			val result = s.pop()

			then("it should retrieve the last element on the stack") 
			result should equal(2)

			and("the size should be reduced by one")
			s.size should equal (oldSize - 1)
		}
	} 
}