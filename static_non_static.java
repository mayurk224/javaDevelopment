public class static_non_static {
    // Types of Variables

    // There are three types of variables in Java:

    // •Local Variable (non-static)
    // a variable defined within a block or method or
    // constructor is called as local variable
    int age1 ; // Instance variable

    // •Instance Variable (non-static)
    // are declared in a class outside any method, constructor or block

    // •Static Variable (static)

    // When a variable is declared as static,
    // then a single copy of the variable is created and shared
    // among all objects at a class level.

    public static void main(String[] args) {
        int age ; // local variable

        // Check classes.java file
        classes stu = new classes();
        classes stu2 = new classes();

        // Static variable can be accessed using the class name
        // static var can be accessed by static and non-static methods
        System.out.println(classes.getId());

        // Non-Static(Instance & local) variable can be accessed using instance of a class
        // Non-static variables cannot be accessed inside a static method
        System.out.println(stu.publicName);


        // Difference between Static and Non-static variables:
        //                STATIC VARIABLE                                     |                  NON-STATIC VARIABLE
        // * Static var can be accessed using class name                      * Non-static var can be accessed using instance of a class
        // * Static var can be accessed by static & non-static methods        * Non-static var cannot be accessed inside a static methods
        // * Static var reduce the amount of memory used by a program.        * Non-static var doesn't reduce the amount of memory used by a program.
        // * Static var is shared among all instances of a class.             * Non-static var is specific to that instance of a class.
        // * Static var is like a global var and is available to all methods. * Non-static var is like a local var, so they only can be accessed through only instance of a class.
    }
}
