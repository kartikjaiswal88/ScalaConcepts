package FunctionalProgramming17

object NestedFunction05 {

  def main(args: Array[String]): Unit = {
//    def printHello(msg: String): Unit = {
//      println(s"Hello $msg")
//    }

    val printHello: (String) => Unit = (msg: String) => println(s"Hello $msg")

    printHello("World")
    printHello("India")


  }

}
