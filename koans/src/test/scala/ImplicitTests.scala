import Mocks._
import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers._

import scala.Console.in

class ImplicitTests extends AnyFlatSpec {
  "Implicit conversions" should "be used" in {
    import ImplicitConversions._
    "abcdefg".toUpper must be("ABCDEFG")
  }

  "Implicit conversions" should "also be used" in {
    import ImplicitConversions._
    val rs = RichString("abcdefg")
    rs.length() must be(7)
  }

  "Implicit parameters" should "be used" in {
    import MathConstants._
    ImplicitParameters.calculateCircumference(2.0) must be(12.5663604976)
  }

  "Context bounds" should "be used" in {
    implicit val cp = ContextBounds.provideRequiredImplicit
    ContextBounds.orderPairList((1,2) :: (2,1) :: Nil) must be((1,2) :: (1,2) :: Nil)
  }

  "Factorial of 3" should "be computed at compile time" in {
    import ImplicitFactorial._
    val test: FacN[_3,_6] = fac(_3) //This is the test
  }

}
