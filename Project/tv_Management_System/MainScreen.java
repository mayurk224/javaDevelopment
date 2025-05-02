package Project.tv_Management_System;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

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


    JTextField startCycleFLD;
    JTextField endCycleFLD;
    JTextField numberTVFLD;
    JLabel lblToday;
    JPanel cyclePanel;
    SimpleDateFormat df;
    Date currentDate;


    JCheckBox chbkSports;
    JCheckBox chbkMovies;
    JCheckBox chbkNews;
    JCheckBox chbkKids;
    JCheckBox chbkDocumentaries;
    JPanel packagePanel;

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


        // === Cycle Panel ===
        cyclePanel = new JPanel(new GridBagLayout());
        cyclePanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                "Cycle Info", TitledBorder.LEFT, TitledBorder.TOP
        ));

        GridBagConstraints gbcCycle = new GridBagConstraints();
        gbcCycle.insets = new Insets(8, 8, 8, 8);
        gbcCycle.anchor = GridBagConstraints.WEST;

// Row 0 — Today
        gbcCycle.gridx = 0;
        gbcCycle.gridy = 0;
        cyclePanel.add(new JLabel("Today:"), gbcCycle);

        df = new SimpleDateFormat("dd/MM/yyyy");
        currentDate = new Date();
        lblToday = new JLabel(df.format(currentDate));

        gbcCycle.gridx = 1;
        cyclePanel.add(lblToday, gbcCycle);

// Row 1 — Start Cycle
        gbcCycle.gridx = 0;
        gbcCycle.gridy = 1;
        cyclePanel.add(new JLabel("Start Cycle:"), gbcCycle);

        startCycleFLD = new JTextField(15);
        gbcCycle.gridx = 1;
        cyclePanel.add(startCycleFLD, gbcCycle);

// Row 2 — End Cycle
        gbcCycle.gridx = 0;
        gbcCycle.gridy = 2;
        cyclePanel.add(new JLabel("End Cycle:"), gbcCycle);

        endCycleFLD = new JTextField(15);
        gbcCycle.gridx = 1;
        cyclePanel.add(endCycleFLD, gbcCycle);

// Row 3 — Number of TVs
        gbcCycle.gridx = 0;
        gbcCycle.gridy = 3;
        cyclePanel.add(new JLabel("Number of TVs:"), gbcCycle);

        numberTVFLD = new JTextField(15);
        gbcCycle.gridx = 1;
        cyclePanel.add(numberTVFLD, gbcCycle);

// Add cycle panel to wrapper
        wrapperPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        wrapperPanel.add(cyclePanel);

// Add wrapper to JFrame (CENTER area or as needed)
        add(wrapperPanel, BorderLayout.CENTER);



        // === Package Panel ===
        packagePanel = new JPanel(new GridBagLayout());
        packagePanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                "Package Info", TitledBorder.LEFT, TitledBorder.TOP
        ));

        GridBagConstraints gbcPackage = new GridBagConstraints();
        gbcPackage.insets = new Insets(5, 10, 5, 10);
        gbcPackage.anchor = GridBagConstraints.WEST;
        gbcPackage.gridx = 0;
        gbcPackage.gridy = 0;

// Checkboxes
        chbkSports = new JCheckBox("Sports");
        chbkMovies = new JCheckBox("Movies");
        chbkNews = new JCheckBox("News");
        chbkKids = new JCheckBox("Kids");
        chbkDocumentaries = new JCheckBox("Documentaries");

// Add checkboxes
        packagePanel.add(chbkSports, gbcPackage);
        gbcPackage.gridy++;
        packagePanel.add(chbkMovies, gbcPackage);
        gbcPackage.gridy++;
        packagePanel.add(chbkNews, gbcPackage);
        gbcPackage.gridy++;
        packagePanel.add(chbkKids, gbcPackage);
        gbcPackage.gridy++;
        packagePanel.add(chbkDocumentaries, gbcPackage);

// Add Subscribe button
        gbcPackage.gridy++;
        gbcPackage.anchor = GridBagConstraints.CENTER;
        gbcPackage.gridx = 0;
        gbcPackage.gridwidth = 2;

        JButton subscribeButton = new JButton("Subscribe");
        packagePanel.add(subscribeButton, gbcPackage);

// Add package panel to wrapper
        wrapperPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        wrapperPanel.add(packagePanel);

// Add wrapper to JFrame (bottom)
        add(wrapperPanel, BorderLayout.SOUTH);





        setVisible(true);

    }

    public static void main(String[] args) {
        // Create an instance of the MainScreen class
        MainScreen mainScreen = new MainScreen();
    }
}
