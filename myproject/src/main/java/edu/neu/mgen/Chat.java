package edu.neu.mgen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

// Simplified user model
class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

// Main class with GUI
public class Chat extends JFrame implements ActionListener {
    private final Map<String, User> users = new HashMap<>();
    private JTextArea chatArea;
    private JTextField messageField, usernameField, passwordField;
    private JButton sendButton, loginButton, signUpButton;
    private User currentUser = null;

    public Chat() {
        // Frame initialization
        super("Chat Application");
        setSize(400, 600);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Chat area
        chatArea = new JTextArea(20, 30);
        chatArea.setEditable(false);
        add(new JScrollPane(chatArea));

        // Message field
        messageField = new JTextField(20);
        messageField.addActionListener(this);
        add(messageField);

        // Send button
        sendButton = new JButton("Send");
        sendButton.addActionListener(this);
        add(sendButton);

        // Username field
        usernameField = new JTextField(20);
        add(usernameField);

        // Password field
        passwordField = new JTextField(20);
        add(passwordField);

        // Login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        // Sign up button
        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(this);
        add(signUpButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sendButton || e.getSource() == messageField) {
            if (currentUser != null) {
                chatArea.append(currentUser.username + ": " + messageField.getText() + "\n");
                messageField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Login first.");
            }
        } else if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = passwordField.getText();
            if (users.containsKey(username) && users.get(username).password.equals(password)) {
                currentUser = users.get(username);
                JOptionPane.showMessageDialog(this, "Login successful.");
            } else {
                JOptionPane.showMessageDialog(this, "Login failed.");
            }
        } else if (e.getSource() == signUpButton) {
            String username = usernameField.getText();
            String password = passwordField.getText();
            if (!users.containsKey(username)) {
                users.put(username, new User(username, password));
                JOptionPane.showMessageDialog(this, "Sign up successful. Please login.");
            } else {
                JOptionPane.showMessageDialog(this, "User already exists.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Chat frame = new Chat();
            frame.setVisible(true);
        });
    }
}