package Graphical_User_Interface;

import javax.swing.*;

public class JMenu_JMenuBar {

    //`JMenu` and `JMenuBar` are part of the Java Swing library and are used to create a menu system in a graphical user interface (GUI). A `JMenuBar` is a container that holds `JMenu` objects, and a `JMenu` is a component that holds `JMenuItem` objects or other `JMenu` objects (to create sub-menus). This combination allows developers to create a hierarchical menu structure that can be used in applications for various functionalities like file handling, editing, viewing options, etc.
    //
    //#### **JMenuBar**
    //
    //- **Purpose**: The `JMenuBar` serves as a container for `JMenu` objects. It typically sits at the top of a window (in the `JFrame`) and provides a space for users to access the menu options.
    //
    //- **Features**:
    //  - Can contain multiple `JMenu` objects.
    //  - Placed at the top of a window by default.
    //  - Supports adding icons, text, and key combinations to menus for accessibility.
    //
    //#### **JMenu**
    //
    //- **Purpose**: The `JMenu` represents an individual menu in the menu bar. It can contain `JMenuItem` objects, separators, and even other `JMenu` objects (creating sub-menus).
    //
    //- **Features**:
    //  - Can have sub-menus, creating a nested menu structure.
    //  - Supports adding `JMenuItem` objects, which represent individual menu actions.
    //  - Supports action listeners to respond to user interactions.
    //
    //#### **Common Methods**
    //
    //**JMenuBar:**
    //1. **`void add(JMenu menu)`**: Adds a `JMenu` to the `JMenuBar`.
    //2. **`JMenu getMenu(int index)`**: Returns the `JMenu` at the specified position in the `JMenuBar`.
    //3. **`int getMenuCount()`**: Returns the number of `JMenu` objects in the `JMenuBar`.
    //4. **`void setHelpMenu(JMenu menu)`**: Sets a specific `JMenu` as the "help" menu.
    //
    //**JMenu:**
    //1. **`void add(JMenuItem item)`**: Adds a `JMenuItem` to the `JMenu`.
    //2. **`void addSeparator()`**: Adds a separator line to the `JMenu`, used to group related menu items visually.
    //3. **`JMenuItem add(String s)`**: Adds a `JMenuItem` with the specified text.
    //4. **`void addMenuListener(MenuListener l)`**: Adds a listener to the menu to handle events.
    //5. **`boolean isTearOff()`**: Checks if the menu is a tear-off menu (a menu that can be dragged off the menu bar).
    //
    //#### **Example Code**

        public static void main(String[] args) {
            JFrame frame = new JFrame("JMenu & JMenuBar Example");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            // Creating the menu bar
            JMenuBar menuBar = new JMenuBar();

            // Creating the menus
            JMenu fileMenu = new JMenu("File");
            JMenu editMenu = new JMenu("Edit");
            JMenu viewMenu = new JMenu("View");

            // Creating menu items
            JMenuItem newItem = new JMenuItem("New");
            JMenuItem openItem = new JMenuItem("Open");
            JMenuItem saveItem = new JMenuItem("Save");
            JMenuItem exitItem = new JMenuItem("Exit");

            // Adding menu items to the File menu
            fileMenu.add(newItem);
            fileMenu.add(openItem);
            fileMenu.add(saveItem);
            fileMenu.addSeparator();  // Adds a separator between "Save" and "Exit"
            fileMenu.add(exitItem);

            // Adding the menus to the menu bar
            menuBar.add(fileMenu);
            menuBar.add(editMenu);
            menuBar.add(viewMenu);

            // Setting the menu bar for the frame
            frame.setJMenuBar(menuBar);

            // Adding action listeners to menu items
            exitItem.addActionListener(e -> System.exit(0));

            frame.setVisible(true);
        }

    //#### **Explanation**
    //
    //- **JMenuBar**: The `JMenuBar` is created and added to the frame using `frame.setJMenuBar(menuBar);`. It holds the menus (`File`, `Edit`, `View`) created using the `JMenu` class.
    //- **JMenu**: The `JMenu` objects represent the individual menus that can hold multiple `JMenuItem` objects. In this example, the `File` menu contains items like "New", "Open", "Save", and "Exit".
    //- **JMenuItem**: These are individual menu options that can trigger specific actions. For example, the "Exit" item is configured to close the application when selected.
    //- **Separators**: Separators are used to group related items visually within a menu. In the example, a separator is added between the "Save" and "Exit" items in the `File` menu.
    //
    //#### **Why Use JMenu and JMenuBar?**
    //
    //- **Organize Functions**: `JMenu` and `JMenuBar` allow developers to organize application functions into a structured menu, making it easy for users to navigate and access features.
    //- **Hierarchy and Nesting**: These classes support creating a hierarchy of menus, including sub-menus, which helps in categorizing options logically.
    //- **Customization**: The ability to add icons, shortcuts, and separators makes the menu system customizable and user-friendly.
    //- **Event Handling**: Each `JMenuItem` can be tied to an action listener, allowing developers to define specific behaviors when menu items are selected.
    //
    //This combination of `JMenu` and `JMenuBar` is essential in building desktop applications with a clear, accessible interface for users.
}
