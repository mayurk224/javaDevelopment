package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;

public class JSplitPane_ {

    // JSplitPane is a component in the Java Swing library that is used to divide two components either horizontally or vertically. It allows users to adjust the size of the components by dragging a divider. Here are some key points about JSplitPane:

    // Key Features of JSplitPane

    // Divides Two Components:
    // JSplitPane can only divide two components.
    // The components can be arranged side by side (horizontal split) or one above the other (vertical split).

    // Constructors:
    // JSplitPane(): Creates a new split pane with a horizontal split.
    // JSplitPane(int orientation): Creates a new split pane with the specified orientation (JSplitPane.HORIZONTAL_SPLIT or JSplitPane.VERTICAL_SPLIT).
    // JSplitPane(int orientation, boolean continuousLayout): Creates a new split pane with the specified orientation and continuous layout.
    // JSplitPane(int orientation, Component leftComponent, Component rightComponent): Creates a new split pane with the specified orientation and components.
    // JSplitPane(int orientation, boolean continuousLayout, Component leftComponent, Component rightComponent): Creates a new split pane with the specified orientation, continuous layout, and components.

    // Common Methods:
    // setLeftComponent(Component comp): Sets the left (or top) component.
    // setRightComponent(Component comp): Sets the right (or bottom) component.
    // setDividerLocation(int location): Sets the location of the divider.
    // setOneTouchExpandable(boolean expandable): Enables or disables the one-touch expandable feature.
    // setResizeWeight(double value): Specifies how to distribute extra space when the size of the split pane changes.

    // Example
    // Here’s a simple example demonstrating how to use JSplitPane:

        public static void main(String[] args) {
            JFrame frame = new JFrame("JSplitPane Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JPanel leftPanel = new JPanel();
            leftPanel.setBackground(Color.LIGHT_GRAY);
            leftPanel.add(new JLabel("Left Panel"));

            JPanel rightPanel = new JPanel();
            rightPanel.setBackground(Color.CYAN);
            rightPanel.add(new JLabel("Right Panel"));

            JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
            splitPane.setDividerLocation(150);
            splitPane.setOneTouchExpandable(true);

            frame.add(splitPane);
            frame.setVisible(true);
        }

    // Explanation
    // Creating the Frame: JFrame frame = new JFrame("JSplitPane Example"); creates a new frame with the title “JSplitPane Example”.
    // Setting Size: frame.setSize(400, 300); sets the size of the frame to 400x300 pixels.
    // Creating Panels: Two panels (leftPanel and rightPanel) are created and customized with background colors and labels.
    // Creating the Split Pane: JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel); creates a split pane with a horizontal split and adds the two panels.
    // Setting Divider Location: splitPane.setDividerLocation(150); sets the initial location of the divider.
    // One-Touch Expandable: splitPane.setOneTouchExpandable(true); enables the one-touch expandable feature, allowing users to quickly collapse or expand the split pane.
    // Adding Split Pane to Frame: frame.add(splitPane); adds the split pane to the frame.
    // Visibility: frame.setVisible(true); makes the frame visible.

    // Why Use JSplitPane?
    // Flexible Layouts: Allows for flexible and dynamic layouts by letting users adjust the size of components.
    // User Experience: Enhances user experience by providing a way to manage screen real estate efficiently.
    // Versatility: Can be used with various components like JPanel, JScrollPane, JTextArea, etc.

    //                     -------******--------

    // Lecture part:

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("JSplitPane");
//        frame.setVisible(true);
//        frame.setLayout(new GridLayout());
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setBounds(0,0, 500,500);
//
//        Panel p1 = new Panel();
//        p1.setBackground(Color.blue);
//
//        Panel p2 = new Panel();
//        p2.setBackground(Color.CYAN);
//
//        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
//
//        // Here we didn't add p1 & p2 in frame because it already adds by split pane
//        frame.add(split);
//    }
}
