package exercises

import org.scalatest.matchers.must.Matchers.{be, convertToAnyMustWrapper}
import org.scalatest.wordspec.AnyWordSpec

class CustomersListViewSpec extends AnyWordSpec {
  val view = new CustomersListView(new CustomerService(new CustomerRepo))
  val customerIds = 27 to 35

  val expected = List("John Smith", "Peter Muller", "Hans Dampf")

  "Listing names for existing customers only" should {

    "using listExistingCustomersLangTryBased" in {
      view.listExistingCustomerNamesLangTryBased(customerIds) must be(expected)
    }

    "using listExistingCustomersTryBased" in {
      view.listExistingCustomerNamesTryBased(customerIds) must be(expected)
    }

    "using listExistingCustomersOptionBased" in {
      view.listExistingCustomerNamesOptionBased(customerIds) must be(expected)
    }
  }
}
