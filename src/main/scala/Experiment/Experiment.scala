package Experiment

import scala.Array.ofDim
import scala.collection.mutable.ArrayBuffer
import scala.util.{Failure, Success, Try}
import scala.util.matching.Regex

class ParaConstructor(a: Int, b: Int) {
  val x = a
  val y = b
  private val p = 6

  def sum(): Unit = {
    println(s"Sum of $x and $y is:${x + y}")
  }

  println("Hey this is kartik")

  def this(p: Int) = {
    this(p, 5)
    println(s"Sum of $p and 5 is:${sum()}")
  }
}

case class Student(rollNo: Int, name: String)

object ParaConstructor {
  val z = 11
}


object Experiment {
  def matchPattern(x: Any) = {
    x match {
      case 1 => println("One")
      case "Kartik" => println("Kartik")
      case _ => println("None of the above")
    }
  }

  implicit class stringImplicit(x: String) {
    def appendKartik(): String = {
      x + " Kartik"
    }

  }

  def check(x: Int, arg: String*): Unit = {
    arg.foreach(println)
  }

  def factorial(n: Int): Int = {
    if (n == 0 || n == 1) return 1 else n * factorial(n - 1)
  }

  def prime(x: Int = 2): Unit = {
    println(s"Value of x is:$x")
  }


  def main(args: Array[String]): Unit = {
    //      println(s"This is the first word:${args(0)} and second word is:${args(1)}")

    val con = new ParaConstructor(5, 6)
    con.sum()

    val conAux = new ParaConstructor(2)
    conAux.sum()

    println("Case class...........")
    val s1 = Student(1, "Kartik")

    s1 match {
      case Student(a, b) => println(a, b)
    }

    val st = "Kartik"
    println(st.length)
    println(st.charAt(3))
    println(st.isEmpty)
    println(st.split('a').mkString("Array(", ", ", ")"))

    matchPattern("Kartik")

    val p1 = new Regex("Kartik")
    val p2 = "Jaiswal".r

    val string = "My name is Kdrtik Jaiswal, I live in Bhopal!"

    if ( {
      p1 findFirstIn (string)
    }.nonEmpty) println("Pattern found") else println("Pattern not Found")

    p2 findFirstIn (string) match {
      case Some(value) => println("Pattern found of Jaiswal")
      case None => println("Pattern not found")
    }


    val st2 = "Hello"
    println(st2.appendKartik())

    try {
      val a = 5 / 0
    }
    catch {
      case a: ArithmeticException => println("Value is divided by zero!")
      case _ => println("I don't know what happened my brother!")
    }

    val b = Try(5 / 0)
    b match {
      case Success(value) => println(s"Value is:$value")
      case Failure(ex) => println(s"Error occured:${ex.getMessage}")
    }

    var marks: Array[Int] = new Array[Int](3)

    for (i <- marks.indices) marks(i) = marks(i) + 1
    marks.foreach(mark => println(mark))

    var totalMarks = 0
    marks.foreach(mark => totalMarks.+=(mark))

    val updatedMarks = marks.map(a => a + 1)
    val updatedMarksAdded = for (mark <- marks) yield mark + 2

    val avg = marks.reduceLeft((a, b) => {
      (a + b) / 2
    })
    println(s"Average marks is:$avg")

    println(s"Minimum marks is:${marks.reduceLeft(_ min _)}")

    val matrix = ofDim[Int](3, 3)
    for (i <- 0 to 2; j <- 0 to 2)
      if (i == j) matrix(i)(j) = 1 else 0

    matrix.foreach(arr => println(arr.mkString("Array(", ", ", ")")))

    val arrBuffer = ArrayBuffer[Int]()
    arrBuffer += 5
    arrBuffer += 6

    arrBuffer.foreach(println)

    check(3)
    check(3, "Kartik")
    check(5, "Kartik", "Jaiswal")

    val increment: (Int) => Int = (x: Int) => x + 1
    val divisibleByThree: (Int) => Boolean = (x: Int) => x % 3 == 0

    println(increment(5))

    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val divisibleByThreeFilter = numbers.filter(_ % 3 == 0)
    val mappingValue = numbers.map(x => x * x)

    def printChangedValue(func: =>Int): Unit = {
      println("Hey......")
      println(s"Changed value is:$func")
    }

    printChangedValue(increment(6))







  }


}
