object ContextBounds {

  trait Comparator[A] {
    def isOrdered(a1: A, a2: A): Boolean
  }

  object IntComparator extends Comparator[Int] {
    override def isOrdered(a1: Int, a2: Int): Boolean = if (a1 < a2) true else false
  }

  object DoubleComparator extends Comparator[Double] {
    override def isOrdered(a1: Double, a2: Double): Boolean = if (a1 < a2) true else false
  }

  // ---------------------------------------

  def orderPair[A](pair: (A, A))(implicit cp: Comparator[A]) = {
    if (cp.isOrdered(pair._1, pair._2)) pair else pair.swap
  }

  def orderPairList[A : Comparator](list: List[(A, A)]) = {
    for {pair <- list} yield orderPair(pair)
  }

  // ----------------------------------------
  // TODO: Exercise 3 - return what is needed for test no 4 to succeed
  def provideRequiredImplicit = ???
}