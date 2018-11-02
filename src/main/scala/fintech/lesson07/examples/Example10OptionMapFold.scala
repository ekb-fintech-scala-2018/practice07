package fintech.lesson07.examples

object Example10OptionMapFold extends App {

  val maybeValue: Option[Int] = Some(37)

  val maybeSquare = maybeValue.map(x => x * x)



  case class SubStructure(maybeValue: Option[Int])
  case class Structure(maybeSub: Option[SubStructure])
  val s = Structure(Some(SubStructure(Some(12))))

  val mv: Option[Int] = s.maybeSub.flatMap(_.maybeValue)

  val square = maybeValue.fold(0)(x => x * x)
  // val square = maybeValue.map(x => x * x).getOrElse(0)

  // map, flatMap: F[A] => F[B]
  // fold: F[A] => B

  println(square)
}
