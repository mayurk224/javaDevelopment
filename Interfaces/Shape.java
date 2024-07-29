package Interfaces;

//  public class Shape { // previous class
    public interface Shape {

    // inheritance = is used to implement "is_a" relationship
    // composition = is used to implement "has_a" relationship


    // here, inheritance (means code sharing) isn't useful in this case,
    // because each class implements its behavior differently.


    // Shapes      Area         Perimeter
    // Circle      pi*r*r       2*pi*r
    // Rectangle   l*w          (l+w)*2
    // Triangle    h*w/2        a+b+c  (addition of all sides)


    // since there is no common in between these 3 shapes in terms
    // of calculating area and perimeter

    // since no code is sharing among these classes, hence we cannot create
    // a common superclass to represent, There is a relationship.

    // that why we cant use below methods to calculate their area & perimeter:
    // public double calculateArea(){...};
    // public double calculatePerimeter(){...};



    // ** use of Interface by Inheritance **
    // Interface can only contain abstract method (method with no_body and access modifiers),
    // so method can only have return_type & method_name

    // What is interface?
    // An interface is a reference type, similar to a class;
    // that is used to specify a set of methods that a class must
    // implement. Interfaces are a way to achieve abstraction and
    // multiple inheritance

    // Key Features of having Interface:
    // Abstract Methods: Interfaces can contain abstract methods (methods without a body) that must be implemented by any class that implements the interface.
    // Constants: Interfaces can contain constants, which are implicitly public, static, and final.
    // Default Methods: Since Java 8, interfaces can also contain default methods (methods with a body) that provide a default implementation.
    // Static Methods: Interfaces can contain static methods, which belong to the interface itself rather than any instance.
    // Nested Types: Interfaces can contain nested types, such as classes or interfaces.

    // Why we use Interface
    // Abstraction: Interfaces allow you to define methods that must be
    //             implemented by any class that implements the interface,
    //             without specifying how these methods should be
    //             implemented.
    // Multiple Inheritance: Java does not support multiple inheritance with
    //                      classes, but a class can implement multiple
    //                      interfaces, allowing for a form of multiple
    //                      inheritance.
    // Loose Coupling: Interfaces help in achieving loose coupling by
    //                separating the definition of methods from their
    //                implementation.

    double calculateArea();
    double calculatePerimeter();
}
