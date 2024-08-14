package Graphical_User_Interface;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSlider_ {

    // ### **JSlider Overview**
    //
    //`JSlider` is a Swing component in Java that lets users select a value by moving an indicator along a track. It is commonly used for input where the user needs to choose a value from a continuous or discrete range, such as adjusting volume, brightness, or selecting a date.
    //
    //### **Features of JSlider**
    //
    //1. **Orientation:**
    //   - `JSlider` can be displayed horizontally or vertically, depending on the layout and application requirements.
    //
    //2. **Range:**
    //   - You can define the minimum, maximum, and initial values of the slider. This allows the user to select a value within a specific range.
    //
    //3. **Tick Marks:**
    //   - You can display major and minor tick marks along the slider to provide visual cues for possible values. Tick marks can be labeled with corresponding values for better usability.
    //
    //4. **Snap to Ticks:**
    //   - The slider can be configured to snap to the nearest tick mark, making it easier for users to select predefined values.
    //
    //5. **Change Listener:**
    //   - `JSlider` supports change listeners that notify when the slider's value changes, allowing for real-time feedback in the application.
    //
    //6. **Custom Labels:**
    //   - You can add custom labels at specific points along the slider, making it easier for users to understand what each value represents.
    //
    //7. **Tool Tips:**
    //   - The slider can display a tooltip that shows the current value when the user hovers over the slider thumb.
    //

    // ### **JSlider Methods**
    //
    //Here are some key methods of the `JSlider` class:
    //
    //1. **Constructor Methods:**
    //   - **`JSlider()`**: Creates a horizontal slider with a range of 0 to 100 and an initial value of 50.
    //   - **`JSlider(int orientation)`**: Creates a slider with the specified orientation (`JSlider.HORIZONTAL` or `JSlider.VERTICAL`).
    //   - **`JSlider(int min, int max)`**: Creates a horizontal slider with the specified minimum and maximum values.
    //   - **`JSlider(int min, int max, int value)`**: Creates a horizontal slider with the specified minimum, maximum, and initial values.
    //   - **`JSlider(int orientation, int min, int max, int value)`**: Creates a slider with the specified orientation, minimum, maximum, and initial values.
    //
    //2. **Value and Range Methods:**
    //   - **`int getValue()`**: Returns the current value of the slider.
    //   - **`void setValue(int n)`**: Sets the slider's value to the specified number.
    //   - **`int getMinimum()`**: Returns the minimum value of the slider.
    //   - **`void setMinimum(int min)`**: Sets the minimum value of the slider.
    //   - **`int getMaximum()`**: Returns the maximum value of the slider.
    //   - **`void setMaximum(int max)`**: Sets the maximum value of the slider.
    //
    //3. **Tick and Label Methods:**
    //   - **`boolean getPaintTicks()`**: Returns `true` if tick marks are being painted.
    //   - **`void setPaintTicks(boolean b)`**: Sets whether tick marks should be painted.
    //   - **`boolean getPaintLabels()`**: Returns `true` if labels are being painted.
    //   - **`void setPaintLabels(boolean b)`**: Sets whether labels should be painted.
    //   - **`int getMajorTickSpacing()`**: Returns the major tick spacing.
    //   - **`void setMajorTickSpacing(int n)`**: Sets the major tick spacing.
    //   - **`int getMinorTickSpacing()`**: Returns the minor tick spacing.
    //   - **`void setMinorTickSpacing(int n)`**: Sets the minor tick spacing.
    //   - **`void setLabelTable(Dictionary<?,?> labels)`**: Sets custom labels for the slider.
    //
    //4. **Orientation and Layout Methods:**
    //   - **`int getOrientation()`**: Returns the orientation of the slider (horizontal or vertical).
    //   - **`void setOrientation(int orientation)`**: Sets the orientation of the slider.
    //   - **`boolean getSnapToTicks()`**: Returns `true` if the slider snaps to the nearest tick mark.
    //   - **`void setSnapToTicks(boolean b)`**: Sets whether the slider should snap to the nearest tick mark.
    //
    //5. **Change Listener Methods:**
    //   - **`void addChangeListener(ChangeListener l)`**: Adds a `ChangeListener` to the slider, which is notified when the slider's value changes.
    //   - **`void removeChangeListener(ChangeListener l)`**: Removes a `ChangeListener` from the slider.
    //
    //6. **ToolTip Methods:**
    //   - **`void setToolTipText(String text)`**: Sets the tooltip text for the slider.
    //   - **`String getToolTipText()`**: Returns the tooltip text for the slider.
    //
    //These methods provide a comprehensive way to customize and interact with a `JSlider`, making it a versatile component for user input in Java Swing applications.

    //### **Example Code**

//        public static void main(String[] args) {
//            // Create a new JFrame
//            JFrame frame = new JFrame("JSlider Example");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(400, 300);
//            frame.setLayout(new FlowLayout());
//
//            // Create a JSlider with a range of 0 to 100 and initial value of 50
//            JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
//
//            // Set major and minor ticks
//            slider.setMajorTickSpacing(20);
//            slider.setMinorTickSpacing(5);
//
//            // Enable tick marks and labels
//            slider.setPaintTicks(true);
//            slider.setPaintLabels(true);
//
//            // Add a change listener to respond to value changes
//            slider.addChangeListener(new ChangeListener() {
//                @Override
//                public void stateChanged(ChangeEvent e) {
//                    System.out.println("Slider Value: " + slider.getValue());
//                }
//            });
//
//            // Add the slider to the frame
//            frame.add(slider);
//
//            // Make the frame visible
//            frame.setVisible(true);
//        }

    //### **Why Use JSlider?**
    //
    //1. **Intuitive User Input:**
    //   - `JSlider` provides an easy-to-understand and interactive way for users to select a value from a range. The visual representation of the range and the ability to adjust the value by sliding makes it intuitive.
    //
    //2. **Continuous or Discrete Values:**
    //   - Whether the application needs a continuous range of values (like adjusting brightness) or discrete values (like setting the volume in steps), `JSlider` can handle both scenarios effectively.
    //
    //3. **Real-Time Feedback:**
    //   - With change listeners, `JSlider` can provide real-time feedback as the user adjusts the slider, making it ideal for applications where immediate response to user input is required.
    //
    //4. **Customization:**
    //   - The ability to customize the orientation, range, tick marks, labels, and snapping behavior makes `JSlider` versatile for a variety of use cases.
    //
    //5. **Visual Clarity:**
    //   - The use of tick marks, labels, and tooltips makes it easy for users to understand the possible values and the current selection, improving the overall user experience.
    //
    //### **When to Use JSlider?**
    //
    //- **Adjustable Settings:**
    //   - Use `JSlider` for settings that require adjustable input, such as volume control, brightness adjustment, or setting a specific time or date.
    //
    //- **Range Selection:**
    //   - When you need the user to select a value within a defined range, such as choosing a percentage, a speed level, or any numeric setting.
    //
    //- **Real-Time Control:**
    //   - For applications where changes need to be reflected immediately as the user interacts with the control, such as in audio or video editing software.
    //
    //### **Conclusion**
    //
    //`JSlider` is a powerful and flexible component in the Swing toolkit, offering an intuitive interface for users to select values within a range. Its customization options and ability to provide real-time feedback make it an essential tool for building user-friendly applications in Java.


    public static void main(String[] args) {
        JFrame f = new JFrame("JSlider");
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setBounds(0,0,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider js = new JSlider(JSlider.HORIZONTAL,0,100,0);
        js.setMajorTickSpacing(20);
        js.setMinorTickSpacing(5);
        js.setPaintTicks(true);
        js.setPaintLabels(true);
        js.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println(js.getValue());
            }
        });

        f.add(js);
    }
}
