package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;

public class JTabbedPane_ {

    // JTabbedPane is a component in Java Swing that allows you to create a tabbed pane interface. This means you can have multiple panels (or components) that share the same space, with each panel accessible via a tab.

    // Key Features of JTabbedPane
    // Tabs with Titles and Icons: Each tab can have a title, an icon, or both.
    // Tab Placement: Tabs can be placed at the top, bottom, left, or right of the pane.
    // Scrollable Tabs: If there are too many tabs to fit in the visible area, scroll arrows will appear.
    // Tool Tips: Tabs can have tool tips that appear when the user hovers over them.
    // Mnemonics: You can assign keyboard shortcuts to tabs.
    // Event Handling: You can add event listeners to respond to tab selection or deselection events.

    // Example with Full Code
    // Here’s a complete example demonstrating how to use JTabbedPane:

    //    public static void main(String[] args) {
    //        // Create a new JFrame
    //        JFrame frame = new JFrame("JTabbedPane Example");
    //        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //        frame.setSize(400, 300);
    //
    //        // Create a JTabbedPane
    //        JTabbedPane tabbedPane = new JTabbedPane();
    //
    //        // Create panels to add to the tabbed pane
    //        JPanel panel1 = new JPanel();
    //        panel1.add(new JLabel("This is Panel 1"));
    //        tabbedPane.addTab("Tab 1", panel1);
    //
    //        JPanel panel2 = new JPanel();
    //        panel2.add(new JLabel("This is Panel 2"));
    //        tabbedPane.addTab("Tab 2", panel2);
    //
    //        JPanel panel3 = new JPanel();
    //        panel3.add(new JLabel("This is Panel 3"));
    //        tabbedPane.addTab("Tab 3", panel3);
    //
    //        // Add the tabbed pane to the frame
    //        frame.add(tabbedPane);
    //        frame.setVisible(true);
    //    }

    // Explanation of the Code
    // Creating the JFrame: The JFrame is the main window of the application. We set its default close operation and size.
    // Creating the JTabbedPane: We instantiate the JTabbedPane which will hold our tabs.
    // Creating Panels: We create JPanel objects for each tab. Each panel can contain various components; in this example, we simply add a JLabel to each panel.
    // Adding Tabs: We use the addTab method to add each panel to the JTabbedPane. Each tab is given a title.
    // Adding the JTabbedPane to the JFrame: Finally, we add the JTabbedPane to the JFrame and make the frame visible.

    // Why Use JTabbedPane?
    // Organized Interface: It helps in organizing the user interface by grouping related components into separate tabs.
    // Space Management: It allows multiple components to share the same space, making the interface cleaner and more manageable.
    // User-Friendly: Users can easily switch between different views or sections of the application by clicking on the tabs.
    // Using JTabbedPane is particularly useful in applications where you need to present multiple sets of information or controls in a compact and organized manner.

    //                      -------*******--------

    // Lecture Part:

    public static void main(String[] args) {

        JFrame f = new JFrame("JTabbedPane");
        f.setBounds(0,0,500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.red);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.yellow);
        JPanel p3 = new JPanel();
        p3.setBackground(Color.blue);

        JTabbedPane tp = new JTabbedPane();
        tp.add("Main",p1);
        tp.add("Contact",p2);
        tp.add("Help",p3);
        tp.setVisible(true);
        tp.setBounds(100,100,300,300);

        f.add(tp);
    }
}
