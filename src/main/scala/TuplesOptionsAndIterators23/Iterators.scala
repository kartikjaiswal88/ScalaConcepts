package TuplesOptionsAndIterators23

object Iterators {
  /*
    1. Iterator is not a collection.
    2. It helps in providing methods to iterate over the elements inside the collection.
    3. next -> Gives next element.
       hasNext -> Check if next element is present or not
    4. Use hasNext before using next
   */

  def main(args: Array[String]): Unit = {
    val iterator1 = Iterator("Hello World", "Hello Singapore", "Hello USA")
    println(s"Accessing element of Iterator:${iterator1.next()}")
    println(s"Accessing element of Iterator:${iterator1.next()}")
    println(s"Accessing element of Iterator:${iterator1.next()}")

    println(s"Checking iterator has elements or not:${iterator1.hasNext}")

    val iterator2 = Iterator("Hello World", "Hello Singapore", "Hello USA")
    while (iterator2.hasNext) println(iterator2.next())

    val iterator3 = Iterator("Hello World", "Hello Singapore", "Hello USA")
    println(s"Maximum element of iterator3:${iterator3.max}")
    //    println(s"Minimum element of iterator3:${iterator3.min}") // It will give the error because iterator already at last.

    val iterator4 = Iterator("Hello World", "Hello Singapore", "Hello USA", "Hello India")
    println(s"Minimum element of iterator4:${iterator4.min}")

    val iterator5 = Iterator("Hello World", "Hello Singapore", "Hello USA", "Hello India")
    println(s"Number of elements in iterator5:${iterator5.length}")

    // Buffer Iterator
    val iterator6 = Iterator("Hello World", "Hello Singapore", "Hello USA", "Hello India")
    val bufferIterator = iterator6.buffered // It will store values in memory
    println(s"Head of buffer iterator:${bufferIterator.head}")
    println(s"Head of buffer iterator:${bufferIterator.head}")

    // Duplicate iterator
    val iterator7 = Iterator("Hello World", "Hello Singapore", "Hello USA", "Hello India")
    val duplicateIterator = iterator7.duplicate
    println(s"Duplicate iterator first value:${duplicateIterator._1.foreach(print)} and Second value:${duplicateIterator._2.foreach(print)}")
  }
}
