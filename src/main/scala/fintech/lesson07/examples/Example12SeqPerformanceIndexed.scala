package fintech.lesson07.examples

object Example12SeqPerformanceIndexed extends Benchmark {

  var buffer: List[Int] = List.empty

  // to be used with IndexedSeq
  def printInts(seq: Seq[Int]): Unit = {
    var i = 0

    while (i < seq.size) {
      val x = seq(i)

      buffer = x :: buffer
      //      println(x)

      i += 1
    }
  }

  def main(args: Array[String]): Unit = {
    time(Array.fill(10000)(0), printInts)
    time(Array.fill(20000)(0), printInts)
    time(Array.fill(40000)(0), printInts)
  }
}

trait Benchmark {
  def time[A, R](prep: Seq[Int], block: Seq[Int] => R): R = {
    val t0 = System.nanoTime()
    val result = block(prep)
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) / 1000000 + "ms")
    result
  }
}
