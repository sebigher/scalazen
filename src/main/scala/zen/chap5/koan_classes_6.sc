import java.io.FileReader
import java.util.Properties
//PRIMARY CONSTRUCTOR

//each class has it
//is not defined with 'this' method

//it's glued with the class definition

class Person(val name:String, val age: Int){
   println("Just created ") // part of primary constructor
   def description = s"$name is $age old"
}

val persona = new Person("dsdsd", 34)

// the primary constructor executes all statements
//in the class definitions

persona.description

//USE-CASE
class MyProp{
  private val  props = new Properties()
  props.load(new FileReader("my.properties"))
  // the statement above is a part of primary constructor
}

//no parameters  after the class name, the default/primary constructor
//has no parameters
// it's just simply executes  all statements in the body of class


//you can eliminate  auxiliary constructors by using default
//values in the primary constructor

class Citizen(val name: String = "", val age:Int = 0)

// primary constructor can have any form of parameters
class Democrat(val name: String ="", private var age: Int )

// can be regular method parameters. How they are processed?
//depends how they are used inside the class
class Republican(name: String, age: Int){
    def descr = s"$name has $age years"
}
// in this case name and string are immutable fields
//they are object-private

//equivalent:
class Stalinist{
  private[this] val name:String = ""
  private[this] val age: Int = 0
  def descr = s"$name has $age years"
}

//RULE: if the parameter is used inside at least of one method
//it becomes a field, otherwise not
// it can only be accessed in the code of the primary constructor



//Martin Odersky suggests to think about it this way:
// "In Scala, classes take parameters, just like methods do.”

//the scope of such parameters is the entire class
//therefore you can use the parameters in methods
//if you do, it's the compiler job to save it in a field


//how to look at a class

class Indian(val name:String){ // part of primary constructor
  var age:Int  = 0 // part of primary constructor
  def descript =s"$name + $age"
}

// make the primary constructor private
//you force the user of the class
//to use at least one of the auxiliary constructors
class Cowboy private(val age:Int ){
  //...
}
