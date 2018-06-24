// it's common to have objects with
// apply method
// typically, such an apply method returns
// an object of the companion class



class Account private(val id: Int,
                      initialBalance: Double){
  private var balance = initialBalance
  //...
}


object Account{
  def apply(initializeBalance: Double) =
    new Account(newUniqueNumber(), initializeBalance)
  private var lastNumber = 0
  def newUniqueNumber() = {
    lastNumber += 1; lastNumber
  }
}

//now you can construct an account :
val acc = Account(1000.0)

//it's easy to confuse
Array(100)  //calls apply(100), yielding
  // an array with a single element 100


new Array(100) //constructor is invoked this(100)
//Array[Nothing] of 100 elements