package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;

public class JPanel_ {

    // **JPanel** is a class in the Java Swing library that serves as a
    // container for grouping and organizing other components. It is a
    // lightweight container that can hold a group of components, such
    // as buttons, labels, text fields, and other panels. Here are
    // some key points about `JPanel`:

    // ### Key Features of JPanel
    // 1. **Container Class**:
    //   - `JPanel` is used to organize components within a GUI. It does
    //   not have a title bar, menu bar, or border by default.
    //   - It inherits from `JComponent`, making it a versatile container
    //   for adding and arranging components.

    //2. **Constructors**:
    //   - `JPanel()`: Creates a new panel with a flow layout.
    //   - `JPanel(LayoutManager layout)`: Creates a new panel with the
    //   specified layout manager.
    //   - `JPanel(boolean isDoubleBuffered)`: Creates a new panel with
    //   the specified buffering strategy.
    //   - `JPanel(LayoutManager layout, boolean isDoubleBuffered)`:
    //   Creates a new panel with the specified layout manager and
    //   buffering strategy.

    //3. **Common Methods**:
    //   - `add(Component comp)`: Adds a component to the panel.
    //   - `setLayout(LayoutManager mgr)`: Sets the layout manager for the
    //   panel.
    //   - `setBackground(Color bg)`: Sets the background color of the
    //   panel.
    //   - `updateUI()`: Resets the UI property with a value from the
    //   current look and feel.
    //   - `getUI()`: Returns the look and feel object that renders this
    //   component.

    //### Example
    //Here's a simple example demonstrating how to create a `JPanel` and
    // add components to it:


    //    public static void main(String[] args) {
    //        JFrame frame = new JFrame("JPanel Example");
    //        frame.setSize(400, 300);
    //        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //
    //        JPanel panel = new JPanel();
    //        panel.setBackground(Color.LIGHT_GRAY);
    //
    //        JButton button1 = new JButton("Button 1");
    //        JButton button2 = new JButton("Button 2");
    //        JLabel label = new JLabel("This is a label");
    //
    //        panel.add(button1);
    //        panel.add(button2);
    //        panel.add(label);
    //
    //        frame.add(panel);
    //        frame.setVisible(true);
    //    }


    //### Explanation
    //- **Creating the Frame**: `JFrame frame = new JFrame("JPanel Example");` creates a new frame with the title "JPanel Example".
    //- **Setting Size**: `frame.setSize(400, 300);` sets the size of the frame to 400x300 pixels.
    //- **Close Operation**: `frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);` ensures the application exits when the frame is closed.
    //- **Creating the Panel**: `JPanel panel = new JPanel();` creates a new panel.
    //- **Setting Background**: `panel.setBackground(Color.LIGHT_GRAY);` sets the background color of the panel.
    //- **Adding Components**: `panel.add(button1);`, `panel.add(button2);`, and `panel.add(label);` add the buttons and label to the panel.
    //- **Adding Panel to Frame**: `frame.add(panel);` adds the panel to the frame.
    //- **Visibility**: `frame.setVisible(true);` makes the frame visible.

    //### Why Use JPanel?
    //- **Organization**: Helps in organizing components within a GUI.
    //- **Flexibility**: Supports various layout managers for arranging components.
    //- **Reusability**: Can be reused across different parts of an application.

    //                  -------******-------

    // Lecture part:

    // Intermediate containers are used to structure the graphic application
    // the top level container may contain one or many intermediate
    // containers swing proposes several intermediate containers: JPanel,
    // JScrollPane, JSplitPane, JTabbedPane, JToolBar,...

    public static void main(String[] args) {
        // Top Level Container is JFrame
        JFrame frame = new JFrame("JPanel");
        frame.setBounds(0,0,500,500);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pan = new JPanel();
        pan.setBounds(100,100,200,200);
        pan.setBackground(Color.BLUE);
        pan.setLayout(null);
        pan.setVisible(true);

        frame.add(pan);
    }
}
