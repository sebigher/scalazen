//Scala has functions in addition to the methods
// what's the difference? method operates on objects, functions don't


//Java imitates functions with static methods

def abs(x: Double) = if (x >= 0) x else -x

//-must specify the types of all parameters
// - return type is a must only when function is recursive

def fac(n: Int) = {
  var r = 1
  for (i <- 1 to n) r = r * i
}

// there is no need to return type on the last ex

// why is not a good idea to use return
// in anonymous functions, return type doesn't return  a value
// to the caller but breaks out to the enclosing named function


def facRec(n: Int): Int = if (n<=0) 1 else n* facRec(n-1)

// without the return type, Scala compiler
//couldn't verify that the type of n* facRec(n-1) as an Int


//DEFAULT AND NAMED ARGUMENTS: you can provide default arguments

def decorate(str: String, left: String = "[", right: String = "]") = left + str + right

decorate("Hello")
decorate("Hello", "<<", ">>")

//the defaults are applied from the end (<-------------)
decorate("Hello", "<<<")

//specify named arguments

decorate("Hello", right = "+++")

//the order is not important when you specify named arguments


//VARIABLE ARGUMENTS

def sum(args: Int*)={
  var result = 0
  for (arg <- args)
    result += arg
  result
}
sum(1, 2,5, 6)
// the argument is in fact of type Seq

//you cannot pass directly a sequence of values

//val s = sum(1 to 5) // type mismatch

//solution
val s = sum(1 to 5: _*) //consider it to be an argument sequence


//recursive definition is needing this call syntax

def recursiveSum(args: Int*):Int = {
  if (args.isEmpty) 0
  else args.head + recursiveSum(args.tail: _*)
}

recursiveSum(1, 4, 5, 6)



//again a Seq, head is the initial element
//tail is the sequence of all the other elements

//_* convert it to an argument sequence


recursiveSum(1 to 10: _*)


