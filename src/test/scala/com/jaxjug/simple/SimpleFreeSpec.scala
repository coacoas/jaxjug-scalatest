package com.jaxjug.simple

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.path.FreeSpec
import org.scalatest.GivenWhenThen
import org.scalatest.prop.PropertyChecks

class SimpleFreeSpec extends FreeSpec with ShouldMatchers with PropertyChecks {
  "A string" - {
    val s = "a string"
    "when surrounded by any number of spaces" - {
      val spaced = (" " * 6) + s + (" " * 13)
      "should be at least as long as the original" in {
        spaced.length should be >= s.length
      }
      
      "and trimmed" - {
        val trimmed = (spaced).trim()
        "results in the original string" in {
          trimmed should be(s)
        }
      }
    }
  }
}