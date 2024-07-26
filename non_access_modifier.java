public class non_access_modifier {
    // Attributes is a combination of datatype and variable
    // Ex:  String name ; - String(datatype) + name(variable)


    // * For classes, you can use either final or abstract keyword:
    // •final: The class cannot be inherited by other classes
    // •abstract: The class cannot be used to create an object (to access an abstract class, it must be inherited from another class.)

    // class - final / abstract
    // Ex: public (final/abstract) class classes{....}



    // * For attributes and methods, you can use one of the following:
    // •final: Attributes and methods cannot be overridden/modified
    // •static: Attributes and methods belong to the class, rather than an object.
    // •abstract: can only be used in an abstract class, and can only be used on methods.
    //           The method does not have a body, for ex, abstract void run();
    //           The body is provided by the subclass (inherited from).
    // •transient: Attributes and methods are skipped when serializing the object containing them
    // •synchronized: methods can only be accessed by one thread at a time.
    // •volatile: the value of an attribute is not cached thread locally and is always read from the main memory.

    // Attributes & Methods - final / abstract / static / volatile / transient / synchronized.

    // *final keyword can be used for attributes, methods, & also for class as well, to access final you must extend the parent class
    // •final attributes (local, instance, static) - Can be read, but cannot be reassigned after initialization.
    // •final double pi = 3.14; // local variable
    // •final int x; // instance variable
    // •public static final double pi = 3.14;4 // static variable
    // •public final void displayMessage(){...}; // final method - Can be called, but cannot be overridden.
    // •public final class className(){...} // final class - Can be instantiated, and its methods/attributes accessed, but cannot be subclassed.

    // *abstract: class can be abstract & method can be abstract but only with no-body, inside the abstract class, to access abstract method or class you must extend it
    // •public abstract class className(){...} // abstract class
    // •public abstract class className() {    // abstract class with abstract method (method with no-body)
    //        public abstract void run(); }  // abstract method

    public static void main(String[] args) {
        classes stu = new classes();
        System.out.println(stu.pi);
    }
}
