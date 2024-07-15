/*
Parking Permit App
Authors: Edwin Chen, Minseong Baek, Connor Morrissey, Ideen Nasseri-Moghaddam, Justin Liang
Date: January 11, 2024
Class: ICS4UI
Description of Code: this code works as an app with 2 components:
1. Allow members of the school to apply for a school parking permit
2. Allow school staff to check whether a parked car has a valid parking permit and license plate inside the school database
*/

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.text.*;

public class ParkingPermitApp {
    // function to display the app (main menu)
    public static void displayApp() {
        JFrame frame = new JFrame("iPark Pro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // title label
        JLabel titleLabel = new JLabel("iPark Pro");
        titleLabel.setBounds(0, 80, 800, 50);
        titleLabel.setHorizontalAlignment(JTextField.CENTER);
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 27));
        titleLabel.setForeground(new Color(127, 0, 156));

      // button to apply for a parking permit
      JButton registerButton = new JButton("Register for Parking Permit");
      registerButton.setBounds(130, 200, 250, 50);
      registerButton.setHorizontalAlignment(JTextField.CENTER);
      registerButton.setBackground(new Color(25, 196, 2));

      // button to check whether a car has a valid parking permit and license plate
      JButton detectButton = new JButton("Detect Valid Parker");
      detectButton.setBounds(420, 200, 250, 50);
      detectButton.setHorizontalAlignment(JTextField.CENTER);
      detectButton.setBackground(new Color(196, 119, 2));

        // ActionListeners for register and detect button (implements other programming files)
        registerButton.addActionListener(e -> PPR.main(new String[0]));
        detectButton.addActionListener(e -> CarDetector.main(new String[0]));

        // add all labels and buttons
        frame.add(titleLabel);
        frame.add(registerButton);
        frame.add(detectButton);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            displayApp();
        });
    }
}