package fintech.lesson07.examples

import scala.collection.mutable

object Example04SyntaxOnMutableUpdate extends App {

  val myMap: mutable.Map[String, Int] = mutable.Map.empty

  myMap("todo") = 5
  myMap("inProgress") = 1

  println("myMap: " + myMap)

//  class Index {
//    var index: Map[String, Set[String]] = Map.empty.withDefaultValue(Set.empty)
//
//    def apply(word: String): Set[String] = index(word)
//    def update(word: String, document: String): Unit =
//      index += (word -> (index(word) + document))
//
//    override def toString: String = index.mkString("Index(", ", ", ")")
//  }
//
//  val index = new Index
//  index("some") = "Lorem ipsum"
//  index("some") = "Another text"
//
//  println(index)
}
