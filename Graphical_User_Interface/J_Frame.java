package Graphical_User_Interface;

import javax.swing.*;

public class J_Frame {

    // **JFrame** is a class in the Java Swing library that is used to
    // create and manage top-level windows in a Java application. It
    // provides a platform-independent way to create graphical user
    // interfaces (GUIs). Here are some key points about `JFrame`:

    //### Key Features of JFrame
    //1. **Top-Level Container**:
    //   - `JFrame` is a top-level container that can hold other Swing
    //   components like buttons, labels, text fields, etc.
    //   - It serves as the main window for GUI-based Java applications.

    //2. **Constructors**:
    //   - `JFrame()`: Creates a new frame that is initially invisible.
    //   - `JFrame(String title)`: Creates a new frame with the specified title.

    //3. **Common Methods**:
    //   - `setTitle(String title)`: Sets the title of the frame.
    //   - `setSize(int width, int height)`: Sets the size of the frame.
    //   - `setDefaultCloseOperation(int operation)`: Defines the default
    //   operation when the user closes the frame. Common options include:
    //     - `JFrame.EXIT_ON_CLOSE`: Exit the application.
    //     - `JFrame.DISPOSE_ON_CLOSE`: Dispose of the frame but keep the
    //     application running.
    //     - `JFrame.HIDE_ON_CLOSE`: Hide the frame but keep the application
    //     running.
    //     - `JFrame.DO_NOTHING_ON_CLOSE`: Do nothing when the frame is
    //     closed.
    //   - `setVisible(boolean b)`: Sets the visibility of the frame.
    //   - `setLayout(LayoutManager manager)`: Sets the layout manager for
    //   the frame.
    //   - `add(Component comp)`: Adds a component to the frame.
    //   - `remove(Component comp)`: Removes a component from the frame.

    //### Example
    //Here's a simple example demonstrating how to create a `JFrame` and add a button to it:
    //
    //```java
    //import javax.swing.*;
    //
    //public class JFrameExample {
    //    public static void main(String[] args) {
    //        JFrame frame = new JFrame("JFrame Example");
    //        frame.setSize(400, 300);
    //        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //
    //        JButton button = new JButton("Click Me");
    //        frame.add(button);
    //
            // Center the JFrame on the screen
    //        frame.setLocationRelativeTo(null);

    //        frame.setLayout(new FlowLayout());
    //        frame.setVisible(true);
    //    }
    //}


    //### Explanation
    //- **Creating the Frame**: `JFrame frame = new JFrame("JFrame Example");`
    // creates a new frame with the title "JFrame Example".
    //- **Setting Size**: `frame.setSize(400, 300);` sets the size of the
    // frame to 400x300 pixels.
    //- **Close Operation**: `frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`
    // ensures the application exits when the frame is closed.
    //- **Adding a Button**: `frame.add(button);` adds a button to the frame.
    //- **Layout Manager**: `frame.setLayout(new FlowLayout());` sets the
    // layout manager to `FlowLayout`.
    //- **Visibility**: `frame.setVisible(true);` makes the frame visible.

    //### Why Use JFrame?
    //- **Ease of Use**: Simplifies the creation of windows and GUI
    // components.
    //- **Flexibility**: Supports various layout managers and components
    // to create complex GUIs.
    //- **Platform Independence**: Provides a consistent look and feel
    // across different operating systems.

    //                  --------*****--------

    // Lecture Part:
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Frame");
        frame.setVisible(true);
        frame.setBounds(0,0,400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // to display frame to a center of screen
        frame.setLocationRelativeTo(null);
    }

}
