public class why_use_Generics {

    // Generic Presentation

    // Generic uses the data type declaration for type safety feature that
    // helps to eliminate the run time error. The generic in java is
    // implemented using the angular bracket'<>' symbol, and the type
    // parameter is defined in the bracket

    // The following are the standard type parameters:
    // T: type
    // E: element
    // N: number
    // K: Key
    // V: value
    // S,U,V etc - 2nd 3rd 4th types

    // for example, a generic class will be defined as:
    // public static void class MyGenericClass<T>{...}

    // Type Safety
    // Java being a statically typed language requires you to declare
    // the "type" that is the data type of the value being held by the
    // variable before using it
    // String myString = "Master";

    // Here "String" is the data type, "myString" is the variable that will
    // hold a value whose type is String.

    // Now, if you try to pass a Boolean value in place of a string for
    // example
    // String myString = true;
    // you will immediately get a compile time error stating "Type mismatch,
    // cannot convert from boolean to String". this is called "Type Safety".

    // Code Reusability
    // now let us define a regula method
    // public static void welcome(String name){ sout("welcome "+name); }
    // This method can be invoked only by passing a string parameter. For ex
    // welcome("Master");
    // its output will be "welcome Master".

    // However, you cannot invoke this method by passing any other data
    // types such as integer or boolean.

    public static void welcome(String name){
        System.out.println("Welcome "+name);
    }

    public static void main(String[] args) {
        welcome("Master");
//        welcome(12); // due to type safety we cannot place an int value in place of string
    }
}
