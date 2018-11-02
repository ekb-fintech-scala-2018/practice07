package fintech.lesson07.examples

object Example17Stream extends App {
  def fibonacciStream(n0: Int, n1: Int): Stream[Int] =
    n0 #:: fibonacciStream(n1, n0 + n1)

  val fibonacci: Stream[Int] = fibonacciStream(0, 1)

  println(fibonacci)
  println(fibonacci.take(10).toList)
  println(fibonacci(9))

  val evenFibonacci = fibonacci.filter(_ % 2 == 0)
  println(evenFibonacci.take(10).toList)
}
