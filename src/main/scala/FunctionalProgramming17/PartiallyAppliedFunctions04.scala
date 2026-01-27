package FunctionalProgramming17

object PartiallyAppliedFunctions04 {

  def main(args: Array[String]): Unit = {
    car("Artiga")
    car("BMW")
    truck("BMW")
  }

  val car = fourWheeler(_: String, "Car", 400000)
  val truck = fourWheeler(_: String, "Truck", 500000)

  //  def fourWheeler(vehicleName: String, vehicleType: String, vehicleCost: Int): Unit = {
  //    println(s"Vehicle name is:$vehicleName, vehicle type is:$vehicleType and vehicle cost is:$vehicleCost")
  //  }

  val fourWheeler: (String, String, Int) => Unit = (vehicleName: String, vehicleType: String, vehicleCost: Int) => {
    println(s"Vehicle name is:$vehicleName, vehicle type is:$vehicleType and vehicle cost is:$vehicleCost")
  }

}
