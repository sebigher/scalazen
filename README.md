# scalazen
meditate in Scala 

*Level A1: Beginning application programmer*

Java-like statements and expressions: standard operators, method calls, conditionals, loops, try/catch
class, object, def, val, var, import, package
Infix notation for method calls
Simple closures
Collections with map, filter, etc
for-expressions


*Level A2: Intermediate application programmer*

Pattern matching
Trait composition
Recursion, in particular tail recursion
XML literals


*Level A3: Expert application programmer*

Folds, i.e. methods such as foldLeft, foldRight
Streams and other lazy data structures
Actors
Combinator parsers


*Level L1: Junior library designer*

Type parameters
Traits
Lazy vals
Control abstraction, currying
By-name parameters


*Level L2: Senior library designer*

Variance annotations
Existential types (e.g., to interface with Java wildcards)
Self type annotations and the cake pattern for dependency injection
Structural types (aka static duck typing)
Defining map/flatmap/withFilter for new kinds of for-expressions
Extractors


*Level L3: Expert library designer*

Early initializers
Abstract types
Implicit definitions
Higher-kinded types


The skill sets required 
from application programmers and library designers are really quite different. 
But if I should throw them into the same baskets...

*A1, A2/L1, A3/L2, L3*

That is, 
intermediate application programming is about on the same level of difficulty as junior library design, and advanced application programming is on the same level as senior library design.

To clarify: 

A1: One can program very productively in Scala on level A1, 
which one should be able to pick up in a day or so, coming from Java. 

A2: Mastering A2 will doubtlessly increase programmer productivity.
 
A3: is for expert programmers with more specialized tasks, 
not everyone needs to get to that level. 
The same holds for library design. 


*Note:*
There are great libraries designed with the tools on level L1 and L2. 
Some libraries require L3 elements such as implicits 
and higher-kinded types, 
but a library does not automatically get better 
if it uses these elements -- often the opposite is true.


