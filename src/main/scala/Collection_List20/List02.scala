package Collection_List20

import scala.collection.mutable.ListBuffer

case class Car(name: String, cost: Int)

object List02 {
  /*
      1. SortBy: It will sort the list on the basis of transformation
      2. sortWith: It will comapre the first element with second element using external function
      3. Mutable List Buffer:
            a. import scala.collection.mutable.ListBuffer
            b. We can add and delete the elements from ListBuffer.
            c. We can use different funcions with listBuffer just like list.
   */

  def main(args: Array[String]): Unit = {
    val car1 = Car("Merceds", 50000)
    val car2 = Car("Alto", 70000)
    val car3 = Car("Mahindra", 30000)

    // SortBy: It will sort the list on the basis of transformation
    val listOfCars = List(car1, car2, car3)
    //    println(s"Sorting the cars on the basis of cost:${listOfCars.sortBy(car=> car.cost)}")
    println(s"Sorting the cars on the basis of cost using sortBy:${listOfCars.sortBy(_.cost)}")
    println(s"Sorting the cars in descending order on the basis of cost using sortBy:${listOfCars.sortBy(_.cost).reverse}")
    println(s"Sorting the cars on the basis of name using sortBy:${listOfCars.sortBy(_.name)}")


    // sortWith: It will comapre the first element with second element using external function
    val nums = List(3, 7, 2, 84, 22, 11, 55)
    println(s"Sorting the list using sortWith:${nums.sortWith((x, y) => x < y)}")
    println(s"Sorting the list in descending order using sortWith:${nums.sortWith((x, y) => x > y)}")
    //println(s"Sorting the list in descending order using sortWith:${nums.sortWith((x,y) =>{ println((s"x is:$x and y is:$y"));  x > y})}")
    println(s"Sorting the list using sortWith:${nums.sortWith((x, y) => (x > y))}")
    println(s"Sorting the list using sortWith by shortHand notations:${nums.sortWith(_ > _)}")
    println(s"Sorting the list using external function:${listOfCars.sortWith(sortingLogic)}")


    // ListBuffer
    val numListBuffer = new ListBuffer[Int]() // Empty list buffer of type Int
    numListBuffer += 1
    numListBuffer += 2
    numListBuffer += 3
    numListBuffer += 4
    println(s"List Buffer after adding the elements:${numListBuffer}")
    println(s"List buffer after removing the 2:${numListBuffer -= 2}")
    println(s"Converting the list buffer into list:${numListBuffer.toList}")
    println(s"Applying map to listBuffer:${numListBuffer.map(_ * 2)}")


  }

  def sortingLogic(car1: Car, car2: Car): Boolean = {
    println(s"Car1 cost:${car1.cost} and Car2 cost:${car2.cost}")
    car1.cost > car2.cost
  }
}
