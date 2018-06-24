//an object can extend a class and
//one or more traits

abstract class UndoableAction(val desc: String){
  def undo():Unit
  def redo():Unit
}



object DoNothingAction  extends UndoableAction("Do nothing"){
   override def undo(){}
   override def redo(){}
}


//share the DoNothingAction object
val actions = Map("open" -> DoNothingAction)