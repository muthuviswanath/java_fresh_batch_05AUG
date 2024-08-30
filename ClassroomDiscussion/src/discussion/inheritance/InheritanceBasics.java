package discussion.inheritance;

/**
 * It is a phenomenon where one class acquires the properties and behaviors of another class
 * The class whose properties and behaviors are acquired is called the parent class or super class or base class
 * The class that acquires the properties and behaviors is called the child class or sub class or derived class
 * A final class cannot be inherited
 * A final method cannot be overridden
 * A final variable cannot be changed
 * A static member of a class will not be inherited
 * A private member of a class will not be inherited
 * A constructor of a class will not be inherited
 * The static members of the class can be accessed inside the child class
 * A class can extend only one class at a time
 * class A extends B
 * class A extends B,c - invalid
 * A class can implement multiple interfaces at a time as well as extend a class
 * class A extends B implements C,D,E
 * An interface can extend another interface but cannot extend or implement a class.
 * 
 * Types of Inheritance:
 * 	    Single Inheritance - Programmatically not possible in any programming language
 * 	    MultiLevel Inheritance - Programmatically not possible in any programming language
 *      Hierarchical Inheritance - Implemented by default in Java
 *      Multiple Inheritance - Not supported in Java using classes but supported using interfaces
 *      Hybrid Inheritance - Combination of multiple and hierarchical inheritance and if it is implemented that
 *                      	 creates a diamond problem then it is not possible. Else it is possible	
 * */

public class InheritanceBasics {

}
