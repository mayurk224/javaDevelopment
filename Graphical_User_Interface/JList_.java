package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class JList_ {

    // ### **JList Overview**
    //
    //`JList` is a Swing component in Java that displays a list of items for selection. It can be used to present a scrolling list of items from which the user can choose one or more items. The `JList` component can display a static list of elements, or it can be dynamically populated based on user interactions or other factors.
    //
    //### **Features of JList**
    //
    //1. **Multiple Selection Modes:**
    //   - **Single Selection:** Only one item can be selected at a time.
    //   - **Single Interval Selection:** A contiguous range of items can be selected.
    //   - **Multiple Interval Selection:** Multiple ranges of items can be selected.
    //
    //2. **Custom Rendering:**
    //   - You can customize how each item is rendered using a `ListCellRenderer`. This allows for rich, customized displays of list data, such as displaying icons, formatted text, etc.
    //
    //3. **Scrolling Capability:**
    //   - `JList` can be added to a `JScrollPane` to provide scrolling when the list of items exceeds the visible area.
    //
    //4. **Support for Dynamic Data:**
    //   - The list can be populated dynamically, with the backing data model (`ListModel`) being updated as needed. This is useful for creating lists that reflect real-time data.
    //
    //5. **List Data Model:**
    //   - `JList` is built on the MVC (Model-View-Controller) design pattern, separating the list's data (`ListModel`) from its display (`JList`) and interaction logic.
    //
    //6. **Event Handling:**
    //   - `JList` supports event handling for user interactions, such as item selection. You can add listeners to respond when the user selects or deselects items.
    //
    //### **Commonly Used Methods**
    //
    //- **Constructor Methods:**
    //  - `JList()`: Creates an empty `JList`.
    //  - `JList(E[] listData)`: Creates a `JList` that displays the elements in the specified array.
    //  - `JList(ListModel<E> dataModel)`: Creates a `JList` that displays the elements in the specified `ListModel`.
    //
    //- **Selection Methods:**
    //  - `getSelectedIndex()`: Returns the index of the selected item, or -1 if no item is selected.
    //  - `getSelectedIndices()`: Returns an array of all selected indices.
    //  - `getSelectedValue()`: Returns the value of the selected item.
    //  - `getSelectedValuesList()`: Returns a list of all selected items.
    //
    //- **List Model Methods:**
    //  - `setListData(E[] listData)`: Sets the data model from an array.
    //  - `setModel(ListModel<E> model)`: Sets the `ListModel` that provides the data for the list.
    //
    //- **Rendering Methods:**
    //  - `setCellRenderer(ListCellRenderer<? super E> cellRenderer)`: Sets the `ListCellRenderer` that paints the cells in the list.
    //  - `setFixedCellHeight(int height)`: Sets a fixed cell height, useful for improving performance with large lists.
    //
    //- **Interaction Methods:**
    //  - `addListSelectionListener(ListSelectionListener listener)`: Adds a listener that will be notified when the selection changes.
    //
    //- **Scrolling:**
    //  - `ensureIndexIsVisible(int index)`: Scrolls the list to make the specified index visible.
    //
    //### **Why Use JList?**
    //
    //1. **Versatile Display of Data:**
    //   - `JList` is ideal for displaying a collection of items in a vertical list format. Whether the data is static or dynamic, `JList` provides a simple way to show it.
    //
    //2. **User Interaction:**
    //   - It provides an easy way for users to select items from a list, with support for multiple selection modes. This is particularly useful in applications where users need to make choices from a list of options.
    //
    //3. **Customization:**
    //   - The ability to customize the rendering of list items allows developers to create visually appealing and contextually rich lists.
    //
    //4. **Integration with MVC:**
    //   - By separating the data model from the view, `JList` adheres to the MVC pattern, making it easier to manage and update data within the list without directly interacting with the UI component.
    //
    //5. **Rich Event Handling:**
    //   - `JList` can handle user interactions with ease, providing events for selection changes, clicks, and more. This makes it a powerful component for building interactive and responsive applications.
    //
    //### **When to Use JList?**
    //
    //- **Selection of Multiple Items:**
    //  - When you need to provide a list of items where users can select one or more items, such as in a file selection dialog, options list, or form input.
    //
    //- **Displaying Lists of Data:**
    //  - When you need to display a collection of data in a list format, especially when the data needs to be scrollable or when custom rendering is required.
    //
    //- **Dynamic Lists:**
    //  - When the list's contents need to change based on user input or other events, `JList` with a dynamic `ListModel` is an ideal choice.
    //
    //### **Conclusion**
    //
    //`JList` is a powerful component in the Java Swing library that provides extensive functionality for displaying and interacting with lists of items. Its flexibility, customization options, and ease of integration make it a go-to choice for many types of applications.

//    public static void main(String[] args) {
//        // Create a new JFrame with a title
//        JFrame frame = new JFrame("JList Example");
//
//        // Set frame properties
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 300);
//        frame.setLayout(null);
//
//        // Create an array of items to display in the JList
//        String[] items = {"Apple", "Banana", "Cherry", "Date", "Grape"};
//
//        // Create the JList with the items
//        JList<String> list = new JList<>(items);
//        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//        list.setBounds(50, 50, 150, 100);
//
//        // Create a JScrollPane to add scrolling capability to the JList
//        JScrollPane scrollPane = new JScrollPane(list);
//        scrollPane.setBounds(50, 50, 150, 100);
//
//        // Create a button to show the selected items
//        JButton button = new JButton("Show Selected");
//        button.setBounds(220, 50, 120, 30);
//
//        // Add ActionListener to the button
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Get the selected items from the list
//                List<String> selectedItems = list.getSelectedValuesList();
//                System.out.println("Selected items: " + selectedItems);
//            }
//        });
//
//        // Add components to the frame
//        frame.add(scrollPane);
//        frame.add(button);
//
//        // Make the frame visible
//        frame.setVisible(true);
//    }

    public static void main(String[] args) {
        JFrame f = new JFrame("JList");
        f.setBounds(0,0,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        String[] s = {"Apple", "Mango", "Banana", "Grapes"};
        JList<String> jl = new JList<>(s);
        jl.setBounds(100,100,200,200);

        JButton b = new JButton("Click");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<String> l = jl.getSelectedValuesList();
                System.out.println(l);
            }
        });

        f.add(b);
        f.add(jl);
    }
}
