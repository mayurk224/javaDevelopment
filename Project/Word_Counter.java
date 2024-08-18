package Project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Word_Counter {

    public static void main(String[] args) {

        // Create the frame
        JFrame f = new JFrame("Word Counter");
        f.setBounds(100, 100, 500, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the text area
        JTextArea ta = new JTextArea();
        ta.setBounds(50, 50, 400, 300);
        f.add(ta);

        // Create the button
        JButton b = new JButton("Count");
        b.setBounds(200, 370, 100, 30);
        f.add(b);

        // Add action listener to the button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = ta.getText().trim();
                if (!text.isEmpty()) {
                    String[] words = text.split("\\s+");
                    JOptionPane.showMessageDialog(f, "Total word count: " + words.length);
                } else {
                    JOptionPane.showMessageDialog(f, "Text area is empty. Please enter some text.");
                }
            }
        });

        // Make the frame visible
        f.setVisible(true);
    }
}
