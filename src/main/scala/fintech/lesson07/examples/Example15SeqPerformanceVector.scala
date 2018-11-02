package fintech.lesson07.examples

object Example15SeqPerformanceVector extends App with Benchmark {

  time(Vector.fill(10000)(0), Example12SeqPerformanceIndexed.printInts)
  time(Vector.fill(20000)(0), Example12SeqPerformanceIndexed.printInts)
  time(Vector.fill(40000)(0), Example12SeqPerformanceIndexed.printInts)

  println

  time(Vector.fill(10000)(0), Example13SeqPerformanceLinear.printInts)
  time(Vector.fill(20000)(0), Example13SeqPerformanceLinear.printInts)
  time(Vector.fill(40000)(0), Example13SeqPerformanceLinear.printInts)

  println

  time(Vector.fill(10000)(0), Example14SeqPerformanceForeach.printInts)
  time(Vector.fill(20000)(0), Example14SeqPerformanceForeach.printInts)
  time(Vector.fill(40000)(0), Example14SeqPerformanceForeach.printInts)
}
