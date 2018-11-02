package fintech.lesson07.examples

object Example14SeqPerformanceForeach extends Benchmark {

  var buffer: List[Int] = List.empty

  def printInts(seq: Seq[Int]): Unit = {
    seq.foreach { x =>
      buffer = x :: buffer
      //      println(x)
    }
  }

  def main(args: Array[String]): Unit = {

    time(List.fill(10000)(0), printInts)
    time(List.fill(20000)(0), printInts)
    time(List.fill(40000)(0), printInts)

    time(Array.fill(10000)(0), printInts)
    time(Array.fill(20000)(0), printInts)
    time(Array.fill(40000)(0), printInts)

  }
}
