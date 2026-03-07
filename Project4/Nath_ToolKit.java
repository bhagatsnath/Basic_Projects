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
JPasswordField passwordEnter;
JLabel wrongDetails;
JButton loginButton;
JButton createAccountButton;
List<String> listCredential;


//accountCreator Objects
JLabel welcomeForAccountCreator;
JLabel nameLabel;
JTextField name;
JLabel newUsernameLabel;
JLabel newPasswordLabel;
JLabel confirmPasswordLabel;
JTextField newUsername;
JPasswordField newPassword;
JPasswordField confirmPassword;
JLabel requiredQuestionLabel1;
JLabel requiredQuestionLabel2;
JLabel requiredQuestionLabel3;
JLabel requiredQuestionLabel4;
JLabel accountSucess;
JButton createAccount;

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
        accountCreator.setSize(750,600);
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
        passwordEnter = new JPasswordField();
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
                String passwordDetect = new String(passwordEnter.getPassword());
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
        createAccountButton.setBounds(135, 210,125,20);
        createAccountButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
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
       //confirmPasswordLabel settings and positioning
       confirmPasswordLabel = new JLabel("Confirm Your Password");
       confirmPasswordLabel.setBounds(40,250,200,20);
       accountCreator.add(confirmPasswordLabel);
       //name settings and positioning
       name = new JTextField();
       name.setBounds(290,130,300,20);
       name.setHorizontalAlignment(JTextField.RIGHT);
       accountCreator.add(name);
       //newUsername settings and positioning
       newUsername = new JTextField();
       newUsername.setBounds(290,170,300,20);
       newUsername.setHorizontalAlignment(JTextField.RIGHT);
       accountCreator.add(newUsername);
       //newPassword settings and positioning
       newPassword = new JPasswordField();
       newPassword.setBounds(290,210,300,20);
       newPassword.setHorizontalAlignment(JTextField.RIGHT);
       accountCreator.add(newPassword);
       //confirmPassword settings and positioning
       confirmPassword = new JPasswordField();
       confirmPassword.setBounds(290,250,300,20);
       confirmPassword.setHorizontalAlignment(JTextField.RIGHT);
       accountCreator.add(confirmPassword);

       //errorLabel settings and positioning
       Font font2 = new Font("Arial",Font.PLAIN,10);
       requiredQuestionLabel1 = new JLabel();
       requiredQuestionLabel1.setBounds(600,130,150,20);
       requiredQuestionLabel1.setFont(font2);
       requiredQuestionLabel1.setForeground(Color.RED);
       requiredQuestionLabel2 = new JLabel();
       requiredQuestionLabel2.setBounds(600,170,150,20);
       requiredQuestionLabel2.setFont(font2);
       requiredQuestionLabel2.setForeground(Color.RED);
       requiredQuestionLabel3 = new JLabel();
       requiredQuestionLabel3.setBounds(600,210,150,20);
       requiredQuestionLabel3.setFont(font2);
       requiredQuestionLabel3.setForeground(Color.RED);
       requiredQuestionLabel4 = new JLabel();
       requiredQuestionLabel4.setFont(font2);
       requiredQuestionLabel4.setBounds(600,250,150,20);
       requiredQuestionLabel4.setForeground(Color.RED);
       //accountSucess settings and positioning
       accountSucess = new JLabel("Your Account has been Created! Close the Window to Log Back In");
       accountSucess.setBounds(225,310,350,20);
       accountSucess.setFont(font2);
       accountSucess.setHorizontalAlignment(JLabel.CENTER);
       accountSucess.setForeground(Color.GREEN);
       //createAccount button settings and positioning
       createAccount = new JButton("Create Account");
       createAccount.setBounds(300,350,200,20);
       createAccount.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            requiredQuestionLabel1.setText("Required Question!");
            requiredQuestionLabel2.setText("Required Question!");
            requiredQuestionLabel3.setText("Required Question!");
            requiredQuestionLabel4.setText("Required Question!");
            accountCreator.remove(requiredQuestionLabel1);
            accountCreator.remove(requiredQuestionLabel2);
            accountCreator.remove(requiredQuestionLabel3);
            accountCreator.remove(requiredQuestionLabel4);
            accountCreator.repaint();
            String newName = name.getText();
            String newUser = newUsername.getText();
            String newPass = new String(newPassword.getPassword());
            String confPass = new String(confirmPassword.getPassword());
            if (newName.isBlank()){
                accountCreator.add(requiredQuestionLabel1);
                accountCreator.repaint();
            }
            if (newUser.isBlank()){
                accountCreator.add(requiredQuestionLabel2);
                accountCreator.repaint();
            }
            if (newPass.isBlank()){
                accountCreator.add(requiredQuestionLabel3);
                accountCreator.repaint();
            }
            if (confPass.isBlank()){
                accountCreator.add(requiredQuestionLabel4);
                accountCreator.repaint();
            }
            if (!newName.isBlank()&&!newUser.isBlank()&&!newPass.isBlank()&&!confPass.isBlank()){
                if (newUser.contains(" ")){
                    requiredQuestionLabel2.setText("No Spaces!");
                    accountCreator.add(requiredQuestionLabel2);
                    accountCreator.repaint();
                }
                if (!newPass.equals(confPass)){
                    requiredQuestionLabel4.setText("Passwords Do Not Match!");
                    newPassword.setText("");
                    confirmPassword.setText("");
                    accountCreator.add(requiredQuestionLabel4);
                    accountCreator.repaint();
                }
                if (!newUser.contains(" ")&&newPass.equals(confPass)){
                    String credentialLine = "\n"+newName+","+newUser+","+newPass;
                    try{
                        Files.write(Paths.get("project4Data.txt"), credentialLine.getBytes(), StandardOpenOption.APPEND);
                    }
                    catch(Exception ex){
                        ex.printStackTrace();
                    }
                    accountCreator.add(accountSucess);
                    createAccount.setEnabled(false);
                    accountCreator.repaint();
                }
            }
        }
       });
       accountCreator.add(createAccount);
    }

}
