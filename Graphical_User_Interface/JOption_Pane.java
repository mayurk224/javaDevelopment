package Graphical_User_Interface;

import javax.swing.*;

public class JOption_Pane {

    // **JOptionPane** is a part of the Java Swing library and is used
    // to create standard dialog boxes for user interaction. It provides
    // several types of dialog boxes, such as message dialogs,
    // confirmation dialogs, input dialogs, and option dialogs. Here
    // are some key points about `JOptionPane`:

    //### Types of Dialogs
    //1. **Message Dialog**: Displays a message to the user.
    //   ```java
    //   JOptionPane.showMessageDialog(null, "This is a message dialog.");

    //2. **Confirmation Dialog**: Asks the user to confirm an action.
    //   ```java
    //   int result = JOptionPane.showConfirmDialog(null, "Are you sure?");
    //   if (result == JOptionPane.YES_OPTION) {
    //       System.out.println("User selected Yes.");
    //   }

    //3. **Input Dialog**: Prompts the user to input a value.
    //   ```java
    //   String input = JOptionPane.showInputDialog("Enter your name:");
    //   System.out.println("User input: " + input);

    //4. **Option Dialog**: Allows the user to choose from a set of options.
    //   ```java
    //   Object[] options = {"Option 1", "Option 2", "Option 3"};
    //   int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Option Dialog",
    //           JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    //   System.out.println("User chose: " + options[choice]);


    //### Customizing Dialogs
    //You can customize the appearance and behavior of `JOptionPane`
    // dialogs by specifying parameters such as the message type, option
    // type, and initial value. Here are some common methods and fields:

    //- **Message Types**:
    //  - `JOptionPane.ERROR_MESSAGE`
    //  - `JOptionPane.INFORMATION_MESSAGE`
    //  - `JOptionPane.WARNING_MESSAGE`
    //  - `JOptionPane.QUESTION_MESSAGE`
    //  - `JOptionPane.PLAIN_MESSAGE`
    //
    //- **Option Types**:
    //  - `JOptionPane.DEFAULT_OPTION`
    //  - `JOptionPane.YES_NO_OPTION`
    //  - `JOptionPane.YES_NO_CANCEL_OPTION`
    //  - `JOptionPane.OK_CANCEL_OPTION`
    //
    //### Example
    //Here's a comprehensive example demonstrating different types of
    // dialogs:

    //```java
    //import javax.swing.*;
    //
    //public class JOptionPaneExample {
//        public static void main(String[] args) {
//            // Message Dialog
//            JOptionPane.showMessageDialog(null, "This is an information message.", "Info", JOptionPane.INFORMATION_MESSAGE);
//
//            // Confirmation Dialog
//            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Confirm", JOptionPane.YES_NO_OPTION);
//            if (confirm == JOptionPane.YES_OPTION) {
//                System.out.println("User chose to proceed.");
//            }
//
//            // Input Dialog
//            String input = JOptionPane.showInputDialog(null, "Enter your name:", "Input", JOptionPane.QUESTION_MESSAGE);
//            System.out.println("User input: " + input);
//
//            // Option Dialog
//            Object[] options = {"Option 1", "Option 2", "Option 3"};
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Option Dialog",
//                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
//            System.out.println("User chose: " + options[choice]);
//        }
    //}

    //### Why Use `JOptionPane`?
    //- **Ease of Use**: Simplifies the creation of standard dialog boxes.
    //- **Flexibility**: Allows customization of dialogs to suit different
    // needs.
    //- **User Interaction**: Facilitates user input and decision-making
    // in GUI applications.

    //                  -------*******-------

    // Lecture Part :
    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Enter first number :");
        String num2 = JOptionPane.showInputDialog("Enter second number :");

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        int sum = number1 + number2;

        JOptionPane.showMessageDialog(
                null,
                "Sum of "+num1+" & "+num2+" is : "+sum,
                "Sum of Integer",
                JOptionPane.PLAIN_MESSAGE);
    }
}
