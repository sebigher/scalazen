//object with traits

 class Account{
  var balance: Double = 0.0
  var amount: Double = 0.0
}

trait Logger {
  def log(msg: String)
}
abstract class SavingAccount extends
  Account with Logger {
  def withdraw(amount: Double) = {
    if (amount > balance) log("not possible")
    else balance -= amount
  }
}

trait ConsoleLogger extends Logger{
  def log(msg:String) = println(msg)
}

//mixing in
val acc = new SavingAccount with ConsoleLogger
acc.amount
acc.balance


trait FileLogger extends Logger{
  def log(msg: String ) = println(s"save to file ${msg]}")
}

//another object can add a different trait
val secAccount = new SavingAccount with FileLogger
secAccount.amount
secAccount.balance