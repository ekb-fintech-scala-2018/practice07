package fintech.lesson07.examples

object Example22ToMap extends App {

  val traversable = Traversable(1, 2, 3)

//   traversable.toMap

//  trait <::<[A, +B] extends (A => B)
//  implicit def sameType[A]: A <::< A = new <::<[A, A] { override def apply(v1: A): A = v1 }
//
//  trait T[A] {
//    def toMap[T, U](implicit ev: A <::< (T, U)): Map[T, U]
//  }
//
//  val tt: T[(Int, String)] = new T[(Int, String)] {
//    val value: (Int, String) = (1, "one")
//
//    override def toMap[T, U](implicit ev: (Int, String) <::< (T, U)): Map[T, U] = {
//      val (u, t) = value
//
//      Map(u -> t)
//    }
//  }
//
//  val map = tt.toMap
//  println(map)
}
