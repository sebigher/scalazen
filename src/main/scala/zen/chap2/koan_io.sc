// to print a value
// the most common example of side-effect

//same
print("Answer\n")
println(43)

val name = "Joe H."
val money = 2.5

//using string interpolation
println(f"Hello, $name! You got:  " +
  f"${money + 23.56566}%7.2f" )

// formatted string prefixed with the letter
// f interpolator is type-safe:

// if you use %f with an expression that isn't
// a number, the compiler reports an error

//${ expressions that are not variables names}

//bad example
val str = "aaa"
//println(f"$str%7.2") //()



// raw interpolation: not interpreting new lines
println(raw"coco\n nuts\n") // coco\n nuts\n
println("coco\n nuts\n")

//$sign inside an interpolated string
s"${str}$$" //aa$

//read from console in Scala

import scala.io._
val name2 = StdIn.readLine("Your name: ")
print("Your age: ")
val age = StdIn.readInt()
println(s"Hello, $name2 . Next year you will be ${age + 1}")



