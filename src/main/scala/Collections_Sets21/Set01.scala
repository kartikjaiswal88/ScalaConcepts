package Collections_Sets21

object Set01 {
  /*
     1. Set: Set is a collection of unique elements.
     2. Set can be immutable(default) and mutable (scala.collection.mutable.set) also.
     3. Set won't reserve the sequence of elements as data in Set is not stored as per index, but it is stored as pair wise
        (i.e. which element comes behind which element)
     4. Pair wise Advantage and Disadvantage:
        Advantage: Iteration(eg for loop) operation is more fast for sets as compared to List
        Disadvantage: Random retrieval of elements is slow


   */


  def main(args: Array[String]): Unit = {

    // Immutable Set
    var countries = Set("India", "Singapore", "US")
    println(s"Set of Countries:${countries}")
    println(s"Class of Immutable set is:${countries.getClass}")

    val emptySet: Set[String] = Set()
    println(emptySet.getClass)


    // Mutable Set
    val mutableSet = scala.collection.mutable.Set("India", "US")
    mutableSet += "Singapore"
    println(s"Mutable Set:$mutableSet")
    println(s"Class of mutable set is:${mutableSet.getClass}")

    // Head: First element of set
    println(s"First element of Set is:${countries.head}")
    println(s"Without first element of Set is:${countries.tail}")
    println(s"Whether set is empty:${countries.isEmpty}")
    println(s"Whether set is empty:${emptySet.isEmpty}")


    // Combining two sets
    var developedCountries = Set("Singapore", "US")
    var developingCountries = Set("China", "India")
    //    var allCountries = developedCountries ++ developingCountries
    var allCountries = developedCountries.++(developingCountries)
    println(s"All countries are:${allCountries}")


    // Minimum and maximum
    var numberSet = Set(4, 5, 2, 6, 3)
    println(s"Minimum element of numberSet is:${numberSet.min}")
    println(s"Maximum element of numberSet is:${numberSet.max}")


    // Intersection of elements:
    val set1 = Set(4, 5, 2, 6, 3)
    val set2 = Set(4, 5, 6, 8, 9, 10)
    println(s"Intersection of set1 and set2 are:${set1 & set2}")
    println(s"Intersection of set1 and set2 are:${set1.&(set2)}")
    println(s"Intersection of set1 and set2 are:${set1.intersect(set2)}")

    // Union of elements:
    val set3 = Set(4, 5, 2, 6, 3)
    val set4 = Set(4, 5, 6, 8, 9, 10)
    println(s"Union of set1 and set2 are:${set1.union(set2)}")
    println(s"Union of set1 and set2 are:${set1 ++ set2}")
    println(s"Union of set1 and set2 are:${set1.++(set2)}")


    // Operations on mutable set
    var mutableSett = scala.collection.mutable.Set(3, 6, 3, 9, 7, 5, 1, 6)
    mutableSett += 4
    mutableSett += (9, 11)
    println(s"Mutable set after adding elements:${mutableSett}")
    mutableSett -= 4
    println(s"Mutable set after removing elements:${mutableSett}")

    println(s"Adding element to mutable set using add method:${mutableSett add 15}")
    println(s"Adding element to mutable set using add method:${mutableSett.add(6)}")

    println(s"Removing element to mutable set using remove method:${mutableSett remove 15}")
    println(s"Removing element to mutable set using remove method:${mutableSett.remove(16)}")


    val passStudentRollNoSet = Set(3, 4, 22, 5, 6, 21, 87)
    println(s"Checking particular element present or not using contains method:${passStudentRollNoSet.contains(3)}")


    // Converting set into Array/List
    println(s"Converting set into List:${passStudentRollNoSet.toList}")

    // Sorted Set
    val sortedSet = scala.collection.SortedSet(4, 2, 3, 76, 24, 64, 33, 12)
    println(s"Elements of sorted set are:${sortedSet}")

    // LinkedHashset: It preserves the sequence of elements
    var linkedHashSet = scala.collection.mutable.LinkedHashSet(3, 44, 23, 26, 38, 54, 64)
    println(s"Elements of linkedHashSet are:${linkedHashSet}")


  }
}




















