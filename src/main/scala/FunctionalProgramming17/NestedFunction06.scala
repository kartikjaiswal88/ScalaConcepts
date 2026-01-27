package FunctionalProgramming17

object NestedFunction06 {
  def main(args: Array[String]): Unit = {
    printHello("World")
    printHello("India")
  }

  def printHello(str: String): Unit = {
    def printSomething(str1: String, str2: String): Unit = {
      println(str1 + " " + str2)
    }

    printSomething("Hello", str)
  }
}
