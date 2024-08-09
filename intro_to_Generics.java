public class intro_to_Generics {
    // Why to use Generics?
    // in a nutshell, generics enable types(classes and interfaces) to be
    // parameters when defining classes, interfaces, and methods.

    // Much like the more familiar formal parameters used in method
    // declarations, type parameters provide a way for you to re-use the
    // sam code with different inputs. The difference is that the inputs
    // to formal parameters are values, while the inputs to type parameters
    // are types.

    // code that uses generics has many benefits over non generics code

    // Stronger type checks at compile time a java compiler applies strong
    // type checking to generic code and issues errors if the code violates
    // type safety. Fixing compile time errors is easier than fixing
    // runtime errors which can be challenging to find

    // elimination of casts. the following code snippet without generics
    // requires casting
    // List list = new ArrayList();
    // list.add("Hello");
    // String s = (String) list.get(0);

    // when re-written to use generics, the code does not require casting
    // List<String> list = new ArrayList<>();
    // list.add("Hello");
    // String s = list.get(0)

    // Type Wrappers
    // Each primitive data type has a corresponding class(object type)
    // called type wrapper class (package java.lang) These classes are
    // Boolean, Byte, Character, Double, Float, Integer, Long, Short. Each
    // type wrapper class allows manipulating the values of primitive types
    // as objects

    // Many data structures manipulate and share objects. These classes
    // cannot manipulate primitive type, but they can manipulate objects of
    // type wrapper

    // Type wrapper classes are final classes; thus they cannot be inherited
    // a Primitive type has no methods. Methods that manipulate primitive
    // types exit in the corresponding type wrappers classes.

    // Autoboxing and Auto UnBoxing
    // J2SE 5.0 introduces two conversion types boxing and unboxing the
    // conversion boxing converts and primitive value in an object of a
    // type wrapper class a conversion unboxing converts an object of a
    // type wrappers class in a corresponding primitive value. J2SE 5.0
    // allows these conversions automatically (called autoboxing and auto
    // unboxing)
    // Integer[] intArray = new Integer[5];
    // create intArray
    // intArray[0] = 10;
    // autoboxing assign Integer 10 to intArray[0]
    // int value = intArray[0];
    // auto unboxing get int value of integer

    // in this case, an autoboxing is happening by assigning ann int value(10)
    // to intArray[0] because intArray stores references to Integer not int.

    // autoboxing is happening by assigning intArray[0] to the variable
    // int value because value stores int, not a reference to Integer

    // auto boxing and auto unboxing happens also in control statements the
    // condition of a control statement may be evaluated to boolean or to
    // Boolean
}
