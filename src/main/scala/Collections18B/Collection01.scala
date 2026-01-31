package Collections18B

object Collection01 {
  /*
     1. Collection is a library/package/class which can be used in another class or object.
     2. Powerful and rich set collections eg. ArrayBuffer, List, Map, Set  ...
     3. Collection can be lazy and strict.
     4. Collection can be mutable and immutable also.
     5. Search scala collection image on google and try to understand it.
     6. Traversable has methods which helps to traverse through entire collection
     7. Iterable has methods which helps to access each elements of collection.
     8. Seq contains the ordered elements
     9. Set have collection of unique elements.
     10.Map have key-value Elements.
     11.Immutable: We cannot change the content of collection whether it's val or var, eg. String, List.
     12.Mutable: We can change the content of collection whether it's val or var, eg. Array.
     13.Hashmap and Hashset can be both mutable and immutable.
     14.scala.collection.mutable._
     15.scala.collection.immutable._

   */

  def main(args: Array[String]): Unit = {

    // Mutable Collection
    val arr = scala.collection.mutable.ArrayBuffer(2, 3, 4, 5, 6)
    arr.foreach(println)

    arr += 7 // We can add element because it is mutable but if it had been immutable then we cannot add.
    //    arr  = arr.map(_+1)  We cannot reassign value to val variable or object but we can do in case of var.
    arr.map(_ + 1)
    arr.foreach(println)


    // Immutable Collection
    val list = scala.collection.immutable.List(1, 2, 3, 4, 5)
    //    list += 12  We cannot one more element as it is immutable because += not available in scala.collection.immutable
    var list1 = list :+ 6
    list1.foreach(println)

    //    list1 = list1.map(_+1) // We cannot reassign because of val and in case of var it will create new list and assign it
    println(list1.hashCode())
    list1 = list1.map(_ + 1)
    list1 = list1 :+ 10 // We can do this because list1 is var and we can reassign it
    println(list1.hashCode())
  }

}

















