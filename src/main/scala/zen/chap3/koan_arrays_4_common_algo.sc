import scala.collection.mutable.ArrayBuffer
// Common algorithms: sorting , computing

//Scala has built-in stuff for that

val result  = Array(2, 4, 9, 5, 7, 10)
result.sum
val result2 = ArrayBuffer(2, 5, 6)
result2.sum

//min, max

val result3 = ArrayBuffer("Mary", "has", "a"
,"little", "lamb")

result3.max
result3.min
result2.min


///SORTED will not affect the original
result.sorted
result3.sorted

//you can supply the comparison function

result.sortWith(_ > _)
result.sortWith(_ <= _)

//SORT IN PLACE
//YOU CAN SORT IN PLACE AN ARRAY
// but NOT an ARRAY BUFFER

val a = Array(2, 4, 3, 2,  6, 1 )
scala.util.Sorting.quickSort(a)
a

val  b = ArrayBuffer(2,10 ,4,3,1,5,6,7)
// scala.util.Sorting.quickSort(b)  cannot do that

//DISPLAYNG arrays

a.mkString(" and ")
a.toString //ugly as f&*k



