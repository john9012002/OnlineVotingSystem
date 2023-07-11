import javax.swing.*;
import java.awt.event.*;

public class OnlineVotingSystem extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, registerButton;
    // Additional components for managing candidates, voting, etc.
    
    public OnlineVotingSystem() {
        setTitle("Online Voting System");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 50, 80, 25);
        panel.add(usernameLabel);
        
        usernameField = new JTextField(20);
        usernameField.setBounds(140, 50, 200, 25);
        panel.add(usernameField);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 80, 25);
        panel.add(passwordLabel);
        
        passwordField = new JPasswordField(20);
        passwordField.setBounds(140, 100, 200, 25);
        panel.add(passwordField);
        
        loginButton = new JButton("Login");
        loginButton.setBounds(200, 150, 80, 30);
        panel.add(loginButton);
        
        registerButton = new JButton("Register");
        registerButton.setBounds(100, 150, 80, 30);
        panel.add(registerButton);
        
        // Add action listeners for login and register buttons
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                
                // Perform login authentication logic here
                // You can check against a database or hardcoded values
                
                // Dummy logic to display a message
                JOptionPane.showMessageDialog(null, "Logged in as: " + username);
            }
        });
        
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Logic for user registration goes here
                JOptionPane.showMessageDialog(null, "Register button clicked");
            }
        });
        
        setContentPane(panel);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new OnlineVotingSystem();
    }
}

