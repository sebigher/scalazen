//Anonymous subclasses
// as in Java

class Person(val name: String){
  //def greeting = s"My name is ${name}"
}

val alien = new Person("Fred"){
  def greeting  = "My name is Fred"
}

//this is an object of "structural type"
//the type is denoted
//Person{def greeting: String}

// you can use this type  as a parameter type
def meet(p: Person{def greeting: String}){
  println(s"${p.name} says ${p.greeting}")
}