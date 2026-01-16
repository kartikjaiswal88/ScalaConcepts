package TraitsValueClassAndUniversalTraits12

abstract class Vehical {
  def category()
}

trait FourWheeler03 {
  def tyres: Unit = {
    println("Four tyres are present in Four Wheeler")
  }
}

trait Car03 {
  var x = 1000
  val t = 4

  def engine() = {
    println(s"Engine of car is:${x}")
  }

  def breaks()

  def tyres: Unit = {
    println(s"${t} tyres are present in Car03")
  }
}

class Mercedes03 extends Vehical with FourWheeler03 with Car03 {
  x = 2000 // Changing the value of x
  override val t = 6 // Overriding the value of t

  def breaks(): Unit = {
    println("Disk Breaks...")
  }

  override def tyres: Unit = super.tyres

  def category(): Unit = {
    println("Merceds have car category..;")
  }

  override def engine(): Unit = {
    println(s"Engine of Mercedes is ${x} cc...")
  }

}

object Trait03 {

  def main(args: Array[String]): Unit = {
    val m1 = new Mercedes03
    m1.tyres
    m1.breaks()
    m1.engine()
    m1.category()

  }

}
