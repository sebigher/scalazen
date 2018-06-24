//overriding fields
//what is a field in Scala?
// private field + accessor/mutator methods

//you can override a val (or a parameterless def)
// with another val field of the same name

//how?
class Person(val name: String){
  override def toString = s"${getClass.getName} [name=$name]"
}

class SecretAgent(codename: String) extends Person(codename){
  override val name: String = "secret" //override the val field
  override def toString: String = "secret" //override the def
}

//another way, more common
//override  an abstract def with val
abstract class Persona{
  def id: Int //each person has an id that is computed in some way
  //...
}

class Student(override val id: Int) extends Persona

//Some restrictions when overriding:
//1) a def can override only another def
//2)  a val can override another val  or a parameterless def
//3)  a var can override only an abstract var

//if you provide a var in superclass, all the subclasses will stuck with it