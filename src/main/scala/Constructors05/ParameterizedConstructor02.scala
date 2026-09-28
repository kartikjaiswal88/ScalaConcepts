package Constructors05

/*
 * Parameterized Constructor:
 *
 * The parameters declared in the class definition form the
 * primary constructor parameters.
 *
 * Example:
 * class demoClass1(a: Int, b: Double, c: String)
 *
 * When an object is created:
 * new demoClass1(2, 3, "Sum")
 *
 * the values 2, 3 and "Sum" are passed to the constructor.
 *
 * The statements written directly inside the class body are
 * executed during object construction.
 *
 * `var`:
 * A public var provides getter and setter accessors.
 * It can be reassigned after initialization.
 *
 * `val`:
 * A public val provides read-only access through a getter.
 * It cannot be reassigned after initialization.
 *
 * Functions/methods:
 * The method body is executed only when the method is called.
 * Scala can infer the return type when it is omitted.
 *
 * Therefore:
 *   def addNumbers() = x + y
 *
 * is inferred as:
 *   def addNumbers(): Double = x + y
 */

// PARAMETERIZED CONSTRUCTOR
class demoClass1(a: Int, b: Double, c: String) {
  var x = a //In case of Var, SCALA CREATES TWO METHODS:GETTER AND SETTER
  val y = b //In case of Val, SCALA ONLY CREATES THE GETTER METHOD
  val z = c

  def addNumbers(): Double = x + y

  println(s"x is:${x}, y is:${y} and z is:${z}")

}

object Constructor02 {

  def main(args: Array[String]): Unit = {
    println("Hello World")

    val demoObj = new demoClass1(2, 3, "Sum")

    demoObj.x = 5 // We can change x as it has setter and getter.
    //    demoObj.y = 5 // We can't change y as it has only the getter.

    val result = demoObj.addNumbers()
    println("Result is:", result)
  }
}
