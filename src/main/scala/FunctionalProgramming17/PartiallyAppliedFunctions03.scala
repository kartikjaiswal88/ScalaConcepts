package FunctionalProgramming17

import java.util.Date

/*
 * Partially Applied Function:
 *
 * Interview Definition:
 * A partially applied function is a function in which some of the
 * arguments are fixed in advance, producing a new function that
 * accepts the remaining arguments later.
 *
 * In this program:
 * 1. `log` requires two parameters: Date and String.
 * 2. The Date argument is fixed using `date`.
 * 3. The String argument is left unbound using `_`.
 * 4. `logWithDate` becomes a new function that requires only String.
 * 5. The same `logWithDate` function can then be called multiple times
 *    with different messages.
 *
 * `_` in:
 *   log(date, _: String)
 *
 * means that this parameter is left to be supplied later.
 *
 * Important:
 * The partially applied function captures the already supplied
 * `date` value.
 *
 * Therefore, all calls through `logWithDate` use the same Date value.
 *
 * Partially Applied Function vs Normal Function:
 *   Normal function → all required arguments are supplied when called.
 *   Partially applied function → some arguments are fixed first and
 *   the remaining arguments are supplied later.
 *
 * Key Point:
 * A partially applied function is useful when the same argument
 * needs to be reused across multiple function calls.
 */

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
