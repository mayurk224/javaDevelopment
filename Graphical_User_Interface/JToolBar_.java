package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;

public class JToolBar_ {

    //`JToolBar` is a Swing component in Java that provides a container for grouping several components, usually buttons with icons, into a row or column. Toolbars are often used to provide easy access to functionality that is also available in menus.

    //### Key Features of JToolBar

    //1. **Orientation**: Toolbars can be oriented horizontally or vertically.
    //2. **Floatable**: By default, toolbars can be dragged to different locations or even outside the main window to create a separate floating window.
    //3. **Customizable**: You can add various components like buttons, separators, and other Swing components.
    //4. **Rollover**: Toolbars can have a rollover effect, where buttons change appearance when hovered over.
    //5. **Border**: You can choose whether or not to paint the border of the toolbar.

    //Here's a complete example demonstrating how to use `JToolBar`:

    //    public static void main(String[] args) {
    //        // Create a new JFrame
    //        JFrame frame = new JFrame("JToolBar Example");
    //        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //        frame.setSize(400, 300);
    //
    //        // Create a JToolBar
    //        JToolBar toolBar = new JToolBar("Toolbar", JToolBar.HORIZONTAL);
    //
    //        // Create buttons to add to the toolbar
    //        JButton button1 = new JButton("Button 1");
    //        JButton button2 = new JButton("Button 2");
    //        JButton button3 = new JButton("Button 3");
    //
    //        // Add action listeners to the buttons
    //        button1.addActionListener(new ActionListener() {
    //            public void actionPerformed(ActionEvent e) {
    //                System.out.println("Button 1 clicked");
    //            }
    //        });
    //
    //        button2.addActionListener(new ActionListener() {
    //            public void actionPerformed(ActionEvent e) {
    //                System.out.println("Button 2 clicked");
    //            }
    //        });
    //
    //        button3.addActionListener(new ActionListener() {
    //            public void actionPerformed(ActionEvent e) {
    //                System.out.println("Button 3 clicked");
    //            }
    //        });
    //
    //        // Add buttons to the toolbar
    //        toolBar.add(button1);
    //        toolBar.add(button2);
    //        toolBar.add(button3);
    //
    //        // Add the toolbar to the frame
    //        frame.add(toolBar, "North");
    //
    //        // Make the frame visible
    //        frame.setVisible(true);
    //    }

    //### Explanation of the Code

    //1. **Creating the JFrame**: The `JFrame` is the main window of the application. We set its default close operation and size.
    //2. **Creating the JToolBar**: We instantiate the `JToolBar` with a title and set its orientation to horizontal.
    //3. **Creating Buttons**: We create `JButton` objects to add to the toolbar.
    //4. **Adding Action Listeners**: We add action listeners to the buttons to handle click events.
    //5. **Adding Buttons to the Toolbar**: We use the `add` method to add each button to the `JToolBar`.
    //6. **Adding the Toolbar to the JFrame**: We add the `JToolBar` to the `JFrame` and position it at the top (north) of the frame.
    //7. **Making the Frame Visible**: Finally, we make the frame visible.

    //### Why Use JToolBar?

    //- **Convenience**: Provides quick access to frequently used actions.
    //- **User-Friendly**: Enhances the user experience by grouping related actions together.
    //- **Customizable**: Easily add or remove components as needed.
    //- **Floatable**: Users can reposition the toolbar to suit their preferences.

    // Using `JToolBar` is particularly useful in applications where you need to provide easy access to common actions, improving both the functionality and usability of your interface.

    //                    -------******-------

    // Lecture Part:

    public static void main(String[] args) {

        JFrame f = new JFrame("JToolBar");
        f.setBounds(0,0,500,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 = new JButton("New");
        JButton b2 = new JButton("Run");
        JButton b3 = new JButton("Stop");

        JToolBar tb = new JToolBar();
        tb.setVisible(true);
        tb.setRollover(true);
        tb.addSeparator();
        tb.setBounds(0,0,200,50);
        tb.setBackground(Color.red);

        tb.add(b1);
        tb.add(b2);
        tb.add(b3);

        f.add(tb);
    }
}
