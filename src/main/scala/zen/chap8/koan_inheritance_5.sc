//ABSTRACT CLASSES

abstract class Person(val name: String){
  def id: Int // no method body, this is an abstract method
}


//every Person  has an ID, but we don't know how to compute it
//in Scala, unlike in Java you DON'T USE an override keyword
// when you define a method that was abstract  in the superclass

class Employee(name: String) extends Person(name){
  def id  = name.hashCode //override keyword is not required
}


// ABSTRACT FIELDS

abstract class Persona{
   val id: Int  // no initializer - this is an abstract field with abstract getter
   var name: String  // no initializer -
  // this is an abstract field with abstract getter and setter
}

//generated Java class has no fields
//concrete  subclasses must provide  concrete fields
// no override keyword needed
class Employer(val id: Int) extends Persona{
  var name = ""
}


//USE-CASE: customize an abstract field by using an anonymous type
val fred =  new Persona{
    val id = 1729
    var name = "Fred"
}