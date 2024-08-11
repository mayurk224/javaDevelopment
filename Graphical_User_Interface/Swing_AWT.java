package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Swing_AWT {

    // **Swing** and **AWT** (Abstract Window Toolkit) are both Java
    // libraries used for creating graphical user interfaces (GUIs).
    // Here's a breakdown of each:

    //### AWT (Abstract Window Toolkit)
    //- **Platform-Dependent**: AWT components are heavy-weight because
    // they rely on the native GUI components of the operating system.
    //- **Basic Components**: It provides basic GUI components like
    // buttons, text fields, and checkboxes.
    //- **Less Flexible**: AWT has fewer functionalities and is less
    // flexible compared to Swing.
    //- **Performance**: Generally, AWT components are slower because
    // they are dependent on the OS's native components.
    //- **Package**: AWT components are found in the `java.awt` package.

    //### Swing
    //- **Platform-Independent**: Swing components are lightweight and
    // written entirely in Java, making them platform-independent.
    //- **Rich Set of Components**: Swing provides a richer set of GUI
    // components, including tables, trees, sliders, and more.
    //- **More Flexible**: Swing supports a pluggable look and feel,
    // allowing you to change the appearance of your application without
    // changing the code.
    //- **MVC Architecture**: Swing follows the Model-View-Controller
    // (MVC) architecture, which separates the data (model), the UI (view),
    // and the logic (controller).
    //- **Package**: Swing components are found in the `javax.swing` package.

    //### Key Differences
    //1. **Weight**: AWT components are heavy-weight, while Swing components
    // are lightweight.
    //2. **Functionality**: Swing provides more advanced and flexible
    // components compared to AWT.
    //3. **Performance**: Swing generally has better performance due to
    // its lightweight nature.
    //4. **Look and Feel**: Swing supports a pluggable look and feel,
    // whereas AWT does not.
    //5. **Platform Dependency**: AWT is platform-dependent, while Swing
    // is platform-independent.


    //### Example Code
    //Here's a simple example to illustrate the difference:

    //#### AWT Example
    //```java
    //import java.awt.*;
    //import java.awt.event.*;
    //
    //public class AWTExample {
        public static void main(String[] args) {
            Frame frame = new Frame("AWT Example");
            Button button = new Button("Click Me");
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button Clicked");
                }
            });
            frame.add(button);
            frame.setSize(300, 200);
            frame.setLayout(new FlowLayout());
            frame.setVisible(true);
            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    frame.dispose(); // Close the window
                }
            });
        }
    //}


    //#### Swing Example
    //```java
    //import javax.swing.*;
    //import java.awt.event.*;
    //
    //public class SwingExample {
//        public static void main(String[] args) {
//            JFrame frame = new JFrame("Swing Example");
//            JButton button = new JButton("Click Me");
//            button.addActionListener(new ActionListener() {
//                public void actionPerformed(ActionEvent e) {
//                    System.out.println("Button Clicked");
//                }
//            });
//            frame.add(button);
//            frame.setSize(300, 200);
//            frame.setLayout(new FlowLayout());
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setVisible(true);
//        }
    //}


    // In summary, while AWT provides the basic building blocks for GUI
    // applications, Swing offers a more comprehensive and flexible set
    // of tools for creating sophisticated user interfaces.
}
