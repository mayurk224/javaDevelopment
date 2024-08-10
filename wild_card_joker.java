import java.util.ArrayList;
import java.util.List;

public class wild_card_joker {
    // Reusability problems
    // simple generics lacks flexibility, which affects reusability
    // we have learned so for that if B is a subtype of A, List<B> is
    // not subtype of List<A>
    // a method m(List<A>) written to work with a list of elements of
    // A cannot be used to work with a list of elements of B

    public static void main(String[] args) {

        // Integer is-a Number
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        PrintElem(l);
    }

    public static void PrintElem(List<? extends Number> element){
        for(Number i : element){
            System.out.println(i);
        }
    }

    // This code demonstrates the use of Java Generics with a bounded
    // wildcard (`<? extends Number>`) to allow a method to accept a list
    // of any type that extends the `Number` class (e.g., `Integer`,
    // `Double`, `Float`).

    //### Summary:
    //- **Main Method:**
    //  - A list of integers (`List<Integer>`) is created and populated
    //  with the numbers 1, 2, 3, and 4.
    //  - The `PrintElem` method is called with this list as an argument.

    //- **PrintElem Method:**
    //  - The method accepts a list of elements where the element type is
    //  a subclass of `Number`.
    //  - It iterates over the list and prints each element.

    //### Key Points:
    //- **Generics with Wildcards:** `List<? extends Number>` allows the
    // method to be used with lists of different types of numbers (e.g.,
    // `List<Integer>`, `List<Double>`).
    //- **Polymorphism:** `Integer` is a subclass of `Number`, so a list
    // of `Integer` can be passed to a method expecting a list of `Number`
    // or its subclasses.
    //- **Output:** The elements of the list (`1`, `2`, `3`, `4`) are
    // printed.
}
