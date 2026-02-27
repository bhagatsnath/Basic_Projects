/**
 * Author: Bhagat Sabari Nath
 * Date: Feb 13, 2026
 * Project 4
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.nio.file.*;
import java.util.List;

public class Login {
JFrame loginFrame;
JLabel welcome;
JLabel username;
JTextField usernameEnter;
JLabel password;
JTextField passwordEnter;
JLabel wrongDetails;
JButton loginButton;
List<String> listCredential;
    public static void main(String[] args){
        new Login();
    }
    public Login(){
        int r = 120;
        int g = 199;
        int b = 245;
        //loginFrame settings and positioning
        loginFrame = new JFrame("Login to Access Toolkit");
        loginFrame.setSize(300,275);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setResizable(false);
        loginFrame.setLayout(null);
        loginFrame.getContentPane().setBackground(new Color(r,g,b));
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //welcome settings and positioning
        welcome = new JLabel("Welcome to Nath Toolkit");
        welcome.setBounds(10,10,290,30);
        welcome.setHorizontalAlignment(JLabel.CENTER);
        loginFrame.add(welcome);
        //username Settings and positioning
        username = new JLabel("Username: ");
        username.setBounds(35,70,75,20);
        loginFrame.add(username);
        //password settings and positioning
        password = new JLabel("Password: ");
        password.setBounds(35,110,75,20);
        loginFrame.add(password);
        //usernameEnter settings and positioning
        usernameEnter = new JTextField();
        usernameEnter.setBounds(135,70,125,20);
        usernameEnter.setHorizontalAlignment(JTextField.RIGHT);
        loginFrame.add(usernameEnter);
        //passwordEnter settings and positioning
        passwordEnter = new JTextField();
        passwordEnter.setBounds(135,110,125,20);
        passwordEnter.setHorizontalAlignment(JTextField.RIGHT);
        loginFrame.add(passwordEnter);
        //wrongDetails settings and positioning
        wrongDetails = new JLabel("Invalid Credentials! Please Try Again");
        wrongDetails.setForeground(Color.RED);
        wrongDetails.setBounds(10,180,290,20);
        wrongDetails.setHorizontalAlignment(JLabel.CENTER);
        //loginButton settings and positioning
        loginButton = new JButton("Login");
        loginButton.setBounds(135,150,125,20);
        loginButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String usernameDetect = (usernameEnter.getText()).replace(" ", "");
                String passwordDetect = passwordEnter.getText();
                boolean usernameVerified = false;
                boolean passwordVerified = false;
                try{
                    listCredential = Files.readAllLines(Paths.get("data.txt"));
                }
                catch(Exception ex){

                }
                int i;
                for (i =0; i<listCredential.size();i=i+2){
                    if (listCredential.get(i).equals(usernameDetect)){
                        usernameVerified = true;
                        break;
                    }
                }
                for (int a =1; a<listCredential.size();a=a+2){
                    if (listCredential.get(a).equals(passwordDetect)&&a==i+1){
                        passwordVerified = true;
                        break;
                    }
                }
                if (passwordVerified&&usernameVerified){
                    loginFrame.setVisible(false);
                    Interface.initialize();
                }
                else{
                    loginFrame.add(wrongDetails);
                    loginFrame.repaint();
                }
            }
        });
        loginFrame.add(loginButton);
        loginFrame.setVisible(true);
    }
}
