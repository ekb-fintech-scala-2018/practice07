package fintech.lesson07.examples

import java.time.LocalDate

import fintech.lesson07.exercises.Exercise01.Person

object Example18View extends App {
  val people = List.tabulate(100)(i => Person("Daniel", LocalDate.of(1970, 1, 1).plusDays(i)))

  val maybeDaniel = people//.view
    .map { p =>
      println(s"Converting $p")
      p.copy(name = s"${p.name} '${p.name}' ${p.name}")
    }
    .find(p => p.birthDate.compareTo(LocalDate.of(1970, 2, 1)) >= 0)

  println(maybeDaniel)
}
