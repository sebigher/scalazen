//SCALA INHERITANCE HIERARCHY


//classes that correspond to primitive types  in Java + type Unit
// extends AnyVal


//all other classes  are subclasses of AnyRef (synonym for the java.lang.Object)

//both AnyVal and AnyRef  extend the Any class, the root of hierarchy

//useful methods for Any:
//isInstanceOf, asInstanceOf and the methods for equality and hash codes

//AnyVal does not add any methods (just a marker for value types)

//AnyRef  adds the monitor methods: wait, notify/notifyAll from the Object class
// it also provides synchronized method with function parameter (equivalent with
// synchronized block in Java)

//don't use them directly, use higher-level concurrency constructs

// all Scala classes implements ScalaObject marker interface


// At the bottom of hierarchy  are Nothing and Null types

//Null ----> has only one instance which has the value null
// you can assign null to any reference but not to one of the value types

//ex: setting null to Int is not possible


//Nothing ---> has no instances, useful for generic constructs
//

val list: List[Nothing] = Nil
// list is subtype of List[T] for any T


// ??? method is declared with the return type Nothing
// never returns anything but it throws NotImplementedError

class Person(val name: String){
  def desc = ???
}

//the class compiles as Nothing is subtype of every type
// you can use the class so long as you don't call desc

//CAUTION: Nothing type is not the same as void in Java
//void is represented by Unit type, which has only one value: ()

//Unit is not a supertype of any other type
//However the compiler allows any value to be replaced by a ()

def printAny(x: Any) {println(x)}
printAny("kko")

def printUnit(x: Unit) {println(x)}
printUnit("Hello") //"Hello" gets replaced with ()


//method parameters with Any or AnyRef

def show(x: Any) = println(s"${x.getClass}: $x")
show(3)
show(3, 4, 5)
show() //Unit


