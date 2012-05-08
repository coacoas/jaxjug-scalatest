/**
 *
 */
package com.jaxjug.property

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.prop.PropertyChecks
import com.jaxjug.Container

/**
 * @author bcarlson
 *
 */
class PropertyTest extends FlatSpec with ShouldMatchers with PropertyChecks {
  ignore should "ignore" in {
    "A container" should "store any given value" in {
      forAll { (s: String) =>
        new Container(s).getValue should equal(s)
      }
    }

    ignore should "generate identical hash codes for the same contained value" in {
      forAll { (n: Int) =>
        new Container(n).## should equal(new Container(n).##)
      }
    }
    
    
  }
}