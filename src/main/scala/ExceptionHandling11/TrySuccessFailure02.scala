package ExceptionHandling11

import scala.util.{Failure, Success, Try}

object TrySuccessFailure02 {

  def main(args: Array[String]): Unit = {
    val x = Try(10 / 0)

    //    x match {
    //      case Success(5) => println("Value of x is 5")
    //      case Success(value) => println(s"Value of x is:$value")
    //      case Failure(ex: ArithmeticException) => println("Value is divided by zero")
    //      case Failure(exception) => println("This is last block")
    //    }

    x match {
      case Success(value) => println(s"Value of x is:$value")
      case Failure(exception) => errorHandlingFunction(exception)
    }
  }

  def errorHandlingFunction(exception: Throwable): Unit = {
    println(exception)
    if (exception.getLocalizedMessage.equalsIgnoreCase("/ by zero")) {
      println("Value is divided by zero")
    }
  }

}
