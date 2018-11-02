package fintech.lesson07.examples

import scala.collection.{TraversableView, mutable}

object Example06TraversableMethods extends App {
  // https://www.scala-lang.org/api/current/scala/collection/Traversable.html

  val t = Traversable(1, 2, 3) // apply для создания

  t.foreach(x => println(x))

  trait T[A] {
    // упрощенный сигнатуры

    // абстрактный метод foreach
    def foreach[U](f: A => U)

    // конкатенация
    def ++[B >: A](that: T[B]): T[B]

    // map
    def map[B](f: A => B): T[B]
    def flatMap[B](f: A => T[B]): T[B]
    def collect[B](pf: PartialFunction[A, B]): T[B]

    // конвертации
    def toArray: Array[A]
    def toList: List[A]
    def toIterable: Iterable[A]
    def toSeq: Seq[A]
    def toIndexedSeq: IndexedSeq[A]
    def toStream: Stream[A]
    def toSet: Set[A]
    // def toMap: Map[???] // Example23.scala

    // копирование
    def copyToBuffer(bf: mutable.Buffer[A]): Unit
    def copyToArray(ar: Array[A]): Unit

    // размер
    def isEmpty: Boolean
    def nonEmpty: Boolean
    def size: Int
    def hasDefiniteSize: Boolean

    // получение елемента
    def head: A
    def last: T[A]
    def headOption: Option[A]
    def lastOption: Option[A]
    def find(p: A => Boolean): Option[A]

    // subcollections
    def tail: T[A]
    def init: T[A]
    def slice(from: Int, until: Int): T[A]
    def take(n: Int): T[A]
    def drop(n: Int): T[A]
    def takeWhile(p: A => Boolean): T[A]
    def dropWhile(p: A => Boolean): T[A]
    def filter(p: A => Boolean): T[A]
    def filterNot(p: A => Boolean): T[A]

    // split
    def slitAt(n: Int): (T[A], T[A])
    def span(p: A => Boolean): (Traversable[A], Traversable[A])
    def partition(p: A => Boolean): (Traversable[A], Traversable[A])
    def groupBy[K](f: A => K): Map[K, Traversable[A]]

    // checks
    def exists(p: A => Boolean): Boolean
    def forall(p: A => Boolean): Boolean
    def count(p: A => Boolean): Int

    // folds
    def fold[B >: A](z: B)(op: (B, B) => B): B
    def foldLeft[B](z: B)(op: (B, A) => B): B
    def foldRight[B](z: B)(op: (A, B) => B): B
    def /:[B](z: B)(op: (B, A) => B): B
    def :\[B](z: B)(op: (B, A) => B): B
    def reduce[B >: A](op: (B, B) => B): B
    def reduceLeft[B >: A](op: (B, A) => B): B
    def reduceRight[B >: A](op: (B, A) => B): B

    // specific folds
    def sum: A
    def product: A
    def min: A
    def max: A

    // toString
    def mkString: String
    def addString(b: StringBuilder): StringBuilder

    // view
    def view: TraversableView[A, T[A]]
  }

}
