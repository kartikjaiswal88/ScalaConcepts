package ConditionalStatementsAndLoops09B

object WhileLoop02 {
  /*
  * While loop check the condition at the start but doWhile check at the end of execution.
  * DoWhile loop execute the code at least once even if the condition is failing
  * */

  def main(args: Array[String]): Unit = {
    var x = 1

    while (x < 10) {
      println(s"Value of x is:${x}")
      x = x + 1
    }

    x = 1
    do {
      println(s"Value of x is:${x}")
      x = x + 1
    } while (x < 1) 
  }
}
