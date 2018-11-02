package fintech.lesson07.examples

import scala.collection.mutable.ArrayBuffer

object Example09TraversableFold extends App {

  // любой обход можно абстрагировать через fold

  val array = Array.tabulate(5)(i => i)

  var sumOfEvenSquares = 0

  var i = 0
  while (i < array.length) {
    if (array(i) % 2 == 0)
      sumOfEvenSquares += array(i) * array(i)

    i += 1
  }

//   val sumOfEvenSquares = array.foldLeft(0) { (a, n) =>
//     if (n % 2 == 0)
//       a + n * n
//     else a
//   }

  println(sumOfEvenSquares)
}
