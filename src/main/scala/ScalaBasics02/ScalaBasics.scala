package ScalaBasics02

object ScalaBasics {
  /*
     Commets are same as Java(single and multi-line comments).
     Keywords can't use as identifier.
     val a = 6. Here it automatically assigns the type which is called 'Type Inference'.
     var means variable and val means value.
     val x = 2.3 would be of Double type but if you want float then do like 2.3f.
     Any class is master class in scala which is extended by AnyVal class which is further extended by Int.
     toInt, toByte is present in the Int class and asInstanceOf[T] is present in the Any class and can be used everywhere.
     We cannot concatenate the string and interger value but scala do as it internally converting the integer into string.
     Operators can lie at start, middle and end of the expression(prefix, infix and postfix like -10, a+b and a.toByte)
   */

  def main(arg: Array[String]) = {
    //Escape characters in println
    println("Hello World!")

    println("Hello \nWorld!")

    println("Hello \tWorld!")

    println("Hello\b\bWorld!")

    println("Hello\fWorld!")

    println("Hello\rWorld!")

    println("Hello \"India\" and World!")

    println("https:\\\\www.google.com")


    // DataTypes
    val a: Byte = 10
    val b: Byte = 20

    val c: Byte = (a + b).toByte //  val c:Byte = a + b (Gives error because of + as it converts the value to Int)
    println(c)

    val x = a.*(0) // Pure scala
    println(x)

    val y = 5.toByte // or
    val z = 5.asInstanceOf[Byte]


    //Operators: all are methods
    println("Addition of a + b = " + (a + b))





  }
}
