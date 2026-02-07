/**
 * Author: Bhagat Sabari Nath
 * Date: Jan 27, 2026
 * Project 4
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class CurrencyConverter implements ActionListener{
    JDialog CCFrame;
    JTextField moneyFrom;
    JTextField moneyTo;
    JTextField moneyEnter1;
    JTextField moneyEnter2;
    JTextField moneyReturned1;
    JTextField moneyReturned2;
    JButton convert;
    double moneyNum;
    boolean stodSucess = true;
    String cFrom;
    String cTo;

    public static void initialize(JFrame mainFrame,boolean popupAllowed, int r, int g, int b){
        new CurrencyConverter(mainFrame,popupAllowed,r,g,b);
    }
    public CurrencyConverter(JFrame mainFrame,boolean popupAllowed, int r, int g, int b){
        if (popupAllowed){
            JOptionPane.showMessageDialog(CCFrame,"<html><center><b>This Currency Converter contains many possible <br/>conversions, where it features Dropboxes where you can select your desired Currency and then hit Convert to show <br/>the amount in the currency you want to see in<br/><br/><br/><br/><br/>Developed By Bhagat Sabari Nath</b></center></html>","Welcome to Currency Converter",JOptionPane.INFORMATION_MESSAGE);
        }
        CCFrame = new JDialog(mainFrame,"Currency Converter");
        CCFrame.setSize(500,400);
        CCFrame.getContentPane().setBackground(new Color(r,g,b));
        CCFrame.setResizable(false);
        CCFrame.setLayout(null);
        CCFrame.setLocationRelativeTo(null);
        CCFrame.setVisible(true);

        //moneyfrom settings and positioning
        moneyFrom = new JTextField();
        moneyFrom.setBounds(30,30,190,20);
        moneyFrom.setEditable(false);
        moneyFrom.setHorizontalAlignment(JTextField.CENTER);
        moneyFrom.setText("From Currency: ");
        CCFrame.add(moneyFrom);


        //moneyto settings and positioning
        moneyTo = new JTextField();
        moneyTo.setBounds(280,30,190,20);
        moneyTo.setEditable(false);
        moneyTo.setHorizontalAlignment(JTextField.CENTER);
        moneyTo.setText("To Currency: ");
        CCFrame.add(moneyTo);

        //Array that contains the options list
        String[] options = {"USD","CAD","GBP","INR","EUR"};

        //Money From JComboBox settings and positioning
        JComboBox<String> combobox1 = new JComboBox<>(options);
        combobox1.setBounds(30,70,190,20);
        CCFrame.add(combobox1);

        //Money From JComboBox settings and positioning
        JComboBox<String> combobox2 = new JComboBox<>(options);
        combobox2.setBounds(280,70,190,20);
        CCFrame.add(combobox2);

        //money instructions settings and positioning 
        moneyEnter1 = new JTextField();
        moneyEnter1.setBounds(30,150,440,30);
        moneyEnter1.setEditable(false);
        moneyEnter1.setHorizontalAlignment(JTextField.CENTER);
        moneyEnter1.setText("Enter the Value of the Currency You are Transferring From: ");
        CCFrame.add(moneyEnter1);

        //money enter settings and positioning
        moneyEnter2 = new JTextField();
        moneyEnter2.setBounds(173,190,175,30);
        moneyEnter2.setHorizontalAlignment(JTextField.CENTER);
        CCFrame.add(moneyEnter2);

        //money return instructions settings and positioning
        moneyReturned1 = new JTextField();
        moneyReturned1.setBounds(30,230,440,30);
        moneyReturned1.setEditable(false);
        moneyReturned1.setHorizontalAlignment(JTextField.CENTER);
        moneyReturned1.setText("Converted Value: ");
        CCFrame.add(moneyReturned1);

        //money return settings and positioning
        moneyReturned2 = new JTextField();
        moneyReturned2.setBounds(173,270,175,30);
        moneyReturned2.setHorizontalAlignment(JTextField.CENTER);
        CCFrame.add(moneyReturned2);


        //convert JButton settings and positioning
        convert = new JButton("CONVERT");
        convert.setBounds(173,325,175,30);
        convert.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                stodSucess = true;
                String money = moneyEnter2.getText();
                try{
                    moneyNum = Double.parseDouble(money);
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(CCFrame, "Invalid Input!!", "Error", JOptionPane.ERROR_MESSAGE);
                    stodSucess = false;
                }
                if (stodSucess){
                    cFrom = (String)combobox1.getSelectedItem();
                    cTo = (String)combobox2.getSelectedItem();
                    double convertedNum = convert();
                    if (convertedNum>9999999999999999.0){
                        DecimalFormat df = new DecimalFormat("0.###E0");
                        String convertedNumS = df.format(convertedNum);
                        moneyReturned2.setText(cTo+" "+convertedNumS);
                    }
                    else{
                        String textToBePrinted = cTo;
                        textToBePrinted = textToBePrinted+String.format(" %.2f",convertedNum);
                        moneyReturned2.setText(textToBePrinted);
                    }
                }
            }
        });
        CCFrame.add(convert);
    }
    public double convert(){
        if (cFrom.equals("USD")){
            if (cTo.equals("USD")){
                return moneyNum;
            }
            else if (cTo.equals("CAD")){
                return moneyNum*1.36;
            }
            else if (cTo.equals("GBP")){
                return moneyNum*0.72;
            }
            else if (cTo.equals("INR")){
                return moneyNum*91.52;
            }
            else if (cTo.equals("EUR")){
                return moneyNum*0.83;
            }
            else{
                return 0;
            }
        }
        else if (cFrom.equals("CAD")){
            if (cTo.equals("USD")){
                return moneyNum*0.74;
            }
            else if (cTo.equals("CAD")){
                return moneyNum;
            }
            else if (cTo.equals("GBP")){
                return moneyNum*0.53;
            }
            else if (cTo.equals("INR")){
                return moneyNum*67.31;
            }
            else if (cTo.equals("EUR")){
                return moneyNum*0.61;
            }
            else{
                return 0;
            }
        }
        else if (cFrom.equals("GBP")){
            if (cTo.equals("USD")){
                return moneyNum*1.38;
            }
            else if (cTo.equals("CAD")){
                return moneyNum*1.88;
            }
            else if (cTo.equals("GBP")){
                return moneyNum;
            }
            else if (cTo.equals("INR")){
                return moneyNum*126.41;
            }
            else if (cTo.equals("EUR")){
                return moneyNum*1.15;
            }
            else{
                return 0;
            }
        }
        else if (cFrom.equals("INR")){
            if (cTo.equals("USD")){
                return moneyNum*0.011;
            }
            else if (cTo.equals("CAD")){
                return moneyNum*0.015;
            }
            else if (cTo.equals("GBP")){
                return moneyNum*0.0079;
            }
            else if (cTo.equals("INR")){
                return moneyNum;
            }
            else if (cTo.equals("EUR")){
                return moneyNum*0.0091;
            }
            else{
                return 0;
            }
        }
        else if (cFrom.equals("EUR")){
            if (cTo.equals("USD")){
                return moneyNum*1.20;
            }
            else if (cTo.equals("CAD")){
                return moneyNum*1.63;
            }
            else if (cTo.equals("GBP")){
                return moneyNum*0.87;
            }
            else if (cTo.equals("INR")){
                return moneyNum*109.87;
            }
            else if (cTo.equals("EUR")){
                return moneyNum;
            }
            else{
                return 0;
            }
        }
        else{
                return 0;
            }
    }
    public void actionPerformed(ActionEvent e){

    }
}
