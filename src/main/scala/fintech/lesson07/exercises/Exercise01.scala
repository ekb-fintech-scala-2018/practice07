package fintech.lesson07.exercises

import java.time.{DayOfWeek, LocalDate}

object Exercise01 {
  case class Person(name: String, birthDate: LocalDate)

  // Влияет ли день неледи, в который люди рождаются,
  // на первую букву имени? Собрать необходимую статистику

  val people = List(
    Person("Alice", LocalDate.of(1970, 1, 1)),
    Person("Bob", LocalDate.of(1981, 5, 12)),
    Person("Charlie", LocalDate.of(1982, 5, 11))
    // ...
  )

  def main(args: Array[String]): Unit = {
    //             день недели   инициал, процент
    val stats: Map[DayOfWeek, Map[String, Double]] = ???

    println(stats)
  }
}
