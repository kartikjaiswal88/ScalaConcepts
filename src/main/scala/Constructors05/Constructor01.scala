package Constructors05

class demoClass {
  val x = 5
  val y = 6

  def addNumbers(): Int = x + y

  println(s"x is:${x} and y is:${y}")

  val z: Int = addNumbers()
  println("Value of z is:", z)
}

object Constructor01 {
  /*
    Scala has two types of constructors:
    1. Primary Constructor
    2. Auxiliary Constructor

    The primary constructor is defined as part of the class definition.
    The statements written directly inside the class body are executed
    when an object is created.

    An auxiliary constructor is defined using `this` and must eventually
    call the primary constructor.
*/


  def main(args: Array[String]): Unit = {
    println("Hello World")

    val demoObj = new demoClass
    println(demoObj.addNumbers())
  }
}
