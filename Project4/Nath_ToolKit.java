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

public class Nath_ToolKit {
//loginFrame objects
JFrame loginFrame;
JDialog accountCreator;
JLabel welcomeForLoginFrame;
JLabel username;
JTextField usernameEnter;
JLabel password;
JTextField passwordEnter;
JLabel wrongDetails;
JButton loginButton;
JButton createAccountButton;
List<String> listCredential;


//accountCreator Objects
JLabel nameLabel;
JLabel name;
JLabel welcomeForAccountCreator;
JLabel newUsernameLabel;
JLabel newPasswordLabel;
JLabel confirmPasswordLabel;
JLabel newUsername;
JLabel newPassword;
JLabel confirmPassword;
JLabel requiredQuestionLabel1;
JLabel requiredQuestionLabel2;
JLabel requiredQuestionLabel3;

    public static void main(String[] args){
        new Nath_ToolKit();
    }
    public Nath_ToolKit(){
        int r = 120;
        int g = 199;
        int b = 245;
        //loginFrame components
        //loginFrame settings and positioning
        loginFrame = new JFrame("Login to Access Toolkit");
        loginFrame.setSize(300,275);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setResizable(false);
        loginFrame.setLayout(null);
        loginFrame.getContentPane().setBackground(new Color(r,g,b));
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //accountCreator settings and positioning
        accountCreator = new JDialog(loginFrame,"Create a Toolkit Account");
        accountCreator.setSize(700,600);
        accountCreator.setResizable(false);
        accountCreator.setLocationRelativeTo(null);
        accountCreator.setLayout(null);
        accountCreator.getContentPane().setBackground(new Color(r,g,b));
        //welcomeForLoginFrame settings and positioning
        welcomeForLoginFrame = new JLabel("Welcome to Nath Toolkit");
        welcomeForLoginFrame.setBounds(10,10,290,30);
        welcomeForLoginFrame.setHorizontalAlignment(JLabel.CENTER);
        loginFrame.add(welcomeForLoginFrame);
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
                    listCredential = Files.readAllLines(Paths.get("project4Data.txt"));
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
                for (int i = 0; i<listCredential.size();i++){
                    String userDetails = listCredential.get(i);
                    String[] credentials = userDetails.split(",");
                    if (credentials[1].equals(usernameDetect)){
                        usernameVerified = true;
                        if (credentials[2].equals(passwordDetect)){
                            passwordVerified = true;
                            break;
                        }
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
        //createAccountButton settings and positioning
        createAccountButton = new JButton("Create an Account");
        createAccountButton.setBounds(135, 200,125,20);
        createAccountButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                loginFrame.setVisible(false);
                accountCreator.setVisible(true);
            }
        });
        loginFrame.add(createAccountButton);
        loginFrame.setVisible(true);




       //accountCreator components 
       //welcomeForAccountCreator settings and positioning
       welcomeForAccountCreator = new JLabel();
       Font font = new Font("Arial",Font.PLAIN,20);
       welcomeForAccountCreator.setFont(font);
       welcomeForAccountCreator.setText("Fill in the Following Blanks in order to Create an account with us");
       welcomeForAccountCreator.setBounds(20,10,660,60);
       welcomeForAccountCreator.setHorizontalAlignment(JLabel.CENTER);
       accountCreator.add(welcomeForAccountCreator);
       //newUsernameLabel settings and positioning
       nameLabel = new JLabel("Enter Your Full Name");
       nameLabel.setBounds(40,130,200,20);
       accountCreator.add(nameLabel);
       //newUsernameLabel settings and positioning
       newUsernameLabel = new JLabel("Enter a new Username");
       newUsernameLabel.setBounds(40,170,200,20);
       accountCreator.add(newUsernameLabel);
       //newPasswordLabel settings and positioning
       newPasswordLabel = new JLabel("Enter a new Password");
       newPasswordLabel.setBounds(40,210,200,20);
       accountCreator.add(newPasswordLabel);
       
    }

}
