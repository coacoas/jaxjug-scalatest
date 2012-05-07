# ScalaTest

---
# Who is this guy? 

## Bill Carlson

* Senior Software Engineer at [BridgeGate International][1]
* Professional Software Engineer for ~20 years
* Amateur Geek for much longer than that
* Worked in C / Python / C++ / Perl / Ada
* Started working in Java in 1999
* Discovered Scala in 2011
* Oh, yeah... also father, husband, and marathoner
    * <small>Ask me about Jeff Galloway Training Programs!</small>

[1]: http://www.bridgegateintl.com
---
# What is ScalaTest?

*ScalaTest is an open-source test framework for the Java Platform designed to increase your productivity by letting you write fewer lines of test code and more clearly reveal your intent.*

-- From <http://www.scalatest.org>

## What does that mean? 

---
# What does ScalaTest get me? 

--- 
# Scala!

* Not going to go over all the benefits of Scala
* Need to go over some things
  * Basic Syntax
    * Hello JaxJug
    * val/var/def
    * no semicolons
  * Function Literals
    * passing functions
  * Classes and Traits
    * multiple inheritance
    * traits have implementation
  * DSL!
  * Java Interop

--- 
# Flexibility

* TDD
    * Suite
    * FunSuite
* BDD
    * FunSpec
    * FeatureSpec
    * WordSpec
    * FreeSpec

--- 
# Additional Traits

* Matchers
    * ShouldMatchers
    * MustMatchers

---
# ScalaTest for TDD

Using Suite: 

    !scala
    import org.scalatest._

    class SimpleSuite extends Suite {
      def testSimpleEquality = assert(3 === 3) 
    }

Output (sbt):

    [info] SimpleSuite:
    [info] - testSimpleEquality

That's great, but how is it better than JUnit? 

* Quite a bit, actually!

---
# ScalaTest for TDD

Using FunSuite: 

    !scala
    import org.scalatest._

    class SimpleFunSuite extends FunSuite {
      test("Simple equality should pass with the same value") { 
        assert(3 === 3)
      }
    }

Output

    [info] SimpleFunSuite:
    [info] - Simple equality should pass with the same value
