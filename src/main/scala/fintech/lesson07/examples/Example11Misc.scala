package fintech.lesson07.examples

object Example11Misc extends App {

  val array = Array.tabulate(100)(i => i)

  val byLastDigit = array.groupBy(n => n % 10)

  val sorted = array.sortBy(n => (n - 5) * (n - 3))

  val (even, odd) = array.partition(n => n % 2 == 0)

  val sliding = array.sliding(3)
  // A(0, 1, 2), A(1, 2, 3), A(2, 3, 4), ...
}
