//TRAVERSING ARRAYS

val nums = Array(1 ,3 ,5 ,6, 7, 10 )

// don't need to index in the body
for(num <- nums){
  println(num)
}

//if you need the index
for(i <- 0 until nums.length -1){
  print(i);println("-" + nums(i))
}
println("")
// by is the new step
for (i <- 0 until nums.length -1 by 2){
  print(i);println("-" + nums(i))
}
println("")

nums
//how to reverse
for(i <- nums.indices ){
  print(i);println("-" + nums(i))
}

for(i <- nums.indices.reverse){
  print(i);println("-" + nums(i))
}


