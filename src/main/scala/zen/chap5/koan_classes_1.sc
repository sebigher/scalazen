//Scala  provides getter and setter for every field

class Person{
  var age = 0
}

//that's a public field
//behind the scene Scala generates a class for JVM with
// a private age field  + getter/setter public

//getter and setter in Scala
val fred = new Person
fred.age = 20  //calls fred.age_=  which is the setter
fred.age_=(22)
println(fred.age)  //calls fred.age(), the getter
//In Scala, the caller of fred.age doesn’t know whether age
//is implemented through a field or a method


// redefine getter and setter
class Person2{
  private  var secretAge = 0 //make private
  def age = secretAge  // getter
  def age_= (newValue: Int): Unit = {
    if (newValue > secretAge) secretAge = newValue
  }
}

val jim = new Person2
jim.age
jim.age = 21
jim.age = 20 // jim still has 21



