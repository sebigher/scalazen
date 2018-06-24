//CONSTRUCTION ORDER AND EARLY DEFINITION
//when you override  a val in a subclass  and use
//the value  in a superclass  constructor


class Creature{
  println("Enter the Creature constructor")
  val range: Int  = { println("set range 10 from Creature:");10}
  val env: Array[Int] = {
    println ("who you gonna call:" + this.range);
    new Array[Int](range)
  }
  println("Exit the Creature constructor")
}

val creature = new Creature
creature.range
creature.env


class Ant extends Creature{
  println("Entering the Ant constructor")
  override val range = {println("set range from Ant: " + range);2}
  println ("this range: " + this.range )
  println("Exit the Ant constructor")
}

val anty = new Ant
anty.range   //2
anty.env // length 0 and not 2!!!


//problem: the range value is used in superclass constructor
//which runs before the subclass constructor

//Ant constructor -> Creature constructor
// Creature constructor -> sets range to 10,
// but also calls range() getter for initialize env
// the method is overriden to yield the range field
// of the Ant class uninitialized
// range is 0 for Ant env

//Ant constructor continues to set the range to 2


// moral: not rely on the value of val in the body of a constructor

//solutions:
//1) declare val final
//2) val as lazy in the superclass
//3) the best: use 'early definition syntax' in the subclass

//EARLY DEFINITION SYNTAX
class Ant2 extends {override val range = 2} with Creature

//Explanation:
//At the root of the construction order problem lies a design decision
// of the Java language—namely
//to allow the invocation of subclass methods in a superclass constructor.

//In C++, an object’s virtual function table pointer is set to the table of the superclass
// when the superclass constructor executes.
// Afterwards, the pointer is set to the subclass table.
// Therefore, in C++, it is not possible to modify constructor behavior
// through overriding.
//
// The Java designers felt that this subtlety was unnecessary,
// and the Java virtual machine does not adjust
// the virtual function table during construction.

