//Exceptions

//BAD NEWS
//work the same way as Java's

//  throw new IllegalArgumentException("Should be right" +
//    "but is wrong!")

//what happens?
//1. current computation is aborted
//2. runtime system us looking for an
// exception handler for that type
// of exception

// control resumes with the inermost such handler
// no handler found, program terminated

// object thrown as exception belong
// to a subclass of ---duh----
// java.lang.Throwable


//BUT GOOD NEWS
//Scala has no checked exception
// Scala has no "checked" exceptions
// no "czech" exception :-)

//What does it mean for you?
// don't have to declare(check)
// that a function or method might
// throe an exception


// Remember Java: "checked" exceptions --->
// are checked at compile

// OK: we throw an exceotion, now what?

import java.io.InputStream
import java.net.{MalformedURLException, URL}

import scala.math.sqrt
val x = 8
val res = if(x >= 0){
  sqrt(x)
} else
  throw  new IllegalArgumentException("Be more precise!")



// the throw expression has the special type Nothing
//why so specual?
// if  one branch has type Nothing, the type of if/else
//is the type of the other branch

// for the above res is of type Double


//CATCHING AN EXCEPTION
//the syntax is similar with pattern matching

def process(url : URL) = {
  // can throw exception
}

def process(url :InputStream): Unit = {
  //can throw
}

import java.io.IOException
val url = new URL("https://www.google.com")

try{
  process(url)
} catch{
  case _: MalformedURLException => println(s" Bad URL $url")
  case ex: IOException => ex.printStackTrace()
}


// as in Java, the more general exceptions are, should come
// after the more specific ones


//try/finally
// the business case is when you need to dispose of a resource
// whether or not an exception has occured

val in = new URL("http://horstmann.com/fred.gif").openStream()

  try{
    process(in)

  }finally {
    in.close()
  }

// finally is executed no matter what: whether
// or not the process function throws an exception

//Scala does not have an analog to the Java try-with-resources statement.

