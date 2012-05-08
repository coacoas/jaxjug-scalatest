package com.jaxjug.shared

import com.jaxjug.Stack
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class SharedTestExampleSpec extends FlatSpec with ShouldMatchers with StackBehaviors {
  ignore should "ignore" in {
    import SharedTestExampleSpec._

    "A Stack (when empty)" should "be empty" in {
      emptyStack should be('empty)
    }

    it should "complain on peek" in {
      intercept[IllegalStateException] {
        emptyStack.peek
      }
    }

    it should "complain on pop" in {
      intercept[IllegalStateException] {
        emptyStack.pop
      }
    }

    "A Stack (with one item)" should behave like nonEmptyStack(stackWithOneItem, lastValuePushed)

    it should behave like nonFullStack(stackWithOneItem)

    "A Stack (with one item less than capacity)" should behave like nonEmptyStack(stackWithOneItemLessThanCapacity, lastValuePushed)

    it should behave like nonFullStack(stackWithOneItemLessThanCapacity)

    "A Stack (full)" should "be full" in {
      fullStack should be('full)
    }

    it should behave like nonEmptyStack(fullStack, lastValuePushed)

    it should "complain on a push" in {
      intercept[IllegalStateException] {
        fullStack.push(10)
      }
    }
  }
}

object SharedTestExampleSpec {
  // Stack fixture creation methods
  def emptyStack = new Stack[Int]

  def fullStack = {
    val stack = new Stack[Int]
    for (i <- 0 until stack.MAX)
      stack.push(i)
    stack
  }

  def stackWithOneItem = {
    val stack = new Stack[Int]
    stack.push(9)
    stack
  }

  def stackWithOneItemLessThanCapacity = {
    val stack = new Stack[Int]
    for (i <- 1 to 9)
      stack.push(i)
    stack
  }

  val lastValuePushed = 9
}
