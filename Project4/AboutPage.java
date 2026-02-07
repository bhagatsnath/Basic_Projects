/**
 * Author: Bhagat Sabari Nath
 * Date: Jan 26, 2026
 * Project 4
 */
import java.awt.*;
import javax.swing.*;
import java.io.*;
public class AboutPage{
    static JFrame aboutFrame;
    static JTextField logo;
    static JTextField credit1;
    static JTextField credit2;
    static JTextField credit3;
    public static void initialize(int r, int g, int b){
        new AboutPage(r,g,b);
    }
    public AboutPage(int r, int g, int b){
        aboutFrame = new JFrame("About This ToolKit");
        aboutFrame.setSize(300,400);
        aboutFrame.setLocationRelativeTo(null);
        aboutFrame.getContentPane().setBackground(new Color(r, g, b));
        aboutFrame.setResizable(false);
        aboutFrame.setLayout(null);
        aboutFrame.setVisible(true);

        //logo settings and positioning
        logo = new JTextField();
        logo.setBounds(75,10,150,60);
        logo.setEditable(false);
        logo.setFont(new Font("Arial",Font.BOLD,50));
        logo.setHorizontalAlignment(JTextField.CENTER);
        logo.setText("N");
        aboutFrame.add(logo);

        //credit1 settings and positioning 
        credit1 = new JTextField();
        credit1.setBounds(75,100,150,20);
        credit1.setHorizontalAlignment(JTextField.CENTER);
        credit1.setText("Developed By: ");
        aboutFrame.add(credit1);

        //credit2 settings and positioning
        credit2 = new JTextField();
        credit2.setBounds(75,140,150,20);
        credit2.setHorizontalAlignment(JTextField.CENTER);
        credit2.setText("Bhagat Sabari Nath");
        aboutFrame.add(credit2);

        //credit3 settings and positioning
        credit3 = new JTextField();
        credit3.setBounds(75,340,150,20);
        credit3.setHorizontalAlignment(JTextField.CENTER);
        credit3.setText("Version 1.0000.000");
        aboutFrame.add(credit3);
    }
}
