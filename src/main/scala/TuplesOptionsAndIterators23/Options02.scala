package TuplesOptionsAndIterators23

object Options02 {

  /*
    1. Options are similar to HashMap in Java, gives value or Null
    2. Options have always two kinds of elements=> Some[T] or None(as scala is purely OO language it gives object:None)
    3. Option is a parent class whose object can contain values of Some and None which are its child classes.
    4. map.get(key) will give option while map(key) will give direct element and fails if not found while get will give None.
    5. Get will give error in case option is None(None.get), that's why getOrElse preferred.
   */

  def main(args: Array[String]): Unit = {
    var option1: Option[Int] = Some(22)
    println(s"Value of option1 is:$option1 and class is:${option1.getClass}")
    option1 = None // We are able to assign None because we defined it's type which is Option[Int]

    var option2 = Some(44)
    println(s"Value of option1 is:$option2 and class is:${option2.getClass}")
    //    option2 = None// Here we are not able to assign the None because, it directly created the object of Some
    option2 = Some(89) // Here we can assign some values

    // Operations on Options
    println(s"Checking Emptiness of option1:${option1.isEmpty}")
    println(s"Checking Emptiness of option2:${option2.isEmpty}")

    var cars = Map("Mercedes" -> "High Range", "BMW" -> "High Range", "Toyota" -> "Mid Range", "Jaguar" -> "High Range", "Nano" -> "Low Range")
    println(s"Accessing elements using get method whose value is:${cars.get("BMW")} and class is:${(cars.get("BMW")).getClass}")
    println(s"Accessing elements using get method whose value is:${cars.get("Alto")} and class is:${(cars.get("Alto")).getClass}")
    println(s"Accessing elements without get method whose value is:${cars("BMW")} and class is:${cars("BMW").getClass}")


    // In case if we don't want Some and None then define the function like below
    def removeSome(x: Option[String]) = x match {
      case Some(y) => y
      case None => "Not Found"
    }

    println(s"Accessing elements using get method whose value is:${removeSome(cars.get("Alto"))} and class is:${removeSome(cars.get("Alto")).getClass}")

    val opt: Option[Int] = None
    println(s"Accessing elements of Option with default value:${opt.getOrElse("Hello")}")
  }

}
