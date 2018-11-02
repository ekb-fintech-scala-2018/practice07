package fintech.lesson07.examples

import scala.annotation.tailrec

object Example13SeqPerformanceLinear extends Benchmark {

  var buffer: List[Int] = List.empty

  // to be used with LinearSeq
  @tailrec
  def printInts(seq: Seq[Int]): Unit = {
    if (seq.isEmpty) () else {
      val x = seq.head

      buffer = x :: buffer

      printInts(seq.tail)
      //      println(x)
    }
  }

  def main(args: Array[String]): Unit = {

    time(List.fill(10000)(0), printInts)
    time(List.fill(20000)(0), printInts)
    time(List.fill(40000)(0), printInts)

  }
}
