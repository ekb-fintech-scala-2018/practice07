package fintech.lesson07.examples

object Example16Range extends App {
  val range1 = 1 to 100
  val range2 = Range(1, 100)

  val range3 = List(1, 2, 3).indices

//  val list = List(???)
//  for (i <- list.indices) { // O(N)
//    val x = list(i) // O(N)
//  }

//  for ((x, i) <- list.zipWithIndex) { // O(N)
//    // x == value, i == index // O(1)
//  }

  println(range1)
  println(range1.tail)

  val r/*: ???*/ = range1.filter(_ % 2 == 0)
//  println(r)
}
