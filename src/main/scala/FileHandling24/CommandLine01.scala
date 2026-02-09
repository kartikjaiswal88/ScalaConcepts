package FileHandling24

object CommandLine01 {
  /*
    1. File handling in Scala is similar to Java
    2. File Handling commonly involves Read and Write Operations.

   */
  def main(args: Array[String]): Unit = {
    // Read from Command Line Scala.io._
    println("Enter your name:")
    val name = scala.io.StdIn.readLine()

    println(s"Hello ${name}, Enter your phone number:")
    val phoneNo = scala.io.StdIn.readLine()

    println(s"Hello $name, What is your age?")
    //    val age = Console.readLine() // Not present in Scala 3
    val age = scala.io.StdIn.readLine()

    println(s"Name is $name and number is:$phoneNo and your age is:$age")

  }

}
