package Graphical_User_Interface;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class JTable_DefaultTableModel {

    //`JTable` is a Swing component used to display and edit a grid of data in a tabular format. It is highly customizable and can handle complex data structures. `DefaultTableModel` is a standard model implementation for `JTable`, which provides methods for managing the table's data.
    //
    //#### **JTable**
    //
    //- **Purpose**: `JTable` is used to display data in a two-dimensional table format, with rows and columns. Each cell in the table can hold text, numbers, or other types of data.
    //
    //- **Features**:
    //  - Displays data in rows and columns.
    //  - Supports editing of data within the table cells.
    //  - Allows customization of cell rendering and editing.
    //  - Supports sorting, filtering, and selection of table rows.
    //  - Integrates with `TableModel` to separate data from the table's view.
    //
    //- **Common Methods**:
    //  1. **`getValueAt(int row, int column)`**: Returns the value at the specified cell.
    //  2. **`setValueAt(Object aValue, int row, int column)`**: Sets the value at the specified cell.
    //  3. **`getColumnModel()`**: Returns the `TableColumnModel` that contains all the columns in the table.
    //  4. **`getSelectedRow()`**: Returns the index of the first selected row.
    //  5. **`setRowSelectionAllowed(boolean rowSelectionAllowed)`**: Sets whether row selection is allowed.
    //
    //#### **DefaultTableModel**
    //
    //- **Purpose**: `DefaultTableModel` is a concrete implementation of `AbstractTableModel` and is used to manage the data in a `JTable`. It allows developers to manipulate table data by adding, removing, and updating rows and columns.
    //
    //- **Features**:
    //  - Stores data in a `Vector` of `Vector` objects, where each inner `Vector` represents a row of data.
    //  - Provides methods for adding, removing, and updating rows and columns.
    //  - Supports notifications to the `JTable` when data changes, automatically updating the table view.
    //
    //- **Common Methods**:
    //  1. **`addRow(Object[] rowData)`**: Adds a row to the model.
    //  2. **`removeRow(int row)`**: Removes the row at the specified index.
    //  3. **`setValueAt(Object aValue, int row, int column)`**: Sets the value in the cell at the specified row and column.
    //  4. **`getRowCount()`**: Returns the number of rows in the model.
    //  5. **`getColumnCount()`**: Returns the number of columns in the model.
    //  6. **`getColumnName(int column)`**: Returns the name of the specified column.
    //
    //#### **Example Code**

        public static void main(String[] args) {
            JFrame frame = new JFrame("JTable & DefaultTableModel Example");
            frame.setSize(500, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            // Define column names
            String[] columns = {"ID", "Name", "Age", "Country"};

            // Define initial data
            Object[][] data = {
                {1, "Alice", 30, "USA"},
                {2, "Bob", 25, "UK"},
                {3, "Charlie", 35, "Canada"}
            };

            // Create a DefaultTableModel
            DefaultTableModel tableModel = new DefaultTableModel(data, columns);

            // Create a JTable with the model
            JTable table = new JTable(tableModel);

            // Add the table to a JScrollPane (for scrolling)
            JScrollPane scrollPane = new JScrollPane(table);
            frame.add(scrollPane, BorderLayout.CENTER);

            // Adding a new row to the table model
            JButton addButton = new JButton("Add Row");
            addButton.addActionListener(e -> {
                Object[] newRow = {4, "David", 28, "Australia"};
                tableModel.addRow(newRow);
            });

            frame.add(addButton, BorderLayout.SOUTH);

            frame.setVisible(true);
        }

    //#### **Explanation**
    //
    //- **JTable**: The `JTable` is created with a `DefaultTableModel` that defines the table structure. The model includes column names and initial data.
    //- **DefaultTableModel**: The `DefaultTableModel` stores and manages the table's data. The `addRow` method is used to add new rows dynamically.
    //- **JScrollPane**: The `JScrollPane` is used to add scroll functionality to the `JTable`, allowing the user to scroll through the table if it exceeds the visible area.
    //
    //#### **Why Use JTable and DefaultTableModel?**
    //
    //- **Separation of Data and View**: `JTable` separates the data (managed by `TableModel`) from its visual representation, making it easier to manage and update.
    //- **Flexibility**: `JTable` allows for custom cell rendering, editing, sorting, and filtering, making it highly adaptable to different use cases.
    //- **Ease of Data Management**: `DefaultTableModel` simplifies the management of table data, with built-in methods for adding, removing, and updating data.
    //- **Dynamic Updates**: The model notifies the table of any data changes, automatically refreshing the view without manual intervention.
    //
    //Together, `JTable` and `DefaultTableModel` provide a powerful and flexible framework for displaying and managing tabular data in Java Swing applications.
}
