//same while and do loops as in Java

var n: Int = 4
var r: Int = 0
while (n > 0){
  r = r  +  n
  println(r)
  n -= 1
}

println(r)

//Scala has no direct analog
// for(initialize; test; update)

// you have 2 choices
//1.while loop
//2. for statement
n = 5
println(r)
for(i <- 1 to n)
  r = r * i

println(r)

//range inclusive
1  to n

//for(i<- expression)
//varialble i will traverse all the values
//of the expression
// how? depends pn the type of expression



// how to loop ober a String
val s = "Hello"
var sum = 0
for(i <- 0 to s.length -1)
  sum += s(i)
sum

// you don't  need indexes
// you are directly looping over characters
var summy= 0
for(ch <-"Hello") summy += ch
summy

// loops are not often used :
// you can process the values in a sequence by applying
//a function to all of them which can be done
// with a single method call


// there is no break or continue from a loop
// you need to indicate what's breakable:

import scala.util.control.Breaks._
breakable{
  for(...){
    if(...) break;
  }
}

//as the syntax shows, behind the scene
//the control transfer is done by throwing
//and catching an exception
//it should be aviuded




