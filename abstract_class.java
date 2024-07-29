public class abstract_class {

    // Abstract class:
    // an abstract class is a class that is declared abstract it may
    // or may not include abstract methods. Abstract classes cannot be
    // instantiated, but they can be subclassed

    // Abstract Method:
    // an abstract method is a method that is declared without an
    // implementation (without braces, and followed by a semicolon),
    // like bellow
    // ex: abstract void methodName(double x, double y);

    // NOTE: if a class includes abstract methods,
    //       then the class itself must be declared abstract as in:

    // ** Abstract class vs. Interface **
    // * abstract class are similar to interfaces. You cannot
    // instantiate them, and they may contain a mix of methods
    // declared with or without an implementation.
    // * Abstract class: you can declare fields that are not static and
    // final, and define public, protected, and private concrete methods.
    // * interface: all fields are automatically public, static, and
    // final, and all methods that you declare or define(as default methods) are public.

    // Which should you use, abstract classes or interfaces?
    //          Abstract Class            |            Interface
    // * you want to share code among       * unrelated classes would
    //   several closely related classes      implement your interface
    // * have many common methods or        * you want to specify the  type,
    //   fields or require access             behaviour of a particular data
    //   modifiers other than public          but not concerned bout who
    //                                        implements its behaviour.
    // * you want to declare non-static     * you want to take advantage of
    //   or non-final fields.                 multiple inheritance of type
}
