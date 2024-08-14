package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;

public class FlowLayout_ {

    //`FlowLayout` is one of the simplest layout managers in Java Swing. It arranges components in a left-to-right flow, much like words in a paragraph. When a row is filled, the layout manager moves to the next row. This layout is particularly useful when you want to arrange components in a row without worrying about precise placement or alignment.
    //
    //#### **Features of FlowLayout**
    //
    //- **Left-to-Right Alignment**: By default, components are placed in a row, from left to right. When the row is full, the next component moves to the next row.
    //
    //- **Wraps Components**: If the components do not fit in a single row, they wrap to the next row automatically.
    //
    //- **Alignment Options**: `FlowLayout` allows you to align components to the left, center, or right of the container.
    //
    //- **Gaps Between Components**: You can specify horizontal and vertical gaps between components, making it easy to control spacing.
    //
    //#### **Methods in FlowLayout**
    //
    //1. **`FlowLayout()`**: Creates a new `FlowLayout` with centered alignment and default gaps.
    //2. **`FlowLayout(int align)`**: Creates a new `FlowLayout` with the specified alignment (`FlowLayout.LEFT`, `FlowLayout.CENTER`, `FlowLayout.RIGHT`).
    //3. **`FlowLayout(int align, int hgap, int vgap)`**: Creates a new `FlowLayout` with the specified alignment and gaps.
    //4. **`setAlignment(int align)`**: Sets the alignment of the layout. Can be `FlowLayout.LEFT`, `FlowLayout.CENTER`, or `FlowLayout.RIGHT`.
    //5. **`setHgap(int hgap)`**: Sets the horizontal gap between components.
    //6. **`setVgap(int vgap)`**: Sets the vertical gap between components.
    //7. **`getAlignment()`**: Returns the alignment of the layout.
    //8. **`getHgap()`**: Returns the horizontal gap between components.
    //9. **`getVgap()`**: Returns the vertical gap between components.
    //
    //#### **Example Code**

        public static void main(String[] args) {
            JFrame frame = new JFrame("FlowLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);

            // Set the layout to FlowLayout with left alignment and 10px gaps
            frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

            // Add buttons to the frame
            for (int i = 1; i <= 10; i++) {
                frame.add(new JButton("Button " + i));
            }

            // Display the frame
            frame.setVisible(true);
        }

    //#### **Explanation**
    //
    //- **Alignment**: The `FlowLayout` is set to left alignment, so components are aligned to the left edge of the container.
    //- **Gaps**: Horizontal and vertical gaps of 10 pixels are set between the components.
    //- **Component Wrapping**: If the window size is reduced, the buttons automatically wrap to the next row, demonstrating the flexible nature of `FlowLayout`.
    //
    //#### **Why Use FlowLayout?**
    //
    //- **Simplicity**: `FlowLayout` is easy to understand and implement, making it ideal for quick layouts where precise control is not needed.
    //- **Flexibility**: It automatically adjusts to the container’s size, wrapping components as necessary.
    //- **Natural Ordering**: Components are added in a natural left-to-right, top-to-bottom order, which can be particularly useful for simple forms or toolbars.
    //
    //In summary, `FlowLayout` is a basic and flexible layout manager that arranges components in a natural left-to-right, top-to-bottom order. It's ideal for simple, straightforward layouts where the order and alignment of components should flow naturally within the container.
}
