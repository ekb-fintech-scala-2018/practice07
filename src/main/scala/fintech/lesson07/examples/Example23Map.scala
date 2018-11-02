package fintech.lesson07.examples

import scala.collection.generic.CanBuildFrom

object Example23Map extends App {

  val myMap: Map[Int, String] = Map(1 -> "one", 2 -> "two", 3 -> "three")

  val mapped1 = myMap.map { case (k, v) => (k + k, v) }

  val mapped2 = myMap.map { case (k, v) => s"$k=$v" }

//  trait T[A, Repr] {
//    def map[B, That](f: A => B)(implicit bf: CanBuildFrom[Repr, B, That]): That
//  }
//
//  trait M[K, V] extends T[(K, V), M[K, V]]
//
//  val m = new M[Int, String] {
//    override def map[B, That](f: ((Int, String)) => B)(
//      implicit bf: CanBuildFrom[M[Int, String], B, That]): That = ???
//  }

}
