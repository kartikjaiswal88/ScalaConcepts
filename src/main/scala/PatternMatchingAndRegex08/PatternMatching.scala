package PatternMatchingAndRegex08

import scala.util.matching.Regex

object PatternMatching {
  /*
  Matches sequence of Data:
  Syntax case =>
       (parameter to MatchSSSS) match{
         case 1=> return value
         case 2=> return value
        }

   Pattern Matching using case classes
   Case Classes:
   1. Default parameters are val (immutable)
   2. It generates some function/methods automatically when you decide class as case class. It includes methods like equals, hashCode, toString etc.


  Pattern Matching using Regular Expressions:
  1. Regular Expressions in scala is adopted from Java.
  2. Java regular expressions is also adopted from Perl.
  3. Need to import to use Regular expressions
     import scala.util.matching.Regex
  4. You have to create object of class Regex
     val pattern = new Regex("Whatever you want to match")
     or
     val pattern = "Whatever you want to match".r

     r is a method that is defined in a Regex class and it does nothing but calls the constructor.
  5. "[0-9]+".r find all the numbers between 1 and 9 and + means greater than one digit
  6. Use pattern (A|a) for case sensitive patttern matching
  7. Using getOrElse with Regular Expressions
  8. Options for regular expressions in scala:https://www.geeksforgeeks.org/scala/regular-expressions-in-scala/  or https://www.tutorialspoint.com/scala/scala_regular_expressions.htm


  */

  def matchPattern(x: Any): Any = {
    x match {
      case 1 => "One"
      case 2 => "Two"
      case "Three" => 3
      case "Four" => 4
      case _ => "None of the Above"
    }
  }

  case class Car(name: String, price: Int)

  def main(args: Array[String]): Unit = {
    println(matchPattern(8))

    // Pattern Matching using case classes
    val mercedes = Car("Merceds", 500000)
    val bmw = Car("BMW", 600000)
    val Jaguar = Car("Jaguar", 799999)

    for (car <- List(mercedes, bmw, Jaguar)) {
      car match {
        case Car("BMW", 600000) => println("Congrats Car is BMW!")
        case Car("Merceds", 500000) => println("Congrats Car is Mercedes!")
        case Car(name, price) => println(s"Car is $name and its price is $price")
      }
    }

    // Pattern Matching using Regular expressions
    val pattern = "Kartik".r
    //    val pattern = new Regex("Kartik")

    val stringToFind = "Hello Kartik, How are you? Are you Kartik"
    val stringToFind1 = "Hello Jaiswal, How are you?"

    println(pattern findFirstIn (stringToFind)) // Gives some or none
    println(pattern findFirstIn (stringToFind1))

    println({
      pattern findAllIn (stringToFind)
    }.mkString(","))


    // Number pattern matching
    val numberString = "Hello My name is Kartik, I am 23 year old and studied in 12 standard and studying for 2 hours"
    val numberPattern = "[0-9]+".r // here + means greater than one digit

    println({
      numberPattern findAllIn (numberString)
    }.mkString(","))
    println({
      numberPattern findAllIn (numberString)
    }.toArray.mkString(","))

    // CaseSensitive pattern matching
    val caseSensitiveString = "Hello Kartik, How are you? Are you kartik"
    val caseSensitivePattern = "(K|k)artik".r
    println({
      caseSensitivePattern findAllIn (caseSensitiveString)
    }.mkString(","))

    // Using getOrElse for pattern Matching
    println({
      pattern findFirstIn (stringToFind1) getOrElse ("No Kartik Found")
    }.mkString(""))

    // Using foreach for pattern matching
    val youPattern = "you".r
    youPattern findAllIn stringToFind foreach (d => println(d))


    // Intermediate Stage
    val stringToFindIntermediate = "Hello! I am able to do it, abl1 able able0"
    val patternIntermediate = "abl[ae]\\d*".r

    println({
      (patternIntermediate findAllIn stringToFindIntermediate)
    }.mkString(", "))


    //    val exerPattern = "(-)?\\d+(\\.\\d*)?".r
    val exerPattern = """(-)?\d+(\.\d*)?""".r
    val exerString = "-1.5 is divided by 5 is equal to 3"

    println({
      exerPattern findAllIn exerString
    }.mkString(", "))


  }

}
