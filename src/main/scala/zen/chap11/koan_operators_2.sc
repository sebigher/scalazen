//UNARY operators: prefix and postfix op

//postfix
42 toString;
//i.e

42.toString

// postfix operators lead to parsing errors
val result = 42 toString; // if you are not put ;
// it will be error
println(result)


//ASSIGNMENT OPERATORS: evaluate to Unit's ()
var a = 4
var b = 2

a +=b
a
//besides =,there is no other assignment operator
//starting with =


//PRECEDENCE
//Scala can have arbitrary operators
//except for the assignment operators (lowest precedence)
//the precedence is determined by the first character of operator


//POSTFIX op are lower in precedence than infix
// a infixOp b postfixOp
// the same with
// (a infixOp b) postfixOp

//ASSOCIATIVITY
//all op are left-associative except:

 //right-associative
//op that end in a column :
//assignment op


//
1:: 2::3 :: Nil
// the same as
 1 :: (2 ::( 3:: Nil))


2::Nil; //means Nil.::2







