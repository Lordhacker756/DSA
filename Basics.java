/*
Type of languages
🔶Procedural: contains a systematic order of statements, functions and commands to complete a task
🔶Functional: Never modifies variables but creates their copies, used in cases where different operations are performed on the smae set of data
💎First class functions: programming languages which allows functions to be reassigned as variabels like a=1, b=2 and c=b; just that a, b and c are functions rather than variable
🔶 Object oriented: Object = code + data
developed to make it easier to maintain, develop and debug code


Static Vs Dyamic Languages
🔶 Static Language: programming language performs the type checking during the compile time hence we write int a = 5. Variables can't be reassigned.
🔶 Dynamic Language: Performs type checking when the code is running. Values can be reassigned and the last assigned value is the actual value that is taken.

TYPE OF MEMORIES
There are two types of memories Stack and Heap. All the variables and function calls are stored in stack and the actual value of the variables are stored in the heap memory
a = 10
a => reference variable and 10 is object
a is stored in stack and 10 in heap and a is pointing towards the address of the object

🔺🔺More than one reference variabel can point to the same object and any one of the reference variable if changes the state of the object, the state is going to be changed for all 

eg the boy, who one calls kunal, one calls son, one calls broher and one calls baby. If he gives a party to any one of them, his money will be deducted and his ability to give party to others will be reduced.

objects that don't have any variable pointing to them are automatically removed from the value, usko yamraj(garbage collection) le jata hai
*/