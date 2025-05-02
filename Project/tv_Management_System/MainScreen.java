package Project.tv_Management_System;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class MainScreen extends JFrame {

    JPanel subscriberPanel;
    JTextField subscriberName;
    JTextField subscriberLastName;
    JTextField subscriberPhone;
    JTextField subscriberCity;

    JLabel lblName;
    JLabel lblLastName;
    JLabel lblPhone;
    JLabel lblCity;

    public MainScreen() {
        setTitle("TV Management System");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // === Subscriber Panel with GridBagLayout ===
        subscriberPanel = new JPanel(new GridBagLayout());
        subscriberPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY), "Subscriber Info", TitledBorder.LEFT, TitledBorder.TOP));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;

        lblName = new JLabel("Name:");
        lblLastName = new JLabel("Last Name:");
        lblPhone = new JLabel("Phone:");
        lblCity = new JLabel("City:");

        subscriberName = new JTextField(15);
        subscriberLastName = new JTextField(15);
        subscriberPhone = new JTextField(15);
        subscriberCity = new JTextField(15);

        // Add components to subscriber panel
        gbc.gridx = 0; gbc.gridy = 0; subscriberPanel.add(lblName, gbc);
        gbc.gridx = 1; subscriberPanel.add(subscriberName, gbc);

        gbc.gridx = 0; gbc.gridy = 1; subscriberPanel.add(lblLastName, gbc);
        gbc.gridx = 1; subscriberPanel.add(subscriberLastName, gbc);

        gbc.gridx = 0; gbc.gridy = 2; subscriberPanel.add(lblPhone, gbc);
        gbc.gridx = 1; subscriberPanel.add(subscriberPhone, gbc);

        gbc.gridx = 0; gbc.gridy = 3; subscriberPanel.add(lblCity, gbc);
        gbc.gridx = 1; subscriberPanel.add(subscriberCity, gbc);

        // === Wrapper Panel to align a top-left ===
        JPanel wrapperPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        wrapperPanel.add(subscriberPanel);

        // Add wrapper to JFrame (top)
        add(wrapperPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the MainScreen class
        MainScreen mainScreen = new MainScreen();
    }
}
