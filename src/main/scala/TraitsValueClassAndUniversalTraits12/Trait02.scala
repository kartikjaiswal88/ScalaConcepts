package TraitsValueClassAndUniversalTraits12

trait FourWheeler02 {
  def tyres: Unit = {
    println("Four tyres are present in Four Wheeler")
  }
}

trait Car02 {
  def engine(): Unit = {
    println("1000cc engine")
  }

  def breaks(): Unit

  def tyres(): Unit = {
    println("Four tyres are present in Car02")
  }
}

class Mercedes02 extends FourWheeler02 with Car02 {

  def breaks(): Unit = {
    println("Disk Breaks...")
  }

  override def tyres: Unit = super.tyres()

}

object Trait02 {

  def main(args: Array[String]): Unit = {
    val m1 = new Mercedes02
    m1.tyres
    m1.breaks()
    m1.engine()
  }

}
