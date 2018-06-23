
//FIXED-LENGTH ARRAY
// you need an array that doesn't change length

val nums = new Array[Int](10)
// all initialized by 0

val strs = new Array[String](7)
//all initialized by null


//other way to define
val strz = Array("Hello", "Good bye")
// length = 2, type is inferred

strz(0)
//Scala is using () instead of [] like in Java
//tp access an element


import scala.collection.mutable.ArrayBuffer
//VARIABLE-LENGTH ARRAY
//Java's ArrayList

val numsb = ArrayBuffer[Int]()
val numsc = new ArrayBuffer[Int]
numsb.length
// empty

numsb +=1
// adding an element at the end
numsb.length


//add multiple elements
numsb += (1, 2, 1, 3)
numsb.length

// append another collection


numsc += (0, 9, 10)
//append at the end
numsb
numsb ++= numsc

numsb.length
//remove the four element (not so efficient)
numsb.remove(3)

//insert on some place
numsb.insert(2 ,100)
numsb

//insert starting from one place
numsb.insert(2, 101, 104, 107)
numsb

numsb.length
numsb

//remove the last 3
numsb.trimEnd(3)
numsb.length
numsb

// remove from position, how many elements
numsb.remove(1, 3)
numsb


// when you need both types of array
// first create an ArrayBuffer, then make an Array

//Array <-> ArrayBuffer
numsb.toArray

//or vice-versa
nums.toBuffer

