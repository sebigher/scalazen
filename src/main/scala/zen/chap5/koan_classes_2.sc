import java.time.Instant.now
// Scala generates getters and setters for every field
//you can control the process

  // field is private -> getter & setter are private
//field is val -> only a getter is generated
// stop generating: declare field as  private[this]


//val fields
class Message{
  val timeStamp = now()  //private final in the generated Java class
}

//USE-CASE 'mutate' fields that client can't set
//you cannot do with val, you need some 'trick'

class Counter{
  private var value = 0
  def increment() {value -= 1}
  def current  = value  //no () in the declaration, you must call method without ()
}

val myCounter = new Counter
val n = myCounter.current
myCounter.increment()
myCounter.current

// in Scala you cannot have a setter only field


