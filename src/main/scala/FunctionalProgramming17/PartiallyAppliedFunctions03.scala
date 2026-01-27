package FunctionalProgramming17

import java.util.Date

object PartiallyAppliedFunctions03 {

  def main(args: Array[String]): Unit = {
    var date = new Date()

    val logWithDate = log(date, _: String) // Partially applied function
                                           // _ with the parameter that is expected by partially applied function

    //    log(date, "Hello1")
    logWithDate("Hello1")
    Thread.sleep(2000)

    //    log(date, "Hello2")
    logWithDate("Hello2")
    Thread.sleep(2000)

    //    log(date, "Hello3")
    logWithDate("Hello3")
    Thread.sleep(2000)
  }


  def log(date: Date, msg: String): Unit = {
    println(msg + " " + date)
  }

}
