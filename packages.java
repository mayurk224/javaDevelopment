import java.util.Scanner;
//    java folder > util folder > Scanner.class

public class packages {
    // Packages:
    // a package in java is used to group related classes.
    // Think of it as a folder in a file directory.
    // We use packages to avoid name conflicts.
    // And to write a better maintainable code.

    // Packages are divided into two categories:
    // Build-in Packages (Packages from java api)
    // User-defined packages (created by user for his own classes and interfaces)

    Scanner sc = new Scanner(System.in);
    // In Java, System.in is an InputStream that is typically connected to the keyboard input of console programs.
    // When you use System.in with a Scanner, it allows you to read input from the console.
    //
    //Here’s a breakdown of the line Scanner sc = new Scanner(System.in);:
    //
    //System.in: This is the standard input stream. It reads bytes from the console (keyboard) and is an instance of InputStream.
    //new Scanner(System.in): This creates a new Scanner object that takes System.in as its input source.
    // The Scanner class provides methods to read and parse various types of input (like integers, strings, etc.) from the input stream.
    //Scanner sc: This declares a Scanner variable named sc.
}
