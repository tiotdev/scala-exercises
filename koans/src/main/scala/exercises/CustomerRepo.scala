package exercises

class CustomerRepo {
  def getCustomerName(id: Int) = id match {
    case 27 => "John Smith"
    case 28 => "Peter Muller"
    case 29 => "Hans Dampf"
    case _ => throw new CustomerNotFoundException
  }
}

case class CustomerNotFoundException(msg: String = "customer not found") extends Exception
