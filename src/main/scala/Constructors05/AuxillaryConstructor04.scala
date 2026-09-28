package Constructors05

/*
 * Constructors in Scala:
 *
 * 1. Primary Constructor
 *    - Defined as part of the class definition.
 *    - A class has exactly one primary constructor.
 *
 * 2. Auxiliary Constructor
 *    - Defined using `def this(...)`.
 *    - A class can have zero or more auxiliary constructors.
 *    - Every auxiliary constructor must eventually call
 *      the primary constructor.
 *
 * Constructor execution:
 *    Auxiliary Constructor
 *           ↓
 *    Primary Constructor
 *           ↓
 *    Class body executes
 *           ↓
 *    Auxiliary constructor body continues
 */

class demoClass3(a: Int, b: Double, c: String) {
  var x = a
  val y = b
  val z = c

  def addNumbers(): Double = x + y

  println(s"Primary Constructor Says x is:${x}, y is:${y} and z is:${z}")

  // Defining the Auxillary Constructor
  def this() {
    this(3, 5.3, "Hey")
    println("I came into auxillary constructor with 0 parameter")
  }

  def this(a: Int) {
    this(a, 6.3, "Hey Guys")
    println("I came into auxillary constructor with 1 parameter")
  }

  def this(a: Int, b: Double) {
    this(a, b, "Hey Guys")
    println("I came into auxillary constructor with 1 parameter")
  }

}

object AuxillaryConstructor04 {

  def main(args: Array[String]): Unit = {
    println("Hello World")

    val demoObj = new demoClass3(3,5,"How are you")
    val demoObj1 = new demoClass3()
    val demoObj2 = new demoClass3(2)
    val demoObj3 = new demoClass3(5,7.3)

  }
}
