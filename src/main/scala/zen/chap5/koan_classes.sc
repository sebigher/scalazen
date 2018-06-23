//OOP:Classes

//- fields are coming out-of-the-box with getters and setters

// UAP (uniform access principle) : you can replace a field with custom getter/setter
//use @BeanProperty to generate the JavaBeans getxxx/setxxx
//every class has a default constructor that is glued with the class definition: its parameters turns into fields

//auxiliary constructors are optional (are called with this)


class Counter{
  private var value = 0 //you must initialize the field
  def increment () { value += 1} // methods are public by default
  def current() = value
  def present = value
}

//in Scala a class is not declared as public
//a file can contain multiple classes, all of them having the public visibility

//use the class

val myCOunter = new Counter()
myCOunter.increment()
myCOunter.current()

//still good
val myCounter2 = new Counter
myCounter2.current //parameterless method

//Convention: if a method mutates the state of the object
//use () for mutator
// skip () for accessor

// you can enforce this style directly when declaring the method

myCounter2.present

//Java use getters and setters and forbids public fields

/*
public class Person { // This is Java
    private int age;
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
*/

//age is called property
