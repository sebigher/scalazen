
//TRANSFORM ARRAY : FOR/YIELD LOOP
// main idea: yield another collection
// the original collction is not affected
// by the processing

val a = Array(2, 7, 34, 545, 324)

// produce another array from this array

//yield

val result = for (elem <- a) yield 2 * elem
result
//new collection with the same type of the
//original collection


// USE-CASE
//process only the elements that are matching
//certain condition

val result2 =
  for (elem <- a if elem % 2 == 0) yield 2 * elem
result2

a
for (elem <- a if elem % 2 == 0){
  print("/" + elem + "/")
}

//write it functional
// filter is playing the if role
//map is playing the yield role
val b = a.filter(_ % 2 == 0).map(2 * _)


//practice
//remove all the negatives from am array buffer
import scala.collection.mutable.ArrayBuffer
val c = ArrayBuffer(2 , -1 , -100, 34, 23132, -67)
c


//sloppy, Javish
var n = c.length
var i = 0

while(i < n){
  if(c(i) >= 0 ) i += 1
  else {
    println(c)
    c.remove(i);
    print(c.length + " length after removal "); println(c)
    n -=1
  }
}
c

val d = ArrayBuffer(2 , -1 , -100, 34, 23132, -67)
//Scala, with the cost of creating a new ArrayBuffer
val resul3 = for(elem <- d if (elem >=0) == 0)
    yield  elem

// Scala, keep the original one
//collect the wrong guys places from the array
val positionsToRemove = for(i <- d.indices if d(i) < 0)
  yield i
//remove the guys from the original arrays
for (i <- positionsToRemove.reverse) d.remove(i)

//optimization tip: it's better to have all index values
//together instead of seeing them one by one

