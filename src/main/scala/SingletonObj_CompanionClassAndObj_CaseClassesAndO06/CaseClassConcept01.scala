package SingletonObj_CompanionClassAndObj_CaseClassesAndO06

case class Car(name: String, model: String) {
  val carName = name
  val carModel = model

  def printDetails() = {
    println(s"Car is: $carName and It's model is: $carModel")
  }
}


object CaseClassConcept01 {
  /*
    Case Class = Regular class + Lot of Auto-generated extra code.
    No need to write "new" Keyword, since "apply"(it create object using new keyword) method is auto generated in case class.
    Biggest advantage of case class is, it supports pattern matching.
    Constructor parameters are val by default, therefore mutator method is not generated and hence we cannot change the value.
    If Constructor parameters are explicitly mentioned var then we can change the value as mutator method will be auto generated.
    Case class auto-generate unapply method, used for pattern matching.
    Case class auto-generate copy method.
    Case class auto-generate the equals and hashcode methods.
    Case class auto-generate toString method.
   */

  def main(args: Array[String]): Unit = {
    val bmw = new Car("BMW", "520")
    val audi = Car("Audi", "V1.2")

    //    bmw.name = "Hely"   // Gives error
    bmw.printDetails()
    audi.printDetails()

    bmw match {
      case Car(a, b) => println(a, b)
    }

    val mercedes = bmw.copy(name = "mercedes")
    mercedes.printDetails()

    println(bmw == mercedes)
    println(bmw.equals(mercedes))

    println(bmw)

  }

}
