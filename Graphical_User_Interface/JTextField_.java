package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextField_ {

    // **JTextField** is a class in Java Swing used for creating a text field that allows the user to enter a single line of text. It is part of the `javax.swing` package and inherits from the `JTextComponent` class¹. Here are some key points about `JTextField`:

    //- **Constructors**:
    //  - `JTextField()`: Creates a new text field with no text.
    //  - `JTextField(String text)`: Creates a new text field initialized with the specified text.
    //  - `JTextField(int columns)`: Creates a new text field with the specified number of columns.
    //  - `JTextField(String text, int columns)`: Creates a new text field with the specified text and number of columns¹.

    //- **Common Methods**:
    //  - `getText()`: Returns the text contained in the text field.
    //  - `setText(String text)`: Sets the text of the text field.
    //  - `addActionListener(ActionListener l)`: Adds an action listener to the text field.
    //  - `setColumns(int columns)`: Sets the number of columns in the text field.
    //  - `setFont(Font f)`: Sets the font of the text displayed in the text field¹.

    //Here's a simple example to create a `JTextField` and add it to a `JFrame`:

    //    public static void main(String[] args) {
    //        JFrame frame = new JFrame("JTextField Example");
    //        JTextField textField = new JTextField(20);
    //        JButton button = new JButton("Submit");
    //        JLabel label = new JLabel("Enter text:");
    //
    //        button.addActionListener(new ActionListener() {
    //            public void actionPerformed(ActionEvent e) {
    //                String text = textField.getText();
    //                JOptionPane.showMessageDialog(frame, "You entered: " + text);
    //            }
    //        });
    //
    //        JPanel panel = new JPanel();
    //        panel.add(label);
    //        panel.add(textField);
    //        panel.add(button);
    //
    //        frame.add(panel);
    //        frame.setSize(300, 200);
    //        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //        frame.setVisible(true);
    //    }


    //          -------******------

    // Lecture Part:

    public static void main(String[] args) {
        JFrame f = new JFrame("JLabel");
        f.setVisible(true);
        f.setBounds(0,0,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField tf = new JTextField(20);
        tf.setVisible(true);
        tf.setBounds(100,100,300,50);

        JLabel l = new JLabel();

        JButton b = new JButton("Consol");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf.getText();
                l.setText(s);
            }
        });

        f.add(tf);
        f.add(b);
        f.add(l);
    }
}
