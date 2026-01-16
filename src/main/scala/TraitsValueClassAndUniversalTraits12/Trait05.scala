package TraitsValueClassAndUniversalTraits12


/*
    16.Value Class: Cannot allocate the runtime object.
    17.Value class always has only 1 PARAMETER WITH TYPE VAL
    18.You cannot extend the value class
    19.Value class cannot extend a trait. That's why you have a universal trait.
    20.trait which extends the Any is called universal trait.
 */

trait Car05 extends Any {
  def print: Unit = {
    println(this)
  }
}

class Mercedes(val x: Int) extends AnyVal with Car05 {
  // val y = 5        //Field definition is not allowed in value class, we can only define the methods
  def hello(): Unit = {
    println("Hello Buddy!")
  }
}


object Trait05 {
  def main(args: Array[String]): Unit = {
    val m1 = new Mercedes(6)
    m1.print
  }

}
