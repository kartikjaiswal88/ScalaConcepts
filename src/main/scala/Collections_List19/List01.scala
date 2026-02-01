package Collections_List19

object List01 {
  /*
    1. List: Collections of elements(nodes) similar to Array
    2. Difference of Array and List
       a. List is immutable while array is mutable.
       b. List is defined as linked list.
       c. Array has consecutive memory allocation while list have pointers of next element
       d. List is very fast in case of sequential operations.
       e. Random access in list is very expensive(slow).
       f. List is mutable in Java but it is immutable in scala.
    3. List of integer and doubles will be created as list doubles
    4. List of integer, doubles and string will be created as list of any
    5. Defining list by :: and Nil
       val list = 1 :: (3 :: (5 :: Nil))
    6. We cannot modify the content of list because, it is immutable even if it is var

   */

  def main(args: Array[String]): Unit = {
    val colors = List("Green", "Red", "Yellow", "Blue") // List of String
    val evenNumbers = List(2, 4, 6, 8, 10) // List of Integers
    val prices = List(3.2, 6, 6.3) // List of Doubles
    val random = List(3.2, 6, 6.3, "Hello") // List of Any

    val matrix = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9)) // List of List[Int]

    // Accessing the elements of list by index
    println(colors(2))
    //    colors(1) = "Pink"  // We can't do this because list is immutable

    // List as Linked list
    val cars = "Alto" :: ("Maruti" :: ("Nano" :: Nil))
    println("List of Cars:")
    println(cars)

    val oddNumbers = 1 :: (3 :: (5 :: Nil))
    println("List of Odd Numbers:")
    println(oddNumbers)

    val matrix1 = (1 :: (3 :: (5 :: Nil))) :: (7 :: (9 :: (11 :: Nil))) :: (13 :: (15 :: (17 :: Nil)))
    println("Matrix List:")
    println(matrix1)

    val listByRange = List.range(1, 100)
    println("List of Numbers by Range:")
    println(listByRange)

    val listByInterval = List.range(2, 100, 2)
    println("List By Interval:")
    println(listByInterval)

    // Accessing first and last element of list
    println("First element of colors:")
    println(colors.head)

    // Without first element of list
    println("Elements of colors without first element:")
    println(colors.tail)

    // Defining empty list
    val emptyList = Nil
    println("Empty List:")
    println(emptyList)

    // To check list is empty or not
    println(s"Is list empty:${emptyList.isEmpty}")

    // Checking size of list
    println(s"Size of colors list is:${colors.size}")

    // Converting list to string
    println("Converting list to string separated by ,")
    println(colors.mkString(","))

    // Converting list to string using prefix, separator and suffix
    println("Converting list to string by prefix, separator and suffix:")
    println(colors.mkString("We are having below colors:", ",", " only. Choose one of them"))

    val valList = List(1, 2, 3)
    //    valList = valList :+ 4  // It won't work as list is defined as val and we cannot override the list in case of val

    var varList = List(4, 5, 6, 4, 6)
    varList = varList :+ 7 // In this case, new list is created and override to varList

    // Adding element at first of list
    varList = 3 +: varList
    println("VarList is:")
    println(varList)

    // Getting distinct elements of list
    println(s"Distinct elements of varList:${varList.distinct}") // Behind the scene, it will create the new list

    println("Printing each elements of list using for loop:")
    for (color <- colors) print(s"$color ")
    println()

    println("Printing each elements of list using foreach loop:")
    colors.foreach(println(_))

    println("Elements of var list which are less than five:")
    println(varList.filter(_ < 5))

    println("Elements of colors list which are having length less than three:")
    println(colors.filter(_.length < 5))

    println("Elements of colors list which is equals to Red:")
    println(colors.filter(_ == "Red"))

    println("Elements of colors list which have e inside it:")
    println(colors.filter(_.contains("n")))

    println("Checking particular element is present or not:")
    println(colors.exists(_ == "Orange"))


  }

}













