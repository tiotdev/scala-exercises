import scala.Seq

object Koans {

  def reverse(s: String): String = s.reverse;

  def isPalindrome(s: String): Boolean = {
    val regexedInput: String =
      s.replaceAll("\\s", "").replaceAll("'", "").toLowerCase

    if(regexedInput == regexedInput.reverse){
      true
    }
    else{
      false
    }
  }

  def nth(listOfString: Seq[String], index: Int): String = listOfString(index)

  def fibonacci(number: Int): List[Int] = ???
//  {
//    val fibRange = 1 to number
//    println(fibRange)
////    val out = fibRange.map(n )
//  }

  def onlyOdd(listOfInt: Seq[Int]): Seq[Int] = listOfInt.filter(x => (x % 2) != 0)

  def zipMap(listOfKeys: Seq[String], listOfValues: Seq[String]): Map[String, String] = Map() ++ (listOfKeys zip listOfValues)

}
