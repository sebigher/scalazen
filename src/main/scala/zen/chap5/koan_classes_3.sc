 // Object-private fields:  private[this]
// no getter os setter are generated




// a method can access the private fields of all objects
// of its class like in Java

class Counter3{
  private var value = 0
  def increment() {value += 1}

  def isLess(other: Counter3) = value < other.value
}

//until now, nothing special
//Scala allows a more refined control with the
// private[this] qualifier

class Counter4{
  private[this] var value = 0
  def increment(){}

  //def isLess(other: Counter4) = value < other.value
  //cannot do that: value is accessable only by the current object
  //you cannot access otherObject.value
}


//there are also
 // private[ClassName]