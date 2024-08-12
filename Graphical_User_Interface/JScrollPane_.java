package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;

public class JScrollPane_ {

    // JScrollPane is a component in the Java Swing library that provides a scrollable view of another component, such as a JPanel or JTextArea. It is particularly useful when you need to display content that exceeds the visible area of the window, allowing users to scroll through the content.

    // Key Features of JScrollPane

    // Scrollable View:
    // JScrollPane allows you to add scroll bars to any component, making it scrollable.
    // It can handle both vertical and horizontal scrolling.

    // Constructors:
    // JScrollPane(): Creates an empty scroll pane.
    // JScrollPane(Component view): Creates a scroll pane with the specified component as the scrollable view.
    // JScrollPane(int vsbPolicy, int hsbPolicy): Create an empty scroll pane with specified vertical and horizontal scroll bar policies.
    // JScrollPane(Component view, int vsbPolicy, int hsbPolicy): Creates a scroll pane with the specified component and scroll bar policies.

    // Common Methods:
    // setVerticalScrollBarPolicy(int policy): Sets the vertical scroll bar policy.
    // setHorizontalScrollBarPolicy(int policy): Sets the horizontal scroll bar policy.
    // setViewportView(Component view): Sets the component to be displayed in the viewport of the scroll pane.
    // setColumnHeaderView(Component view): Sets the column header for the scroll pane.
    // setRowHeaderView(Component view): Sets the row header for the scroll pane.

    // Example
    // Here’s a simple example demonstrating how to use JScrollPane with a JPanel:

    // public class JScrollPaneExample {
    //    public static void main(String[] args) {
    //        JFrame frame = new JFrame("JScrollPane Example");
    //        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //        frame.setSize(300, 200);
    //
    //        JPanel panel = new JPanel();
    //        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    //        for (int i = 1; i <= 50; i++) {
    //            panel.add(new JLabel("Label " + i));
    //        }
    //
    //        JScrollPane scrollPane = new JScrollPane(panel);
    //        frame.add(scrollPane);
    //        frame.setVisible(true);
    //    }
    //}

    // Explanation
    // Creating the Frame: JFrame frame = new JFrame("JScrollPane Example"); creates a new frame with the title “JScrollPane Example”.
    // Setting Size: frame.setSize(300, 200); sets the size of the frame to 300x200 pixels.
    // Creating the Panel: JPanel panel = new JPanel(); creates a new panel and sets its layout to BoxLayout.
    // Adding Labels: A loop adds 50 labels to the panel.
    // Creating the Scroll Pane: JScrollPane scrollPane = new JScrollPane(panel); creates a scroll pane with the panel as its view.
    // Adding Scroll Pane to Frame: frame.add(scrollPane); adds the scroll pane to the frame.
    // Visibility: frame.setVisible(true); makes the frame visible.

    // Why Use JScrollPane?
    // Dynamic Content: Ideal for displaying content that changes size dynamically.
    // User Experience: Enhances user experience by allowing easy navigation through large content.
    // Flexibility: Can be used with various components like JPanel, JTextArea, JTable, etc.

    //                  ---------******----------

    // Lecture Part:

    public static void main(String[] args) {

        JFrame frame = new JFrame("JScrollPane");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,500,500);

        JScrollPane spane = new JScrollPane();
        spane.setBounds(100,100,200,200);
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        spane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        spane.setVisible(true);

        frame.add(spane);
    }
}
