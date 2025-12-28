package PackageAndImports10.connectorReadMe

/*
 Packages are used to modularize the code

 1. Package inside Package(It is rarely used)
    package connector{
      package getCount{
         class KafkaConnector{

         }
      }
      package getData{
         class KafkaConnector{
         }
      }
    }
 2. Syntax:
      package <top-level-domain>.<domain-name>.<project-name>
 3. Use import keyword to use someone's code
 4. import <package_name>._
       means import everything inside the package
 5. By default imported packages
       Java.lang._
       Scala._
       Scala.Predef
  6. Rename/alias an imported class
       import <package-name>.{<className> =>alias}
  7. In Java, we need to write import statement at the start of program but in scala we can write import statement
     anywhere in middle of program.


 */

class KafkaConnectorReadMe {

}

import java.util._ // Importing everything inside the package.
import java.util.HashSet // Importing only one class which we want to use.
import java.util.{HashSet, Date} // Importing multiple classed from package
import java.sql.{Date => sqlDate} // Aliasing the Class to avoid confusion among classes

object Experiment {
  def main(args: Array[String]): Unit = {
    val hashSet = new HashSet()
    //    val date = new sqlDate(5)
    val date = new Date
    val datess = new java.sql.Date(6)

    println(date)
    println(datess)
  }
}
