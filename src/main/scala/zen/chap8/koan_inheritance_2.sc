import java.nio.charset.Charset
import java.nio.file.{Files, Path}
//superclass construction
//only the primary constructor can call the superclass construction
//directly

//the primary constructor is 'glued' with the class definition
class Person(val name: String, val age: Int)

// the call to superconstructor is the same 'glued'
class Employee(name: String, age: Int, val salary: Double)
  extends Person(name, age)

//it helps thinking that the parameters of the primary
//constructor are the 'class parameters'

//in Scala constructor you never call super(params)

//a Scala class can extend a Java class
//its primary constructor  must invoke one of the
//constructors of the Java superclass

class PathWriter(p: Path, cs: Charset ) extends
java.io.PrintWriter(Files.newBufferedWriter(p, cs))


