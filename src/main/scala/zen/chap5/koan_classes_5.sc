//auxiliary constructors
//each class you don't define a primary constructor
//has a primary constructor with no arguments

class Person{
  private var name = ""
  private var age = 0

  //auxiliary
  def this(name :String){
    this() // on the first line
    // each auxiliary constructor calls primary or
    // previous auxiliary constructor
    this.name = name
  }

  def this(name: String, age: Int) {
    this(name);
    this.age = age
  }
}

