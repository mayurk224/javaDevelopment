import java.util.Arrays;
import java.util.List;

public class wild_card_constraints {
    // Wildcards in Java generics are a powerful feature that allows for
    // more flexible and reusable code. They are represented by the question
    // mark (`?`) and can be used in various situations, such as the type of
    // a parameter, field, or local variable. Here are the main types of
    // wildcard constraints:

    //### 1. Unbounded Wildcards
    //- **Syntax**: `<?>`
    //- **Usage**: When you don't care about the type parameter and just want to work with any type.
    //- **Example**:
    //  ```java
      public static void printList(List<?> list) {
          for (Object elem : list) {
              System.out.println(elem);
          }
      }
    //  ```
    //
    //### 2. Upper Bounded Wildcards
    //- **Syntax**: `<? extends Type>`
    //- **Usage**: When you want to relax the restrictions on a variable to accept any type that is a subclass of a specified type.
    //- **Example**:
    //  ```java
      public static void processNumbers(List<? extends Number> list) {
          for (Number num : list) {
              System.out.println(num);
          }
      }
    //  ```
    //  In this example, `processNumbers` can accept a list of `Integer`, `Double`, or any other subclass of `Number`.
    //
    //### 3. Lower Bounded Wildcards
    //- **Syntax**: `<? super Type>`
    //- **Usage**: When you want to relax the restrictions on a variable to accept any type that is a superclass of a specified type.
    //- **Example**:
    //  ```java
      public static void addIntegers(List<? super Integer> list) {
          list.add(1);
          list.add(2);
      }
    //  ```
    //  Here, `addIntegers` can accept a list of `Integer`, `Number`, or `Object`.
    //
    //### Guidelines for Using Wildcards
    //- **Use `extends`**: When you want to get values out of a structure.
    //- **Use `super`**: When you want to put values into a structure.
    //- **Use unbounded wildcards**: When you don't care about the type parameter.
    //
    //### Example with Wildcards
    //Here's a more comprehensive example demonstrating the use of different wildcards:
    //
    //```java
    //import java.util.Arrays;
    //import java.util.List;
    //
    //public class WildcardExample {
        public static void main(String[] args) {
            List<Integer> intList = Arrays.asList(1, 2, 3);
            List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
            List<Number> numList = Arrays.asList(1, 2.2, 3);

            printList1(intList); // Unbounded wildcard
            printList1(doubleList);
            printList1(numList);

            processNumbers1(intList); // Upper bounded wildcard
            processNumbers1(doubleList);

            addIntegers1(numList); // Lower bounded wildcard
        }

        public static void printList1(List<?> list) {
            for (Object elem : list) {
                System.out.println(elem);
            }
        }

        public static void processNumbers1(List<? extends Number> list) {
            for (Number num : list) {
                System.out.println(num);
            }
        }

        public static void addIntegers1(List<? super Integer> list) {
            list.add(4);
            list.add(5);
        }
    //}
    //```
    //
    //Wildcards make your code more flexible and reusable, allowing you to write methods that can operate on a variety of types without sacrificing type safety¹²³.
    //
    //If you have any specific questions or need further examples, feel free to ask! 😊
    //
    //By the way, isn't it fascinating how wildcards can make your code feel like a magician's toolkit? 🎩✨

}
