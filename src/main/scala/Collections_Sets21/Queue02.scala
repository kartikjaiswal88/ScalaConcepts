package Collections_Sets21

object Queue02 {

  def main(args: Array[String]): Unit = {
    val numberQueue = scala.collection.mutable.Queue(3, 20, 33, 54, 35, 68, 79)
    println(s"Elements of queue are:${numberQueue}")

    numberQueue += 5
    numberQueue.enqueue(54)
    println(s"Elements of queue after adding the elements:${numberQueue}")
    println(s"Removing the first element of queue:${numberQueue.dequeue()}")
    println(s"Removing the first element of queue conditional basis:${numberQueue.dequeueFirst(x => x % 5 == 0)}")
    println(s"Removing all the elements of queue conditional basis:${numberQueue.dequeueAll(x => x % 2 == 0)}")


  }

}
