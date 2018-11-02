package fintech.lesson07.examples


object Example07TraversableMap extends App {

  // map, применение функции к значениям

  val array = Array.tabulate(5)(i => i)

  var squares = new Array[Int](array.length) // yay, выделили массив нужного размера

  // настолько распространен, что имеет собственный синтаксис в большинстве языков
  var i = 0
  while (i < array.length) {
    val square = array(i) * array(i)
    squares(i) = square
    i += 1
  }

//   val squares = array.map(x => x * x)

  println(squares.mkString("Array(", ", ", ")"))
}
