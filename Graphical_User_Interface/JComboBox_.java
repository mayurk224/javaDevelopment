package Graphical_User_Interface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBox_ {

    //**JComboBox** is a part of the Java Swing package that provides a drop-down list of options for users to select from. It inherits from the `JComponent` class and can be either editable or read-only, depending on the programmer's choice¹².
    //
    //### Key Features and Methods:
    //- **Constructors**:
    //  - `JComboBox()`: Creates an empty JComboBox.
    //  - `JComboBox(E[] items)`: Creates a JComboBox with items from an array.
    //  - `JComboBox(Vector<E> items)`: Creates a JComboBox with items from a vector.
    //
    //- **Common Methods**:
    //  - `addItem(E item)`: Adds an item to the JComboBox.
    //  - `removeItem(Object anObject)`: Removes an item from the JComboBox.
    //  - `getSelectedItem()`: Returns the selected item.
    //  - `setEditable(boolean b)`: Sets whether the JComboBox is editable.
    //  - `addActionListener(ActionListener l)`: Adds an ActionListener to the JComboBox.
    //
    //### Example:
    //Here's a simple example to create a JComboBox and add it to a JFrame:
    //
    public static void main(String[] args) {
        // Create a new JFrame with a title
        JFrame frame = new JFrame("JComboBox Example");

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Create an array of options for the JComboBox
        String[] items = {"Apple", "Banana", "Cherry", "Date", "Grape"};

        // Create a JComboBox with the items
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setBounds(50, 50, 150, 30);  // Set position and size

        // Add an ActionListener to handle item selection
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBox.getSelectedItem();
                System.out.println("Selected: " + selectedItem);
            }
        });

        // Add the JComboBox to the frame
        frame.add(comboBox);

        // Make the frame visible
        frame.setVisible(true);
    }

}
