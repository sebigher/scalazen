//Bean properties

import scala.beans.BeanProperty
class Person{
  @BeanProperty var name: String = _
}

// there were 4 methods generated
// name: String
//name_=(newValue: String): Unit
//getName():String
//setName(newValue: String): Unit

