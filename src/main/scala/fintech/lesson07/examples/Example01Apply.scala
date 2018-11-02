package fintech.lesson07.examples

object Example01Apply extends App {

  val fromInt: Int => String = Seq("todo", "inProgress", "review", "testing", "done")

  println(s"State with code 1 is ${fromInt(1)}")
//  println(s"State with code 10 is ${fromInt(10)}")


  val beforeReview: String => Boolean = Set("todo", "inProgress")

  val state = "inProgress"
  if (beforeReview(state))
    println(s"State '$state' is before 'review'")
  else println(s"State '$state' is *after* 'review'")


  val countByState: String => Int = Map("todo" -> 10, "inProgress" -> 1)

  println(s"Count by state 'todo' is ${countByState("todo")}")
  // println(s"Count by state 'review' is ${countByState("review")}")
}
