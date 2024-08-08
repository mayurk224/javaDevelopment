public class Understanding_Recursion {

    public static void main(String[] args) {

        // Iteration: A programming technique in which you describe actions
        // to be repeated using a loop
//        for( int i = 1; i < 10; i++){
//            System.out.println("hello");
//        }

        SayHello(5);
    }

    // Recursion: A programming technique in which you describe actions
    // to be repeated using a method that calls itself.

    // Recursion is a powerful technique in Java where a method calls
    // itself to solve a problem. Here are some reasons why you might
    // choose to use recursion:

    // Simplifies Complex Problems:
    // Recursion can break down complex problems into simpler
    // problems, making them easier to solve.
    // For example, problems
    // like tree traversals, factorial calculation, and the Fibonacci
    // series are naturally recursive1.

    // Readability and Maintainability:
    // Recursive solutions can be more readable and easier to maintain
    // compared to iterative solutions. They often result in cleaner and
    // more elegant code, especially for problems that have a recursive
    // nature2.

    // Natural Fit for Certain Algorithms:
    // Some algorithms, such as Depth-First Search (DFS) in graphs and
    // tree traversals (inorder, preorder, postorder), are more naturally
    // expressed using recursion1.

    // Reduces Time Complexity:
    // In certain cases, recursion can reduce the time complexity of a
    // program. For example, the divide-and-conquer approach used in
    // algorithms like QuickSort and MergeSort leverages recursion to
    // efficiently sort elements3.

    // Mathematical Elegance:
    // Recursion often provides a mathematically elegant approach to
    // solving problems. It allows you to define a problem in terms of
    // itself, which can lead to more intuitive solutions4.

    public static void SayHello(int n){
        if( n == 0){
            System.out.println();
        }else {
            System.out.println("hello");
            SayHello(n-1);
        }
    }
}
