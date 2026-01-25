package FunctionalProgramming16

object FunctionCallByNameCalculator06 {

  def main(args: Array[String]): Unit = {
    calculator(add, 13, 5)
    calculator(sub, 13, 5)
    calculator(mul, 13, 5)
    calculator(div, 13, 5)
  }

  def calculator(operation: (Int, Int) => Int, x: Int, y: Int): Unit = {
    println(s"Result is:${operation(x, y)}")
  }


  val add: (Int, Int) => Int = (x: Int, y: Int) => {
    println(s"Value of x is:${x} and value of y is:${y}")
    x + y
  }

  def sub: (Int, Int) => Int = (x: Int, y: Int) => {
    println(s"Value of x is:${x} and value of y is:${y}")
    x - y
  }

  def div: (Int, Int) => Int = (x: Int, y: Int) => {
    println(s"Value of x is:${x} and value of y is:${y}")
    x / y
  }

  def mul: (Int, Int) => Int = (x: Int, y: Int) => {
    println(s"Value of x is:${x} and value of y is:${y}")
    x * y
  }

}
