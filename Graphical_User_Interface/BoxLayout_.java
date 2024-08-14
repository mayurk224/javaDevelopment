package Graphical_User_Interface;

import javax.swing.*;

public class BoxLayout_ {

    //`BoxLayout` is a powerful and flexible layout manager in Java Swing that allows you to arrange components either vertically (in a column) or horizontally (in a row). Unlike other layout managers, `BoxLayout` can be used to create highly customized layouts by combining different components and containers in various configurations.
    //
    //#### **Features of BoxLayout**
    //
    //- **Orientation Options**: You can arrange components either along the X-axis (horizontally) or the Y-axis (vertically).
    //
    //- **Alignment Control**: `BoxLayout` allows you to control the alignment of components along the perpendicular axis, providing finer control over component placement.
    //
    //- **Component Sizing**: Components can be made to stretch or remain at their preferred sizes within the `BoxLayout`.
    //
    //- **Spacing**: You can add rigid areas, glue, or struts between components to control spacing, providing great flexibility in layout design.
    //
    //#### **Methods in BoxLayout**
    //
    //1. **`BoxLayout(Container target, int axis)`**: Constructs a `BoxLayout` that will lay out components in the specified direction (`BoxLayout.X_AXIS` for horizontal, `BoxLayout.Y_AXIS` for vertical).
    //
    //2. **`Box.createHorizontalBox()`**: Creates a horizontal `Box` container that uses `BoxLayout` along the X-axis.
    //
    //3. **`Box.createVerticalBox()`**: Creates a vertical `Box` container that uses `BoxLayout` along the Y-axis.
    //
    //4. **`Box.createRigidArea(Dimension d)`**: Creates an invisible, fixed-size component that can be used as a spacer.
    //
    //5. **`Box.createHorizontalStrut(int width)`**: Creates an invisible, fixed-width component used to add space between components in a horizontal `BoxLayout`.
    //
    //6. **`Box.createVerticalStrut(int height)`**: Creates an invisible, fixed-height component used to add space between components in a vertical `BoxLayout`.
    //
    //7. **`Box.createHorizontalGlue()`**: Creates an invisible component that grows horizontally to take up any extra space.
    //
    //8. **`Box.createVerticalGlue()`**: Creates an invisible component that grows vertically to take up any extra space.
    //
    //9. **`setAlignmentX(float alignment)`**: Sets the alignment of the component along the X-axis.
    //
    //10. **`setAlignmentY(float alignment)`**: Sets the alignment of the component along the Y-axis.
    //
    //#### **Example Code**

        public static void main(String[] args) {
            JFrame frame = new JFrame("BoxLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            // Create a panel with BoxLayout along the Y-axis (vertical)
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            // Add buttons to the panel
            panel.add(Box.createVerticalStrut(10)); // Add vertical space
            panel.add(new JButton("Button 1"));
            panel.add(Box.createVerticalStrut(10)); // Add vertical space
            panel.add(new JButton("Button 2"));
            panel.add(Box.createVerticalStrut(10)); // Add glue to push the next button to the bottom
            panel.add(new JButton("Button 3"));

            // Add the panel to the frame
            frame.add(panel);
            frame.setVisible(true);
        }

    //#### **Explanation**
    //
    //- **Vertical Layout**: The panel is laid out vertically using `BoxLayout.Y_AXIS`.
    //- **Struts and Glue**: `Box.createVerticalStrut(10)` adds a fixed 10-pixel space between the buttons, and `Box.createVerticalGlue()` adds flexible space that grows as needed, pushing the last button to the bottom of the panel.
    //- **Alignment**: `BoxLayout` allows precise control over the alignment and spacing of components.
    //
    //#### **Why Use BoxLayout?**
    //
    //- **Customizable Layouts**: `BoxLayout` is ideal when you need more control over the layout of components than what is offered by simpler layout managers like `FlowLayout` or `GridLayout`.
    //
    //- **Flexible Spacing**: The use of struts, rigid areas, and glue allows you to control spacing between components precisely.
    //
    //- **Nested Layouts**: `BoxLayout` is excellent for creating complex, nested layouts, combining both horizontal and vertical arrangements within the same container.
    //
    //In summary, `BoxLayout` is a versatile and powerful layout manager that offers fine control over component placement and spacing. It's particularly useful for creating complex, nested layouts where precise control over alignment and spacing is required.
}
