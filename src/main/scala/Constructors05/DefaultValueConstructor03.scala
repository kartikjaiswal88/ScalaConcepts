package Constructors05

class demoClass2(a: Int = 50, b: Double = 33.5, c: String = "Kartik") {
  var x = a
  val y = b
  val z = c

  def addNumbers() = x + y

  println(s"x is:${x}, y is:${y} and z is:${z}")

}

object DefaultValueConstructor03 {

  def main(args: Array[String]): Unit = {
    println("Hello World")

    val demoObj = new demoClass2()
    val result = demoObj.addNumbers()

    val demoObj1 = new demoClass2(1)
//    val demoObj2 = new demoClass2("Hello") // We need to pass parameters in correct sequence.
    val demoObj2 = new demoClass2(c = "Kartik jaiswal")
    println("Result is:", result)
  }
}