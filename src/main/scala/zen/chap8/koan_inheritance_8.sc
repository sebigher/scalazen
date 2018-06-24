//Object equality
//in Scala eq method of AnyRef
//checks whether there 2 references on the same object

//equals method from AnyRef calls eq
//as in Java you should consider  overriding
//the equals method

class Item(val description: String,
           val price: Double){
  final override def equals(other:Any) = {
    other.isInstanceOf[Item] && {
      val that = other.asInstanceOf[Item]
      description == that.description && price == that.price
    }
  }
}

// with pattern matching

class Item2(val description: String,
           val price: Double) {
  final override def equals(other: Any) =
    other match {
      case that: Item =>
        description == that.description &&
          price == that.price
      case _          => false
    }

  final override def hashCode = (description, price).##
}

//is final because is very difficult to extend
//equality in a subclass

// be sure to define equality with Any parameter type
//don't supply an == method
//you can't override the == method in AnyRef


// as in Java : define hashCode as well

// ## is a null-safe method that yields 0 for null
// instead throwing exception

//in application you don't call eq or equals
// simply use == which calls equals after
//doing the appropiate check for nulls