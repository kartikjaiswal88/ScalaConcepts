package SingletonObj_CompanionClassAndObj_CaseClassesAndO06

/*
 * Case Class:
 *
 * Interview Definition:
 * A case class is a special Scala class mainly used for modeling
 * immutable data. Scala automatically provides features such as
 * apply, unapply, copy, equals, hashCode and toString.
 *
 * Example:
 *   case class Car(name: String, model: String)
 *
 * Automatically provides:
 *
 * 1. apply()
 *    - Allows object creation without `new`.
 *    - Car("BMW", "520") internally uses Car.apply(...).
 *
 * 2. Constructor parameters are `val` by default.
 *    - Can be read but cannot be reassigned.
 *    - `var` can be explicitly used when mutability is required.
 *
 * 3. unapply()
 *    - Used for extracting values during pattern matching.
 *
 * 4. copy()
 *    - Creates a new object with selected fields modified.
 *
 * 5. equals() and hashCode()
 *    - Provides value-based equality and hashing.
 *
 * 6. toString()
 *    - Provides a readable representation of the object.
 *
 * Key Advantage:
 *    Case classes make data modeling, pattern matching and
 *    immutable data handling easier.
 */


case class Car(name: String, model: String) {
  val carName = name
  val carModel = model

  def printDetails() = {
    println(s"Car is: $carName and It's model is: $carModel")
  }
}


object CaseClassConcept01 {

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
