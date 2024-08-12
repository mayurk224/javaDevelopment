package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButton_ {

    //`JButton` is a Swing component in Java used to create a button that can trigger an action when clicked. It is a part of the `javax.swing` package and extends the `AbstractButton` class, providing a platform-independent way to create buttons with text, icons, or both.

    //### Key Features of JButton

    //1. **Text and Icons**: You can set text, icons, or both on a button.
    //2. **Action Listeners**: Buttons can trigger actions when clicked, using `ActionListener`.
    //3. **Mnemonics**: You can assign keyboard shortcuts to buttons.
    //4. **Tool Tips**: Buttons can display tool tips when hovered over.
    //5. **Customizable Appearance**: You can customize the look and feel of buttons using various methods.
    //
    //### Example with Full Code

    //    public static void main(String[] args) {
    //        // Create a new JFrame
    //        JFrame frame = new JFrame("JButton Example");
    //        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //        frame.setSize(400, 300);
    //
    //        // Create a JButton
    //        JButton button = new JButton("Click Me");
    //
    //        // Add an ActionListener to the button
    //        button.addActionListener(new ActionListener() {
    //            public void actionPerformed(ActionEvent e) {
    //                System.out.println("Button clicked!");
    //            }
    //        });
    //
    //        // Add the button to the frame
    //        frame.add(button);
    //        frame.setVisible(true);
    //    }

    //### Explanation of the Code

    //1. **Creating the JFrame**: The `JFrame` is the main window of the application. We set its default close operation and size.
    //2. **Creating the JButton**: We instantiate the `JButton` with the text "Click Me".
    //3. **Adding an ActionListener**: We add an `ActionListener` to the button to handle click events. When the button is clicked, it prints "Button clicked!" to the console.
    //4. **Adding the Button to the JFrame**: We add the `JButton` to the `JFrame`.
    //5. **Making the Frame Visible**: Finally, we make the frame visible.

    //### Why Use JButton?

    //- **User Interaction**: Provides a way for users to interact with the application by clicking buttons.
    //- **Event Handling**: Easily handle user actions with `ActionListener`.
    //- **Customizable**: You can customize the button's appearance and behavior to fit your application's needs.
    //- **Platform-Independent**: Ensures consistent behavior across different operating systems.


    //              -------*********----------

    // Lecture Part:

    // An atomic component is considered as a unique entity.
    // Java proposes numerous atomic components:
    // button, checkbox, radiobutton
    // combo box
    // List, menu
    // TextField, TextArea, Label
    // FileChooser, ColorChooser

    public static void main(String[] args) {

        JFrame f = new JFrame("JButton");
        f.setBounds(0,0,500,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(Color.red);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 = new JButton("Change color");
        b1.setVisible(true);
        b1.setSize(150,50);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.getContentPane().setBackground(Color.blue);
            }
        });

        f.add(b1);
    }
}
