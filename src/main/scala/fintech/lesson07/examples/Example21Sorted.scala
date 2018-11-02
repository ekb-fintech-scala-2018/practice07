package fintech.lesson07.examples

import java.time.LocalDate

import fintech.lesson07.exercises.Exercise01.Person

object Example21Sorted extends App {

  val ints = List(2, 1, 3)

  ints.sorted

  val people = List(
    Person("Alice", LocalDate.of(1970, 1, 1)),
    Person("Bob", LocalDate.of(1981, 5, 12)),
    Person("Charlie", LocalDate.of(1982, 5, 11))
  )

//   people.sorted

//   implicit val peopleOrdering: Ordering[Person] = new Ordering[Person] {
//     override def compare(x: Person, y: Person): Int = x.name.compare(y.name)
//   }
//   people.sorted

//   implicit val peopleOrdering: Ordering[Person] = Ordering.by(_.name)
//   people.sorted

//   people.sortBy(_.name)

}
