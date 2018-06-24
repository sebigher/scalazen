//in Java you have both static and instance methods
//in Scala you can achieve this by having
//a "companion" object of the same name

class Account{
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double): Unit ={
    balance += amount
  }
}

//companion object
object Account{
  private var lastNumber = 0
  private def newUniqueNumber() ={
    lastNumber +=1; lastNumber
  }
}

// there is a special relationship
// class and its companion can acess other's private stuff
// they must be located in the same source file

//companion object's features are not in the scope of the class
//the Account class has to use syntax Account.newUniqueNumber()
// and not just newUniqueNumber()