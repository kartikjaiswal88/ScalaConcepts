package FunctionClassesObjects04

class Car {
  private val topClassExtraCost = 0
  private var roadTax = 100
  protected var professionalTax = 20

  def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax

  def checkTax() = {
    roadTax = 10 //Change by Mistake
    roadTax
  }
}

class smallCar extends Car {
  println(professionalTax)

}

object HelloClass {
  /*
    Class is collection of Variables and Methods.
    Object is instance of Class.
    Method is defined in a class and Function is defined outside the class.
    Access level: Public, Private and Protected.(default is Public).
    When a method change the variable value by mistake then it is called Method with Side Effects.
   */

  def main(args: Array[String]): Unit = {
    val bmw = new Car

    println("Road Tax is:", bmw.checkTax())

    val result = bmw.cost(10000)
    println("Total cost is:", result)


  }
}
