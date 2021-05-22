package exercises

import org.scalatest.matchers.must.Matchers.{be, convertToAnyMustWrapper}
import org.scalatest.wordspec.AnyWordSpec

import scala.util.{Failure, Success}

class CustomerServiceSpec extends AnyWordSpec {
  val sut = new CustomerService(new CustomerRepo)
  val customerIds = 27 to 35

  "get a customer name from the repo" should {

    "using try/catch and Option" in {
      sut.customerNameOption(27) must be(Some("John Smith"))
      sut.customerNameOption(30) must be(None)
    }

    "using the Try monad" in {
      sut.customerNameTry(27) must be(Success("John Smith"))
      sut.customerNameTry(30).isFailure must be(true)
    }

  }
}
