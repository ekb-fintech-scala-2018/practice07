package fintech.lesson07.examples

object Example05Traversable extends App {

  val t: Traversable[Int] = Traversable(1, 2, 3) // apply для создания (всех коллекциях)

  t.foreach(x => println(x))

}
