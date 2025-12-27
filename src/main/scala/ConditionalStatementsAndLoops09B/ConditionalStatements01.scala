package ConditionalStatementsAndLoops09B

object ConditionalStatements01 {

  def main(args: Array[String]): Unit = {
    val x = 5

    // If else
    if (x > 3) println(s"Value of x is:${x}")
    else if (x == 1) println("Value of x is: 1")
    else println("Value of x is less than 3")

  }

}
