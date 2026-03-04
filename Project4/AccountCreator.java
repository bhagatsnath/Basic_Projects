/**
 * Author: Bhagat Sabari Nath
 * Date: Mar 3, 2026
 * Project 4
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AccountCreator {
    JFrame accountFrame;

    public static void initialize(int r, int g, int b){
        new AccountCreator(r,g,b);
    }
    public AccountCreator(int r, int g, int b){
        accountFrame = new JFrame("Create a Toolkit Account");
        accountFrame.setSize(700,600);
        accountFrame.setResizable(false);
        accountFrame.setLocationRelativeTo(null);
        accountFrame.setLayout(null);
        accountFrame.getContentPane().setBackground(new Color(r,g,b));
        accountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
