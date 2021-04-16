import Koans._
import org.scalatest.funsuite.AnyFunSuite

class KoansTest extends AnyFunSuite {
  test("returns the given string in reverse") {
    assert(reverse("abcd") === "dcba")
    assert(reverse("Hello World") === "dlroW olleH")
  }

  test("checks if a given string is a palindrome, ignoring case and punctuation") {
    assert(isPalindrome("Madam I'm Adam") === true)
    assert(isPalindrome("Not a Palindrome") === false)
  }

  test("returns the element at the nth position in a list") {
    assert(nth(List("a", "w", "4", "7"), 2) === "4")
    assert(nth(List("Scala", "koans", "are", "fun"), 1) === "koans")
  }

  test("returns the first n numbers in the Fibonacci sequence") {
    assert(fibonacci(3) === List(1, 1, 2))
    assert(fibonacci(6) === List(1, 1, 2, 3, 5, 8))
    assert(fibonacci(8) === List(1, 1, 2, 3, 5, 8, 13, 21))
  }

  test("returns only the odd numbers in a sequence") {
    assert(onlyOdd(List(1,2,3,4,5,6)) === List(1,3,5))
  }

  test("zips two lists together to form a map") {
    assert(zipMap(List("Hello", "World"), List("Hallo", "Welt")) === Map("Hello" -> "Hallo", "World" -> "Welt"))
  }
}
