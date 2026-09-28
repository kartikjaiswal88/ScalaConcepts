package PatternMatchingAndRegex08

import scala.util.matching.Regex


/*
 * ================================================================
 *                    PATTERN MATCHING & REGEX
 * ================================================================
 *
 * Interview Definition:
 * Pattern matching in Scala is a mechanism used to compare a value
 * against different patterns and execute the corresponding branch.
 * Unlike a traditional switch statement, Scala's `match` is an
 * expression and can return a value.
 *
 *
 * ================================================================
 * 1. BASIC PATTERN MATCHING
 * ================================================================
 *
 * Syntax:
 *
 *   expression match {
 *     case pattern1 => result1
 *     case pattern2 => result2
 *     case _        => defaultResult
 *   }
 *
 * Important:
 *
 * - `match` compares the input against cases from top to bottom.
 * - The first matching case is executed.
 * - `case _` is the wildcard pattern and acts as a default case.
 * - `match` is an expression, so it can produce a value.
 * - `return` is generally not required.
 *
 *
 * ================================================================
 * 2. CASE CLASS PATTERN MATCHING
 * ================================================================
 *
 * Case classes work particularly well with pattern matching because
 * Scala automatically generates an `unapply` method that allows the
 * object's values to be extracted.
 *
 * Case-class pattern matching can:
 *
 * - Match specific field values.
 * - Extract field values into variables.
 * - Match different combinations of object data.
 *
 * Example concept:
 *
 *   A Car object can be matched based on its name and price.
 *
 * Important Case Class Features:
 *
 * - Constructor parameters are `val` by default.
 * - `var` can be explicitly used when mutability is required.
 * - `apply` is automatically generated for convenient object creation.
 * - `unapply` supports pattern matching and value extraction.
 * - `equals` and `hashCode` are automatically generated.
 * - `toString` is automatically generated.
 * - `copy` is automatically generated.
 *
 *
 * ================================================================
 * 3. REGULAR EXPRESSIONS
 * ================================================================
 *
 * Interview Definition:
 * A Regular Expression (Regex) is a pattern used to search,
 * identify, extract, or validate text based on a defined rule.
 *
 * Scala provides regular-expression support through
 * `scala.util.matching.Regex`.
 *
 * On the JVM, Scala Regex is built on Java's regular-expression
 * facilities.
 *
 *
 * ================================================================
 * 4. CREATING A REGEX
 * ================================================================
 *
 * A Regex can be created using:
 *
 * - The `Regex` class.
 * - The `.r` extension method on a String.
 *
 * `.r` converts a String pattern into a Regex object.
 *
 *
 * ================================================================
 * 5. findFirstIn
 * ================================================================
 *
 * `findFirstIn` searches for the first occurrence of a pattern
 * inside a String.
 *
 * Return Type:
 *
 *   Option[String]
 *
 * Possible results:
 *
 * - `Some(value)` → a match was found.
 * - `None`       → no match was found.
 *
 * Since the result is an Option, `getOrElse` can be used to provide
 * a default value when no match is found.
 *
 *
 * ================================================================
 * 6. findAllIn
 * ================================================================
 *
 * `findAllIn` searches for all occurrences of a pattern.
 *
 * It returns a `Regex.MatchIterator`.
 *
 * Common operations:
 *
 * - `foreach` → process every match.
 * - `mkString` → combine all matches into a String.
 * - `toArray` → convert matches into an Array.
 *
 *
 * ================================================================
 * 7. IMPORTANT REGEX SYMBOLS
 * ================================================================
 *
 * `[0-9]`
 *     Matches exactly one digit from 0 to 9.
 *
 * `+`
 *     Matches one or more occurrences of the preceding pattern.
 *
 * `*`
 *     Matches zero or more occurrences of the preceding pattern.
 *
 * `?`
 *     Makes the preceding pattern optional, meaning zero or one
 *     occurrence.
 *
 * `\d`
 *     Represents a digit.
 *
 * `\.`
 *     Represents a literal dot.
 *     The dot normally has a special meaning in Regex, so it must
 *     be escaped when matching an actual period.
 *
 * `(...)`
 *     Creates a capturing group.
 *
 * `|`
 *     Represents OR / alternatives.
 *
 *
 * ================================================================
 * 8. NUMBER REGEX
 * ================================================================
 *
 * A pattern such as `[0-9]+` means:
 *
 *     one or more digits.
 *
 * Therefore it can match:
 *
 *     2
 *     23
 *     123
 *     2026
 *
 * It does NOT mean "greater than one digit".
 *
 *
 * ================================================================
 * 9. CASE-SENSITIVE / CASE-INSENSITIVE MATCHING
 * ================================================================
 *
 * Regex matching is case-sensitive by default.
 *
 * If both uppercase and lowercase forms should be accepted,
 * alternatives can explicitly be provided using `|`.
 *
 * Example concept:
 *
 *     `(K|k)`
 *
 * means either `K` or `k`.
 *
 * This is not changing Regex into case-insensitive mode;
 * it is explicitly defining two possible characters.
 *
 *
 * ================================================================
 * 10. RAW STRING FOR REGEX
 * ================================================================
 *
 * Scala's triple-quoted String is useful for Regex patterns because
 * backslashes do not need the same level of escaping required in
 * ordinary String literals.
 *
 * This makes expressions containing `\d`, `\.` and similar patterns
 * easier to read.
 *
 *
 * ================================================================
 * 11. getOrElse WITH REGEX
 * ================================================================
 *
 * `findFirstIn` returns an Option.
 *
 * `getOrElse` allows a fallback value to be supplied when the result
 * is `None`.
 *
 * This avoids directly accessing a potentially missing value.
 *
 *
 * ================================================================
 * 12. foreach WITH REGEX
 * ================================================================
 *
 * `foreach` can be used on the result of `findAllIn` to process every
 * matched occurrence individually.
 *
 *
 * ================================================================
 * 13. COMPLEX REGEX
 * ================================================================
 *
 * A Regex can combine multiple operators to describe more complex
 * patterns.
 *
 * For example, a decimal-number pattern can combine:
 *
 * - Optional negative sign
 * - One or more digits
 * - Optional decimal portion
 * - A literal decimal point
 *
 * Such expressions are useful for extracting numbers from larger
 * Strings.
 *
 *
 * ================================================================
 * KEY INTERVIEW POINTS
 * ================================================================
 *
 * 1. `match` in Scala is an expression, not just a statement.
 *
 * 2. `case _` is the wildcard/default pattern.
 *
 * 3. Case classes support pattern matching through automatically
 *    generated `unapply`.
 *
 * 4. `.r` converts a String pattern into a Regex.
 *
 * 5. `findFirstIn` returns `Option[String]`.
 *
 * 6. `findAllIn` returns a `Regex.MatchIterator`.
 *
 * 7. `Some` means a match was found; `None` means no match.
 *
 * 8. `getOrElse` provides a fallback for an Option.
 *
 * 9. `[0-9]+` means one or more digits.
 *
 * 10. `*` means zero or more occurrences.
 *
 * 11. `?` means zero or one occurrence / optional.
 *
 * 12. `|` represents OR.
 *
 * 13. Regex matching is case-sensitive by default.
 *
 * 14. Scala Regex is based on Java's regex facilities on the JVM.
 *
 * 15. Triple-quoted Strings are convenient for writing Regex
 *     patterns containing backslashes.
 *
 */

object PatternMatching {
  /*
  Matches sequence of Data:
  Syntax case =>
       (parameter to Match) match{
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
