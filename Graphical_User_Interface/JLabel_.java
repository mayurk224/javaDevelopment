package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLabel_ {

    // **JLabel** is a class in Java Swing used to display a short string or an image icon. It can display text, an image, or both, but it is not interactive and cannot receive focus². Here are some key points about `JLabel`:

    //- **Constructors**:
    //  - `JLabel()`: Creates a blank label with no text or image.
    //  - `JLabel(String text)`: Creates a label with the specified text.
    //  - `JLabel(Icon image)`: Creates a label with the specified image.
    //  - `JLabel(String text, Icon image, int horizontalAlignment)`: Creates a label with the specified text, image, and horizontal alignment².

    //- **Common Methods**:
    //  - `getText()`: Returns the text displayed by the label.
    //  - `setText(String text)`: Sets the text to be displayed by the label.
    //  - `getIcon()`: Returns the image displayed by the label.
    //  - `setIcon(Icon image)`: Sets the image to be displayed by the label².

    //Here's a simple example to create a `JLabel` and add it to a `JFrame`:

    //    public static void main(String[] args) {
    //        JFrame frame = new JFrame("JLabel Example");
    //        JLabel label = new JLabel("Hello, JLabel!");
    //
    //        frame.add(label);
    //        frame.setSize(300, 200);
    //        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //        frame.setVisible(true);
    //    }

    //                  ------*****------

    // Lecture Part:

    public static void main(String[] args) {
        JFrame f = new JFrame("JLabel");
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout());
        f.setBounds(0,0,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l = new JLabel("Hello");

        JButton b = new JButton("Change");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("Mayur");
            }
        });

        f.add(l);
        f.add(b);
    }
}
