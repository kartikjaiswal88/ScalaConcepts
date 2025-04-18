package Constructors05

// PARAMETERIZED CONSTRUCTOR
class demoClass1(a: Int, b: Double, c: String) {
  var x = a //In case of Var, SCALA CRETES TWO METHODS:GETTER AND SETTER
  val y = b //In case of Val, SCALA ONLY CREATES THE GETTER METHOD
  val z = c

  def addNumbers() = x + y

  println(s"x is:${x}, y is:${y} and z is:${z}")

}

object Constructor02 {
  /*
   Constructor are of two types: Primary and Auxillary.
   Constructor will execute everything in the class.
   */

  def main(args: Array[String]): Unit = {
    println("Hello World")

    val demoObj = new demoClass1(2, 3, "Sum")

    demoObj.x = 5 // We can change x as it has setter and getter.
    //    demoObj.y = 5 // We can't change y as it has only the getter.

    val result = demoObj.addNumbers()
    println("Result is:", result)
  }
}
