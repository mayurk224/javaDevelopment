package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;

public class GridLayout_ {

    //`GridLayout` is a layout manager in Java Swing that arranges components in a grid of cells, with each component occupying one cell. All cells in the grid have the same size, meaning that the layout does not take into account the preferred size of the components. This layout is particularly useful when you want to create a consistent grid of buttons, labels, or other components.
    //
    //#### **Features of GridLayout**
    //
    //- **Uniform Grid Cells**: All components in the grid have the same size, both in terms of width and height.
    //
    //- **Configurable Rows and Columns**: You can specify the number of rows and columns in the grid. If only one dimension (rows or columns) is specified, the other dimension is calculated based on the number of components added.
    //
    //- **No Gaps by Default**: The default grid layout has no gaps between the components. However, gaps (horizontal and vertical) can be specified.
    //
    //- **Fills in Left to Right, Top to Bottom**: Components are added to the grid from left to right and top to bottom, filling up each row before moving to the next.
    //
    //#### **Methods in GridLayout**
    //
    //1. **`GridLayout(int rows, int cols)`**: Creates a grid layout with the specified number of rows and columns.
    //2. **`GridLayout(int rows, int cols, int hgap, int vgap)`**: Creates a grid layout with the specified number of rows and columns, along with the specified horizontal and vertical gaps.
    //3. **`setRows(int rows)`**: Sets the number of rows in the layout.
    //4. **`setColumns(int cols)`**: Sets the number of columns in the layout.
    //5. **`setHgap(int hgap)`**: Sets the horizontal gap between components.
    //6. **`setVgap(int vgap)`**: Sets the vertical gap between components.
    //7. **`getRows()`**: Returns the number of rows in the layout.
    //8. **`getColumns()`**: Returns the number of columns in the layout.
    //9. **`getHgap()`**: Returns the horizontal gap between components.
    //10. **`getVgap()`**: Returns the vertical gap between components.
    //
    //#### **Example Code**

        public static void main(String[] args) {
            JFrame frame = new JFrame("GridLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            // Set the layout to GridLayout with 2 rows and 3 columns
            frame.setLayout(new GridLayout(2, 3, 5, 5)); // 5px horizontal and vertical gaps

            // Add buttons to the grid
            for (int i = 1; i <= 6; i++) {
                frame.add(new JButton("Button " + i));
            }

            // Display the frame
            frame.setVisible(true);
        }

    //#### **Explanation**
    //
    //- **Rows and Columns**: The `GridLayout` is set to have 2 rows and 3 columns. This means the layout will arrange components in two rows, with three components in each row.
    //- **Horizontal and Vertical Gaps**: The layout is configured to have 5 pixels of horizontal and vertical gaps between components.
    //- **Component Addition**: Six buttons are added to the grid, filling it from left to right and top to bottom.
    //
    //#### **Why Use GridLayout?**
    //
    //- **Consistency**: `GridLayout` is ideal when you need a uniform, consistent layout where all components are the same size.
    //- **Simplicity**: It simplifies the creation of grid-based layouts, such as calculator keypads, forms with evenly spaced fields, or any interface requiring a structured, grid-like arrangement.
    //- **Ease of Use**: With just a few parameters, you can control the entire layout, making it one of the easiest layout managers to use for grid-like arrangements.
    //
    //In summary, `GridLayout` is a straightforward and powerful layout manager for creating uniform, grid-based layouts. It ensures that all components have the same size and is especially useful in scenarios where a consistent, grid-like appearance is desired.
}
