package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;

public class BorderLayout_ {

    //`BorderLayout` is one of the most commonly used layout managers in Java Swing. It arranges components in five regions: `NORTH`, `SOUTH`, `EAST`, `WEST`, and `CENTER`. Each region can hold only one component, and the size of the components in the `NORTH` and `SOUTH` regions will affect the remaining vertical space, while the components in the `EAST` and `WEST` regions will affect the remaining horizontal space.
    //
    //#### **Features of BorderLayout**
    //
    //- **Five Regions**: Components are arranged in five regions:
    //  - `NORTH`: Top of the container.
    //  - `SOUTH`: Bottom of the container.
    //  - `EAST`: Right side of the container.
    //  - `WEST`: Left side of the container.
    //  - `CENTER`: Middle of the container, taking up the remaining space.
    //
    //- **Resizable Components**: The components in the `CENTER` region will expand to fill any remaining space after the `NORTH`, `SOUTH`, `EAST`, and `WEST` regions have been allocated.
    //
    //- **Flexible Layout**: If no component is added to a specific region, that region does not take up space.
    //
    //- **Default Layout for Content Panes**: `BorderLayout` is the default layout manager for the content pane of a `JFrame`.
    //
    //#### **Methods in BorderLayout**
    //
    //1. **`addLayoutComponent(String name, Component comp)`**: Adds the specified component to the layout, associating it with the specified region.
    //2. **`removeLayoutComponent(Component comp)`**: Removes the specified component from the layout.
    //3. **`layoutContainer(Container target)`**: Lays out the specified container using this layout.
    //4. **`getLayoutAlignmentX(Container parent)`**: Returns the alignment along the X axis.
    //5. **`getLayoutAlignmentY(Container parent)`**: Returns the alignment along the Y axis.
    //6. **`invalidateLayout(Container target)`**: Invalidates the layout, indicating that if the container hierarchy needs to be laid out again.
    //
    //#### **Example Code**

        public static void main(String[] args) {
            JFrame frame = new JFrame("BorderLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Set the layout to BorderLayout
            frame.setLayout(new BorderLayout());

            // Add buttons to each region
            JButton northButton = new JButton("NORTH");
            JButton southButton = new JButton("SOUTH");
            JButton eastButton = new JButton("EAST");
            JButton westButton = new JButton("WEST");
            JButton centerButton = new JButton("CENTER");

            frame.add(northButton, BorderLayout.NORTH);
            frame.add(southButton, BorderLayout.SOUTH);
            frame.add(eastButton, BorderLayout.EAST);
            frame.add(westButton, BorderLayout.WEST);
            frame.add(centerButton, BorderLayout.CENTER);

            // Display the frame
            frame.setVisible(true);
        }

    //#### **Explanation**
    //
    //- **NORTH, SOUTH, EAST, WEST, CENTER**: Each region of the `BorderLayout` is occupied by a button labeled with the name of the region.
    //- **CENTER**: The button in the `CENTER` region expands to fill any remaining space, making it larger than the others.
    //
    //#### **Why Use BorderLayout?**
    //
    //- **Simplicity**: `BorderLayout` is straightforward and easy to use, making it ideal for basic GUI layouts.
    //- **Flexible Region Allocation**: It allows developers to easily allocate different parts of the container to different components, ensuring a balanced and organized layout.
    //- **Default Layout**: As the default layout for `JFrame` content panes, it is naturally suited for applications that need to distribute components across the edges and center of a window.
    //
    //In summary, `BorderLayout` is a simple yet powerful layout manager that provides an easy way to arrange components in a container across five defined regions.
}
