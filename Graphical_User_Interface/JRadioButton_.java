package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButton_ {

    // RadioButton class is used to create a radio button, it is used ot choose one option from multiple options it should be added in ButtonGroup to select one radio button only , it is widely used in exam system or quiz

    // ### **JRadioButton in Java Swing**
    //
    //#### **Overview**
    //`JRadioButton` is a part of the Java Swing library and is used to create a radio button, a component that allows the user to make a single selection from a group of options. Radio buttons are often used in groups, where only one button in the group can be selected at a time. When a user selects a radio button, any previously selected button in the same group is automatically deselected.
    //
    //#### **Features**
    //- **Single Selection**: Within a group of radio buttons, only one button can be selected at a time.
    //- **Label Text**: Each radio button can have a label that describes the option it represents.
    //- **State Management**: Radio buttons have two states—selected and unselected.
    //- **Button Groups**: `ButtonGroup` can be used to group multiple `JRadioButton` instances together so that only one can be selected at a time.
    //- **Event Handling**: `JRadioButton` supports event handling via action listeners to respond when the user selects or deselects the button.
    //
    //#### **Common Methods**
    //Here are some key methods provided by the `JRadioButton` class:
    //
    //1. **Constructor Methods:**
    //   - **`JRadioButton()`**: Creates an unselected radio button without a label.
    //   - **`JRadioButton(String text)`**: Creates an unselected radio button with the specified text label.
    //   - **`JRadioButton(String text, boolean selected)`**: Creates a radio button with the specified text and initial selection state.
    //   - **`JRadioButton(Icon icon)`**: Creates an unselected radio button with an icon.
    //   - **`JRadioButton(Icon icon, boolean selected)`**: Creates a radio button with an icon and an initial selection state.
    //
    //2. **Selection and State Methods:**
    //   - **`boolean isSelected()`**: Returns `true` if the radio button is selected.
    //   - **`void setSelected(boolean selected)`**: Sets the selected state of the radio button.
    //   - **`void doClick()`**: Simulates a click on the radio button.
    //   - **`void doClick(int pressTime)`**: Simulates a click on the radio button, with the specified amount of time the button remains pressed.
    //
    //3. **Text and Icon Methods:**
    //   - **`String getText()`**: Returns the text label of the radio button.
    //   - **`void setText(String text)`**: Sets the text label of the radio button.
    //   - **`Icon getIcon()`**: Returns the icon of the radio button.
    //   - **`void setIcon(Icon icon)`**: Sets the icon of the radio button.
    //
    //4. **Mnemonic and ToolTip Methods:**
    //   - **`void setMnemonic(int mnemonic)`**: Sets a keyboard mnemonic for the radio button, allowing it to be selected via keyboard.
    //   - **`void setToolTipText(String text)`**: Sets a tooltip that appears when the user hovers over the radio button.
    //
    //5. **Event Handling Methods:**
    //   - **`void addActionListener(ActionListener l)`**: Adds an action listener to the radio button to handle selection events.
    //   - **`void removeActionListener(ActionListener l)`**: Removes an action listener from the radio button.
    //
    //#### **Example Code**

        public static void main(String[] args) {
            JFrame frame = new JFrame("JRadioButton Example");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            JRadioButton rb1 = new JRadioButton("Option 1");
            rb1.setBounds(100, 50, 150, 30);

            JRadioButton rb2 = new JRadioButton("Option 2");
            rb2.setBounds(100, 100, 150, 30);

            JRadioButton rb3 = new JRadioButton("Option 3");
            rb3.setBounds(100, 150, 150, 30);

            ButtonGroup group = new ButtonGroup();
            group.add(rb1);
            group.add(rb2);
            group.add(rb3);

            JButton submit = new JButton("Submit");
            submit.setBounds(100, 200, 150, 30);
            submit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (rb1.isSelected()) {
                        System.out.println("Option 1 selected");
                    } else if (rb2.isSelected()) {
                        System.out.println("Option 2 selected");
                    } else if (rb3.isSelected()) {
                        System.out.println("Option 3 selected");
                    }
                }
            });

            frame.add(rb1);
            frame.add(rb2);
            frame.add(rb3);
            frame.add(submit);
            frame.setVisible(true);
        }
    
    //#### **Why Use JRadioButton?**
    //- **Exclusive Selection**: When you need a user to select only one option from a predefined set, `JRadioButton` is ideal.
    //- **User Interface Clarity**: Radio buttons are intuitive for users, making it clear that only one option can be chosen.
    //- **Event Handling**: Easy to manage events when the state of a radio button changes.
    //- **Grouping**: `ButtonGroup` allows logical grouping of options, ensuring that only one option can be active at any given time.
}
