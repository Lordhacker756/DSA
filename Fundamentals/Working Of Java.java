/*
JAVA being a platform independent platform, our .java file is first compiled into a bytecode which has an extenstion of .class, this can't run on a computer, and requires a JVM, i.e a java virtual machine, now this bytecode is later interpreted into the computer readable format.

In C and C++ we need to compile the code on machine beofre actually running it on our system, but JAVA's bytecode can run on any machine in JVM.

Java is platform independent, but JVM required to run to machine is platform dependent!

FLOW OF JAVA PROGRAM
Java Source Code ➡️ JDK ➡️ Bytecode ➡️ JVM ➡️ JRE ➡️ Code Executed

🔶Java Development Kit(JDK): It is a set of files and it provides an enviornment to create java program. It contains the Java Runtime Enviornment used to run the javacode and it also contains the compiler known as Javac⭕

🔶Java Runtine Enviornment(JRE): It is a package that provides enviornment to run the program, after we have the class file, class loader loads all the classes needed to execute the program and JVM send code to Bytecode verifier to check if there are any erroros in the bytecode

🔶Java Virtual Machine(JVM): If JRE is a box, JVM is the content of the box, anything that JVM needs to execute the code, JRE provides it. In simple words, JRE is JVM + Some extra files
*/