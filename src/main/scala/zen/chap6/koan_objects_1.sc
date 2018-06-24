//SINGLETONS
//Scala has not static methods or fields
//instead it's using an 'object' construct


//an object defines a single instance of a class
//with the features you want

object Accounts{
  private var lastNumber = 0
  def newUniqueNumber() = {
    lastNumber += 1; lastNumber
  }
}
//how do you call it
Accounts.newUniqueNumber()

//the constructor of an object is executed
//when the object is first used

//an object can have essentially all the features
//of a class: it can even extend other classes or traits

//just ONE EXCEPTION:
// you cannot provide constructor parameters

//USE-CASES
//wherever you would have used a singleton in Java

// * home for utility functions or constants
// * when a single immutable instance can be shared efficiently
// * when a single instance is required to coordinate
// some service (the singleton design pattern)
