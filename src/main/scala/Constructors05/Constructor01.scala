package Constructors05

class demoClass {
  val x = 5
  val y = 6

  def addNumbers() = x + y

  println(s"x is:${x} and y is:${y}")

  val z = addNumbers()
  println("Value of z is:",z)
}

object Constructor01 {
  /*
   Constructor are of two types: Primary and Auxillary.
   Constructor will execute everything in the class.
   */

  def main(args: Array[String]): Unit = {
    println("Hello World")

    val demoObj = new demoClass
    println(demoObj.addNumbers())
  }
}
