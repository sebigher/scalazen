//Traits

//Java: a class can  extend only superclass
// it can implement any number of interfaces

//in turm, interfaces can have only abstract, static or default methods and NO fields

// what about default methods? Very restricted.
// default methods can call only other interface methods
//cannot make use of the object state --> that's why the common practice
//to provide interface + abstract base class


//TRAIT to the rescue
//can have abstract and concrete methods
//as well state
// a class can implement multiple traits

//1) trait  can work exactly as a Java interface



trait Logger{
  def log(msg: String) //abstract, no need to declare it
}

//use extends and not implements
class ConsoleLogger extends Logger{
   def log(msg: String )  {println(msg)}
}
//no need to write 'override'

//you need more traits?

class BigLogger extends
   Logger with Cloneable with Serializable{
  // this is viewed by compiler as one type Logger with Cloneable with Serializable
  def log(msg: String) {println(msg)}
  ///
}

// all Java interface can be used as Scala traits
// as in Java, a Scala class can have only one
//superclass but any number of traits

