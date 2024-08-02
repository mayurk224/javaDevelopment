import java.util.ArrayList;

public class arrayList {

    // Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

    // int[] myNum = {10,2,7,5,28,90}

    // Array vs ArrayList
    // Nature, Implementation, Performance, Flexibility, Type of data Stored, Generics, Iteration, Checking the Size, Dimension, Supported operations

    // What is an ArrayList?
    // An ArrayList in Java is a part of the Java Collections Framework
    // and is used to store dynamically sized collections of elements.
    // Unlike arrays, which have a fixed size, an ArrayList can grow and
    // shrink as needed, making it more flexible for certain applications.

    // Key Features of ArrayList
    // Resizable: The size of an ArrayList can change dynamically as elements are added or removed.
    // Indexed Access: Elements can be accessed using an index, similar to arrays.
    // Type-Safe: You can specify the type of elements the ArrayList will hold using generics.
    // Part of Collections Framework: Implements the List interface, providing various useful methods.

    // Advantage and disadvantages of Arraylist
    // Advantages of ArrayList
    // Dynamic Size: Automatically resizes itself when elements are added or removed.
    // Ease of Use: Provides many convenient methods for manipulating the list.
    // Flexibility: Can store any type of object and allows for easy iteration.
    //
    // Disadvantages of ArrayList
    // Performance: May be slower than arrays for certain operations due to dynamic resizing.
    // Memory Overhead: Uses more memory than arrays because it maintains additional information for dynamic resizing.

    // Sample code from copilot
    public static void main(String[] args) {
        // Create an ArrayList to store String elements
        ArrayList<String> cars = new ArrayList<String>();

        // Add elements to the ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Access an element
        System.out.println("First car: " + cars.get(0)); // Output: First car: Volvo

        // Modify an element
        cars.set(0, "Tesla");
        System.out.println("Updated first car: " + cars.get(0)); // Output: Updated first car: Tesla

        // Remove an element
        cars.remove(1); // Removes "BMW"

        // Loop through the ArrayList
        for (String car : cars) {
            System.out.println(car);
        }

        // Get the size of the ArrayList
        System.out.println("Number of cars: " + cars.size()); // Output: Number of cars: 3
    }

}
