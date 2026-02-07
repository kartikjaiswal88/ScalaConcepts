package Collections_Map22

import scala.collection.SortedMap

object Map01 {

  /*
    1. Map: Map is a collection of key-value pair elements where key is always unique.
    2. Map can be immutable(default) and mutable(scala.collection.mutable) also.
    3. Sequence of data is not preserved in Map.
    4. You can have duplicate values but not duplicate keys.
    5. To insert new record, map should be var because it will create new map while adding it.
    6. To insert new record in mutable, map can be var or val because it will not create new map while adding it.
    7. We are able to insert new element for val in case of immutable map because:
       += operator behaves differently in scala.collection.mutable.Map and scala.collection.immutable.Map
       In immutable map += operator(method) will return a new Map object and new object can only be saved if the object is of type var
       In mutable Map += operator(method) will modify the existing Map object. Hence it will work for both val and var also.
    8. Put and remove methods are only available in case of mutable map.


   */

  def main(args: Array[String]): Unit = {
    // Immutable Map
    var cars = Map("Mercedes" -> "High Range", "BMW" -> "High Range", "Toyota" -> "Mid Range", "Jaguar" -> "High Range", "Nano" -> "Low Range")
    println(s"Map of Cars:$cars")
    cars = Map("Mercedes" -> "High Range", "BMW" -> "High Range", "Toyota" -> "Mid Range", "Jaguar" -> "High Range", "Nano" -> "Low Range", "Mercedes" -> "Low Range")
    println(s"Map of Cars after adding duplicate key(last added key-pair remains):$cars")

    cars += "Suzuki" -> "Mid Range"
    println(s"Map of cars after adding a element:$cars")

    // Mutable Map
    var cars1 = scala.collection.mutable.Map("Mercedes" -> "High Range", "BMW" -> "High Range", "Toyota" -> "Mid Range", "Jaguar" -> "High Range", "Nano" -> "Low Range")
    cars1 += "Suzuki" -> "Mid Range"
    println(s"Map of cars after adding a element:$cars")


    // Operations on Map
    println(s"Keys used in car map are:${cars.keys}")
    println(s"Values of car map are:${cars.values}")
    println(s"Does cars map is Empty:${cars.isEmpty}")
    println(s"Maximum element of cars map is:${cars.max}")

    val emptyMap: Map[String, String] = Map()
    println(s"Empty map:${emptyMap}")

    println(s"First element of Cars map is:${cars.head}")
    println(s"Without first element of Cars map is:${cars.tail}")

    cars -= "Toyota" // It is just creating new collection of map for removing the element in case of var for Immutable map
    cars -= ("BMW", "Nano")
    cars --= List("Jaguar", "Alto")
    println(s"Cars Map after removing Toyota:${cars}")

    cars1.put("Artiga", "Mid Range")
    println(s"Mutable map after adding element using put method:${cars1}")
    cars1.remove("Artiga")
    println(s"Mutable map after removing element using remove method:${cars1}")

    println(s"Getting element of map using get method:${cars1.get("Mercedes")}")
    println(s"Getting element of map directly:${cars1("Mercedes")}")

    val aMap = Map(1 -> 2, 3 -> 4)
    val bMap = Map(5 -> 6, 7 -> 8)
    //    val cMap = aMap ++ bMap
    val cMap = aMap.++(bMap)
    println(s"Combined Map is:$cMap")


    // Accessing elements of Map
    var trucks = Map("Mercedes" -> "High Range", "BMW" -> "High Range", "Toyota" -> "Mid Range", "Jaguar" -> "High Range", "Nano" -> "Low Range")
    trucks.keys.foreach(key => println(s"Key is:$key and value is:${trucks(key)}"))

    trucks.foreach(truck => println(s"Key is:${truck._1} and Value is:${truck._2}"))

    trucks.foreach { case (carName, carRange) => println(s"Key is:$carName and Value is:$carRange") }


    // Operations on Map
    println(s"Is Toyota present in trucks:${trucks.contains("Toyota")}")
    println(s"Is BMW present in trucks:${trucks.contains("BMW")}")
    println(s"Is Alto exist in trucks:${trucks.contains("Alto")}")

    println(s"Is Mid range truck exist in trucks:${trucks.valuesIterator.exists(_.equals("Mid Range"))}")

    // Creating Map with default value
    val bikes = Map("TVS Ronin" -> "High Range", "SP Shine" -> "Mid Range", "HF Delux" -> "Low Range").withDefaultValue("Not Available")
    println(s"What's the range of Discover:${bikes("Discover")}")
    println(s"What's the range of Discover:${bikes.getOrElse("Discover", "Not able to find")}")

    // Mapping values of Map: It will return new map object
    val mutableBikes = scala.collection.mutable.Map("TVS Ronin" -> "High Range", "SP Shine" -> "Mid Range", "HF Delux" -> "Low Range").withDefaultValue("Not Available")
    println(s"Mapping values of bikes using mapValues:")
    val upperMutableBikes = mutableBikes.mapValues(bike => bike.toUpperCase).toMap // forcing to complete the evaluation
    println(upperMutableBikes)

    println(s"Transforming the elements of map using transform:")
    val transformedBikeRanges = mutableBikes.transform((bikeName, bikeRange) => bikeRange.toUpperCase).toMap // forcing to complete the evaluation
    println(transformedBikeRanges)


    // Sorted Map: Stores the elements in sorted order
    val sortedBikes = SortedMap("TVS Ronin" -> "High Range", "SP Shine" -> "Mid Range", "HF Delux" -> "Low Range")
    println(s"Sorted Bikes:$sortedBikes")

    // List Map: Stores the elements in sequential order(newest element always comes first)
    var listBikes = scala.collection.mutable.ListMap("TVS Ronin" -> "High Range", "SP Shine" -> "Mid Range", "HF Delux" -> "Low Range").withDefaultValue("Not Available")
    listBikes += ("Rajdoot" -> "Low Range")
    println(s"List of Bikes:$listBikes")

    // Lisked HashMap: Stores the elements in sequential order(preserves the sequence of insertion)
    var linkedHashMap = scala.collection.mutable.LinkedHashMap("TVS Ronin" -> "High Range", "SP Shine" -> "Mid Range", "HF Delux" -> "Low Range").withDefaultValue("Not Available")
    linkedHashMap += ("Rajdoot" -> "Low Range")
    println(s"Linked HashMap of Bikes:$linkedHashMap")


  }

}
