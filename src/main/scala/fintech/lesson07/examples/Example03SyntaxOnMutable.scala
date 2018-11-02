package fintech.lesson07.examples

import scala.collection.mutable

object Example03SyntaxOnMutable extends App {

  var myMap: Map[String, Int] = Map.empty
//  val myMap: mutable.Map[String, Int] = mutable.Map.empty
//  var myMap: mutable.Map[String, Int] = mutable.Map.empty

  myMap += ("todo" -> 5)
  myMap += ("inProgress" -> 1)

  println("myMap: " + myMap)

  val newMap = myMap + ("done" -> 1)
  println("newMap: " + newMap)
  println("myMap: " + myMap)
}
