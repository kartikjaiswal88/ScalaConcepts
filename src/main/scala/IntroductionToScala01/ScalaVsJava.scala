package IntroductionToScala01

object ScalaVsJava {
  /*
    Java is Not Pure OOP but Scala Is.
    Semicolon is optional.
    Usually in Java we write sum(a,b) but In Scala a.equals(b) or a equals b.
    In Java + - are operators but in Scala they are methods of Int class as all the datatypes are Non-primitive.
    Diamond problem occurs while using multiple inheritance through interfaces in Java but Scala traits avoids by trait linearization
       (it looks for implementation right to left).
    We can use the Java packages in scala (apache POI).


   */

  def main(arg: Array[String]) = {
    val a: Int = 20

    var b = 0
    b.equals(a)

    println("a is:", a)
    println("b is:", b)
  }

}
