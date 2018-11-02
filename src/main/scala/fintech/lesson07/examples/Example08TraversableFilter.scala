package fintech.lesson07.examples

import scala.collection.mutable.ArrayBuffer

object Example08TraversableFilter extends App {

  // изменение структуры на основе filter

  val array = Array.tabulate(5)(i => i)

//  var buffer = new ArrayBuffer[Int] // больше нет оптимизации с размером
//
//  var i = 0
//  while (i < array.length) {
//    if (array(i) % 2 == 0) {
//      buffer.append(array(i))
//    }
//    i += 1
//  }
//
//  val evenInts = buffer.toArray

  val evenInts = array.filter(x => x % 2 == 0)

  println(evenInts.mkString("Array(", ", ", ")"))
}
