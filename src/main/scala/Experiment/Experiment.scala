package Experiment

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
        case 1 =>println("One")
        case "Kartik"=> println("Kartik")
        case _ => println("None of the above")
      }
  }

  implicit class stringImplicit(x:String) {
    def appendKartik(): String = {x + " Kartik"}
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

    if({p1 findFirstIn(string)}.nonEmpty) println("Pattern found") else println("Pattern not Found")

    p2 findFirstIn (string) match {
      case Some(value) => println("Pattern found of Jaiswal")
      case None => println("Pattern not found")
    }


    val st2 = "Hello"
    println(st2.appendKartik())





  }
}
