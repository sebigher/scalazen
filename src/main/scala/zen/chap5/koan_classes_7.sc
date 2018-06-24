import scala.collection.mutable.ArrayBuffer
//NESTED CLASSES

//in Scala you can nest anything inside anything
class Network{
  class Member(val name:String){
    val contacts = new ArrayBuffer[Member]()
  }

  private val members = new ArrayBuffer[Member]()

  def join(name: String)={
    val m = new Member(name)
    members += m
    m
  }
}

val chatter = new Network
val myFace = new Network


// each instance has its own class Member
//chatter.Member, myFace.Member are different classes
// so, you can add its own network but no across network

//!!!!
// different from Java where an inner class belongs to the outer class


//Scala:
val mem = new chatter.Member("aaa")
val mem2 = new myFace.Member("bbb")

// in Java you need a special syntax
// chatter.new Member()


val fred = chatter.join("Fred")
val wilma = chatter.join("Wilma")
fred.contacts += wilma

val barney = myFace.join("Barney") // type myFace.Member
//fred.contacts += barney //type mismatch myFace.Member vs chatter.Member

//you can access the 'this' of enclosing class like in Java
//to be continued....



