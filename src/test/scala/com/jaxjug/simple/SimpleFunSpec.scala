package com.jaxjug.simple

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.path.FreeSpec
import org.scalatest.GivenWhenThen
import org.scalatest.prop.PropertyChecks

class SimpleFunSpec extends FreeSpec with ShouldMatchers with PropertyChecks {
  "A string" - {
    val s = "a string"
    "when surrounded by any number of spaces" - {
      val spaced = (" " * 6) + s + (" " * 13)
      "should be at least as long as the original" in {
        info ("long")
        spaced.length should be >= s.length
      }
      
      "and trimmed" - {
        info("trim")
        val trimmed = (spaced).trim()
        "results in the original string" in {
          trimmed should be(s)
        }
      }
    }
  }
}