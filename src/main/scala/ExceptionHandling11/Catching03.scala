package ExceptionHandling11

import scala.util.control.Exception.catching
import ExceptionHandling11.TrySuccessFailure02.errorHandlingFunction

object Catching03 {

  def main(args: Array[String]): Unit = {

    //    val catchExceptions = catching(classOf[ArithmeticExcepti/on]).withApply(e => println(s"Arithematic Exception has occured:${e}"))
    val catchExceptions = catching(classOf[ArithmeticException], classOf[ArrayIndexOutOfBoundsException]).withApply(e => errorHandlingFunction(e))

    val a = catchExceptions(10 / 0)

    if (a.!=()) {
      println(a)
    }

  }

}
