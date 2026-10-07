  package PackageAndImports10.connectorReadMe

  /*
  * ================================================================
  *                       PACKAGES & IMPORTS
  * ================================================================
  *
  * Interview Definition:
  * A package is a mechanism used to organize related Scala
  * definitions such as classes, objects, traits and other members
  * into a logical namespace.
  *
  * Imports allow code from another package or scope to be referenced
  * without using its fully qualified name.
  *
  *
  * ================================================================
  * 1. PURPOSE OF PACKAGES
  * ================================================================
  *
  * Packages are mainly used for:
  *
  * - Organizing code into logical modules.
  * - Avoiding naming conflicts.
  * - Providing namespaces.
  * - Controlling accessibility together with access modifiers.
  * - Making large projects easier to maintain.
  *
  *
  * ================================================================
  * 2. NESTED PACKAGES
  * ================================================================
  *
  * Scala supports packages inside other packages.
  *
  * This allows code to be organized into multiple levels of
  * namespaces.
  *
  * Conceptually:
  *
  *     top-level package
  *          ↓
  *     sub-package
  *          ↓
  *     class/object
  *
  * Nested packages are useful when a project requires a deeper
  * package structure.
  *
  *
  * ================================================================
  * 3. PACKAGE NAMING
  * ================================================================
  *
  * A package name can contain multiple levels separated by dots.
  *
  * A common convention is to organize packages using a structure
  * similar to:
  *
  *     company.domain.project
  *
  * Package naming is a convention; Scala does not require a fixed
  * top-level-domain/domain/project structure.
  *
  *
  * ================================================================
  * 4. IMPORT
  * ================================================================
  *
  * The `import` keyword allows members from another package or scope
  * to be referenced without repeatedly writing their fully qualified
  * names.
  *
  * Importing is useful for classes, objects, methods and other
  * accessible members.
  *
  *
  * ================================================================
  * 5. IMPORT EVERYTHING FROM A PACKAGE
  * ================================================================
  *
  * Scala uses `_` as a wildcard import.
  *
  * A wildcard import makes accessible members from the specified
  * package available in the current scope.
  *
  * In Scala 3, wildcard imports use `_`.
  *
  *
  * ================================================================
  * 6. IMPORTING SPECIFIC MEMBERS
  * ================================================================
  *
  * Specific classes or members can be imported instead of importing
  * everything from a package.
  *
  * This makes dependencies more explicit and can reduce unnecessary
  * names being introduced into the current scope.
  *
  *
  * ================================================================
  * 7. IMPORTING MULTIPLE MEMBERS
  * ================================================================
  *
  * Multiple members from the same package can be imported together
  * using braces.
  *
  * This is useful when only a selected set of classes or members
  * is required.
  *
  *
  * ================================================================
  * 8. IMPORT ALIAS
  * ================================================================
  *
  * Interview Definition:
  * An import alias gives an imported class or member another name
  * in the current scope.
  *
  * Syntax concept:
  *
  *     import package.{OriginalName => AliasName}
  *
  * Aliasing is especially useful when two different packages contain
  * classes with the same name.
  *
  * Example situation:
  *
  *     java.util.Date
  *     java.sql.Date
  *
  * Both classes are named `Date`, so an alias can be used to
  * distinguish one of them.
  *
  *
  * ================================================================
  * 9. DEFAULT IMPORTS
  * ================================================================
  *
  * Scala automatically makes commonly used definitions available
  * through default imports.
  *
  * Important default imports include:
  *
  *     java.lang._
  *     scala._
  *     scala.Predef._
  *
  * `Predef` provides commonly used functionality such as
  * `println`, basic conversions, and other standard definitions.
  *
  *
  * ================================================================
  * 10. LOCATION OF IMPORTS
  * ================================================================
  *
  * Scala provides more flexibility than Java regarding the location
  * of imports.
  *
  * Imports can appear at different scopes, including:
  *
  * - Package scope
  * - Class/object scope
  * - Method scope
  * - Block scope
  *
  * This allows imports to be limited to the part of the program
  * where they are actually required.
  *
  *
  * ================================================================
  * 11. FULLY QUALIFIED NAME
  * ================================================================
  *
  * A class or member can also be accessed using its complete package
  * path instead of importing it.
  *
  * This is useful when two classes have the same name or when
  * explicitly showing the source of a class improves readability.
  *
  *
  * ================================================================
  * KEY INTERVIEW POINTS
  * ================================================================
  *
  * 1. Packages provide namespaces and organize related code.
  *
  * 2. Scala supports nested packages.
  *
  * 3. `import` allows members to be referenced without their
  *    fully qualified names.
  *
  * 4. `_` is used for wildcard imports in Scala 3.
  *
  * 5. Specific members can be imported individually.
  *
  * 6. Multiple members can be imported together using braces.
  *
  * 7. Import aliases are useful when two classes have the same name.
  *
  * 8. Scala provides default imports such as:
  *       java.lang._
  *       scala._
  *       scala.Predef._
  *
  * 9. Scala allows imports at different scopes rather than requiring
  *    all imports to appear only at the beginning of the source file.
  *
  * 10. A fully qualified name can be used when an import is not
  *     desired or when name conflicts need to be avoided.
  *
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
