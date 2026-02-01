package Collection_List20

object List01 {
  def main(args: Array[String]): Unit = {
    // Fill: Creating a list of same data using fill method
    val colors = List.fill(5)("Orange")
    println("List created by fill:")
    println(colors)

    // Tabulate: You can apply some function to generate element list.
    val numbers = List.tabulate(5)(x => x + 10)
    println("List of numbers by tranforming using tabulate:")
    println(numbers)

    val squaredNumbers = List.tabulate(3)(x => x * x)
    println("List of squaredNumbers using tabulate:")
    println(squaredNumbers)

    val matrix = List.tabulate(3, 3)((r, c) => r * c)
    println("List of matrix using tabulate after applying transformation:")
    println(matrix)

    // Reverse: It will create the new list by reversing the elements
    println("Reversing the list using reverse:")
    println(numbers.reverse)

    // Sorted: It will sort the list in ascending order
    // sorted(Ordering.Int.reverse): It will sort the list in descending order
    val nums = List(3, 7, 2, 84, 22, 11, 55)
    println(s"List of numbers:$nums")
    println(s"Sorted list using sorted:${nums.sorted}")
    println(s"Sorting the list in descending order using sorted:${nums.sorted(Ordering.Int.reverse)}")

    // SortBy: Sorting the elements using transformations
    println(s"Sorting the list using sortBy:${nums.sortBy(x => x)}")
    println(s"Sorting the list in descending order using sortBy:${nums.sortBy(x => x).reverse}")
    println(s"Sorting the list using sortBy:${nums.sortBy(x => x / 10)}")


  }
}
