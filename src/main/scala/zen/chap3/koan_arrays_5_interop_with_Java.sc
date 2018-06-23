//Scala arrays are implemented as Java arrays
//you can pass them back and forth between Java and Scala


// in Java an array of a given type is aut. converted
// to an array of  a supertype

// String[] can be passed to a method which expects Object[]

// Scala doesn't permit this as it is unsafe



val a = Array("Mary", "has", "a", "little", "lamb")

//NOT WORKING : java.util.Arrays.binarySearch(a, "beef")
//Scala will not convert  Array[String] to Array[Object]

//force it
java.util.Arrays.binarySearch(a.asInstanceOf[Array[Object]], "beef")


//in Scala
import scala.collection.Searching._
import scala.collection.mutable.ArrayBuffer
val result = a.search("beef")
// Found(n) if found at n
//InsertionPoint(n) if not found but should be inserted
//before n .why?

//Java LIST <-> Scala BUFFER


//SCALA TO JAVA
import scala.collection.JavaConversions.bufferAsJavaList
val command = ArrayBuffer("is", "-al", "/home/cay")
val pb = new ProcessBuilder(command) //Scala to Java


//JAVA TO Scala
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer
val cmd : Buffer[String] = pb.command()
//can't use the ArrayBuffer, just Buffer



cmd == command




