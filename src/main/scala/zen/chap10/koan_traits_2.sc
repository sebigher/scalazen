//traits with concrete implementation

class Account{
  var amount: Double = 0.0
  var balance: Double = 0.0
}

trait ConsoleLogger{
  def log(msg: String) {println(msg)}
}

class SavingAccount extends Account with ConsoleLogger{
  def withdraw(amount: Double): Unit ={
    if (amount > balance) log("insufficient funds")
    else balance -= amount
  }
}

//in Java this is possible using default methods in interfaces
//in Scala we say that the ConsoleLogger functionality is "mixed in"
//with the SavingAccount functionality