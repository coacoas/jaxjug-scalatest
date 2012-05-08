package com.jaxjug.shared

import com.jaxjug.Stack
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

trait StackBehaviors {
  this: FlatSpec with ShouldMatchers =>
  def nonEmptyStack(newStack: => Stack[Int], lastItemAdded: Int) {

    it should "be non-empty" in {
      newStack should not be ('empty)
    }

    it should "return the top item on peek" in {
      newStack.peek should equal (lastItemAdded)
    }

    it should "not remove the top item on peek" in {
      val stack = newStack
      val size = stack.size
      stack.peek should equal (lastItemAdded)
      stack.size should equal (size)
    }

    it should "remove the top item on pop" in {
      val stack = newStack
      val size = stack.size
      stack.pop should equal (lastItemAdded)
      stack.size should equal (size - 1)
    }
  }

  def nonFullStack(newStack: => Stack[Int]) {

    it should "not be full" in {
      newStack should not be ('full)
    }

    it should "add to the top on push" in {
      val stack = newStack
      val size = stack.size
      stack.push(7)
      assert(stack.size === size + 1)
      assert(stack.peek === 7)
    }
  }
}