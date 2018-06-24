//extending a class

//just like in Java

class Person{
  val name: String =""
  val age:Int = 0
}

class Employee extends Person{
  var salary = 0.0 //new fields or override fields
}


//cannot be extended
final class KKO{
}

//illegal inheritance
//class MMO extends KKO{
//
//}

class Indian{
  var name : String  = ""
  var age: Int = 0
  def desc = s"$name $age"
}

//use override modifier when override a
//method that is not abstract
class Apache extends Indian{
  override def desc = s"Apache tribe  $name  $age"
}



//invoking superclass method, as in Java : super
class Comanche extends Indian{
  override def desc = s"Comanche tribe  ${super.desc}"
}

val indian1: Indian = new Apache
indian1.name = "white"; indian1.age = 34
indian1.desc

val indian2: Indian = new Comanche
indian2.name = "blue";indian2.age = 54
indian2.desc

//type checks and casts

if (indian2.isInstanceOf[Comanche]){
  println("gotcha comanche")
  val comanche: Comanche = indian2.asInstanceOf[Comanche]
  comanche.desc
}else {
  println("don't get it")
}

if (indian1.isInstanceOf[Comanche]){
  println("gotcha comanche")
}else {
  println("don't get it")
}


//shocker for Java fans
val indian:Indian = null
indian.isInstanceOf[Comanche] //false
indian.asInstanceOf[Comanche] // null


val x: Person = null
x.asInstanceOf[Comanche] //null

// x.getClass  NPE

indian1.getClass == classOf[Apache]
indian2.getClass == classOf[Comanche]

//pattern matching is better

indian1 match{
  case s: Comanche => s.age
  case s: Apache => s.name
  case _ => println("don't know")
}