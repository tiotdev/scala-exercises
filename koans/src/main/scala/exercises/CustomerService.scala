package exercises

import scala.util.{Failure, Success, Try}

case class CustomerNotFound(msg: String)

class CustomerService(repo: CustomerRepo) {

  type CustomerName = String

  def errorMessageNotFound(customerId: Int): String = s"Could not find a customer with id $customerId."

  def customerName(id: Int): CustomerName = repo.getCustomerName(id)

    /**
     * Use scala language try/catch to catch exceptions from underlying repo and translate to Option.
     * But only return None if a CustomerNotFoundException is thrown
     */
  def customerNameOption(id: Int): Option[CustomerName] = ??? // TODO

  /**
   * Use Try from Scala library (one liner). Simplification: Don't handle different exception types here.
   */
  def customerNameTry(id: Int): Try[CustomerName] = ??? // TODO

}
