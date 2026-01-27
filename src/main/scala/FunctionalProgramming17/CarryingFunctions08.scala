package FunctionalProgramming17

object CarryingFunctions08 {
  def main(args: Array[String]): Unit = {
    val str1 = "Hello"
    val str2 = "World"


    //    println("str1, str2: " + printSomething(str1, str2))
    println("str1, str2: " + printSomething(str1)(str2))      // Chaining or carrying of function
  }

  //  def printSomething(str1: String, str2: String):String = str1 + " " + str2
  //  def printSomething(str1: String)(str2: String): String = str1 + " " + str2
    def printSomething(str1: String) = (str2: String)=>  str1 + " " + str2
}
