package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP_Finder {

    // IP Finder Program

    public static void main(String[] args) {

        // Set up the JFrame
        JFrame f = new JFrame("IP Finder");
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        f.setSize(400, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add components
        JLabel l = new JLabel("Enter URL: ");
        JTextField tf = new JTextField(20);
        JButton b = new JButton("Find IP");

        // Set tooltip for better UX
        tf.setToolTipText("Enter the URL here");

        // Action listener for the button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = tf.getText();
                if (url.isEmpty()) {
                    JOptionPane.showMessageDialog(f, "Please enter a URL.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        InetAddress ia = InetAddress.getByName(url);
                        JOptionPane.showMessageDialog(f, "IP Address: " + ia.getHostAddress());
                    } catch (UnknownHostException ex) {
                        JOptionPane.showMessageDialog(f, "Invalid URL or host not found.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        // Add components to the frame
        f.add(l);
        f.add(tf);
        f.add(b);

        // Finalize and show the frame
        f.setLocationRelativeTo(null); // Center the window
        f.setVisible(true);
    }


    // Let's break down the improved IP Finder code step by step:
    //
    //### 1. **Imports**:
    //```java
    //import javax.swing.*;
    //import java.awt.*;
    //import java.awt.event.ActionEvent;
    //import java.awt.event.ActionListener;
    //import java.net.InetAddress;
    //import java.net.UnknownHostException;
    //```
    //- **Swing Components** (`JFrame`, `JLabel`, `JTextField`, `JButton`, `JOptionPane`): These are used to create the GUI components.
    //- **AWT Layout Managers** (`FlowLayout`): It helps to arrange components within the container (in this case, `JFrame`).
    //- **Event Handling** (`ActionEvent`, `ActionListener`): These handle user actions like button clicks.
    //- **Networking** (`InetAddress`, `UnknownHostException`): Used to resolve the IP address from a hostname (URL).
    //
    //### 2. **Setting Up the JFrame**:
    //```java
    //JFrame f = new JFrame("IP Finder");
    //f.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
    //f.setSize(400, 150);
    //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //```
    //- **`JFrame f`**: A window where all other components are added.
    //- **`setLayout(new FlowLayout(...))`**: Sets the layout manager to `FlowLayout`, which arranges components in a row, centering them and adding some horizontal and vertical padding (`20, 20`).
    //- **`setSize(400, 150)`**: Sets the initial size of the window to 400 pixels wide and 150 pixels tall.
    //- **`setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)`**: Ensures that the application exits when the window is closed.
    //
    //### 3. **Creating and Adding Components**:
    //```java
    //JLabel l = new JLabel("Enter URL: ");
    //JTextField tf = new JTextField(20);
    //JButton b = new JButton("Find IP");
    //
    //tf.setToolTipText("Enter the URL here");
    //```
    //- **`JLabel l`**: Displays a text label ("Enter URL: ") next to the input field.
    //- **`JTextField tf`**: A text input field where the user can enter the URL. The `20` indicates the number of columns (roughly the width).
    //- **`JButton b`**: A button labeled "Find IP" that the user clicks to trigger the IP lookup.
    //- **`setToolTipText`**: Sets a tooltip for the text field, which appears when the user hovers over it, giving them extra guidance.
    //
    //### 4. **Adding Action Listener to the Button**:
    //```java
    //b.addActionListener(new ActionListener() {
    //    @Override
    //    public void actionPerformed(ActionEvent e) {
    //        String url = tf.getText();
    //        if (url.isEmpty()) {
    //            JOptionPane.showMessageDialog(f, "Please enter a URL.", "Error", JOptionPane.ERROR_MESSAGE);
    //        } else {
    //            try {
    //                InetAddress ia = InetAddress.getByName(url);
    //                JOptionPane.showMessageDialog(f, "IP Address: " + ia.getHostAddress());
    //            } catch (UnknownHostException ex) {
    //                JOptionPane.showMessageDialog(f, "Invalid URL or host not found.", "Error", JOptionPane.ERROR_MESSAGE);
    //            }
    //        }
    //    }
    //});
    //```
    //- **`addActionListener`**: Adds an event listener to the button so that when it's clicked, the `actionPerformed` method is executed.
    //- **`tf.getText()`**: Retrieves the text entered by the user in the text field.
    //- **`JOptionPane.showMessageDialog`**: Displays a dialog box with a message. It’s used here for both success (showing the IP address) and error handling.
    //- **`InetAddress.getByName(url)`**: Converts the entered URL into an `InetAddress` object, which holds the IP address. If the URL is invalid, an `UnknownHostException` is thrown.
    //
    //### 5. **Adding Components to the Frame**:
    //```java
    //f.add(l);
    //f.add(tf);
    //f.add(b);
    //```
    //- **`f.add(...)`**: Adds the label, text field, and button to the `JFrame` in the order you want them to appear.
    //
    //### 6. **Finalizing and Displaying the Frame**:
    //```java
    //f.setLocationRelativeTo(null);
    //f.setVisible(true);
    //```
    //- **`setLocationRelativeTo(null)`**: Centers the window on the screen.
    //- **`setVisible(true)`**: Makes the window visible to the user. If this is not called, the window won't appear.
    //
    //### **Explanation of Key Improvements**:
    //- **Layout Management**: Using `FlowLayout` simplifies the UI by automatically handling component positioning, so you don’t need to set explicit bounds for each component.
    //- **Error Handling**: Instead of throwing an exception when an invalid URL is entered, the code now shows an error message to the user. This makes the application more user-friendly and prevents it from crashing unexpectedly.
    //- **Tooltips**: Help guide the user on how to interact with the application.
    //- **UI Centering**: By centering the window, it’s more convenient for the user as it appears in the middle of the screen.
    //
    //This setup creates a simple, user-friendly interface for finding the IP address of a given URL, with better usability and error handling.

}
