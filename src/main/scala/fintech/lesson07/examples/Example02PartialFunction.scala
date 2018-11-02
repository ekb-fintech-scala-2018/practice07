package fintech.lesson07.examples

object Example02PartialFunction extends App {

  val partialFromInt: PartialFunction[Int, String] =
    Seq("todo", "inProgress", "review", "testing", "done")
  val liftedFromInt: Int => Option[String] =
    Seq("todo", "inProgress", "review", "testing", "done").lift

  println(s"State with code 1 is ${liftedFromInt(1)}")
  println(s"State with code 10 is ${liftedFromInt(10)}")

  println(s"State with code 2 is ${partialFromInt.lift(2)}")

  val partialCountByState: PartialFunction[String, Int] = Map("todo" -> 10, "inProgress" -> 1)
  val liftedCountByState: String => Option[Int] = Map("todo" -> 10, "inProgress" -> 1).lift
  val getMethod: String => Option[Int] = Map("todo" -> 10, "inProgress" -> 1).get

  println(s"Count by state 'todo' is ${liftedCountByState("todo")}")
  println(s"Count by state 'review' is ${liftedCountByState("review")}")

  println(s"Count by state 'done' is ${getMethod("done")}")
}
