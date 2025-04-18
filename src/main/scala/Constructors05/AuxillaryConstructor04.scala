package Constructors05

class demoClass3(a: Int, b: Double, c: String) {
  var x = a
  val y = b
  val z = c

  def addNumbers() = x + y

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
  /*
    Primary Constructor will always 1.
    Auxillary Constructor equal 0 or more than it.
   */

  def main(args: Array[String]): Unit = {
    println("Hello World")

    val demoObj = new demoClass3(3,5,"How are you")
    val demoObj1 = new demoClass3()
    val demoObj2 = new demoClass3(2)
    val demoObj3 = new demoClass3(5,7.3)

  }
}
