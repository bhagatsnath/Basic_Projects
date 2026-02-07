/**
 * Author: Bhagat Sabari Nath
 * Date: Dec 9, 2025
 * Project 4
 */
//import classes and interfaces within the Abstract Window ToolKit (AWT) package
import java.awt.*;
//import event handling model for the Abstract Window ToolKit (AWT)
import java.awt.event.*;
//import the swing library with many classes and interfaces
import javax.swing.*;

//defines the name of the class, and this class extends the classes inside JPanel from javax.swing.* ,and implements the interface ActionListener from java.awt.event.*
public class Calculator extends JPanel implements ActionListener
{
    //declare all button variables, frame and a textfield

    //the frame in which all the components are located within
    JDialog CalculatorFrame;
    //button for number 1
    JButton button1;
    //button for number 2
    JButton button2;
    //button for number 3
    JButton button3;
    //button for number 4
    JButton button4;
    //button for number 5
    JButton button5;
    //button for number 6
    JButton button6;
    //button for number 7
    JButton button7;
    //button for number 8
    JButton button8;
    //button for number 9
    JButton button9;
    //button for number 0
    JButton button0;
    //button for addition  
    JButton buttonPlus;
    //button for subtraction 
    JButton buttonMinus;
    //button for division 
    JButton buttonDivide;
    //button for multiplication 
    JButton buttonMultiply;
    //button for the adding a decimal 
    JButton buttonDecimal;
    //button for clearing everything in the textfield and resetting the values of the numbers and the boolean values
    JButton buttonClear;
    //button for performing the calculation
    JButton equals;
    //textfield where the button clicks and the answer are going to be printed
    JTextField main;
    //the first of two numbers in a calculation. String value
    String num1 = "";
    //the second of two numbers in a calculation. String value
    String num2 = "";
    //the value of answer that will be printed in the textfield in double value
    double answer = 0;
    // the operator that the two numbers will do to get the answer
    String operator = "o";
    // boolean value allows the calculator to register the first number
    boolean startNum1 = true;
    // boolean value denies the calculator to register the second number
    boolean startNum2 = false;
    //boolean value allows the calculator to register an operator; once the second number is registered, a condition that uses this boolean value restricts the calculator
    //from registering anymore operators.
    boolean operatorEnteredAllowed = true;
    //boolean value allows the calculator to register a decimal point for the first number; once one decimal point is registered, a condition that uses this boolean value is used to restrict 
    // the calculator from registering any other decimal points
    boolean decimalAllowedForNum1 = true;
    //boolean value allows the calculator to register a decimal point for the second number; once one decimal point is registered, a condition that uses this boolean value is used to restrict 
    // the calculator from registering any other decimal points
    boolean decimalAllowedForNum2 = true;
    //By pressing the minus sign before entering the first number will add a - sign before the number you are going to type, once the calculator registers a - sign, a conditon that uses 
    // this boolean value restricts the calculator from registering any more - signs for the first number
    boolean negativeNumberAllowedForNum1 = true;
    //By pressing the minus sign before entering the second number, but after pressing the operator, the calculator will register a - sign before the number you are 
    // going to type, once the calculator registers a - sign, a conditon that uses this boolean value restricts the calculator from registering any more - signs for the second number
    boolean negativeNumberAllowedForNum2 = false;
    
    //declartion of the main method
    //boolean popupAllowed stops the JOptionPane from opening if you have already opened the application
    public static void initialize(JFrame mainFrame, boolean popupAllowed, int r, int g, int b){
        new Calculator(mainFrame,popupAllowed,r,g,b);
    }
    //constructor for the class, that contains the initializations of all the global variables, and features for the JFrame
    public Calculator(JFrame mainFrame, boolean popupAllowed, int r, int g, int b){
        //pop-up window that contains instructions on how to use the Calculator and Credits
        if (popupAllowed){
            JOptionPane.showMessageDialog(CalculatorFrame,"<html><center><b>This calculator works like a typical calculator with a familiar layout, with <br/> all the numbers and operators from a basic non-scientific calculator. <br/>This includes decimal points, negative numbers, etc. <br/><br/><br/>Credits:<br/>Developed by Bhagat Sabari Nath</b></center></html>","Welcome to Calculator",JOptionPane.INFORMATION_MESSAGE);
            popupAllowed = false;
        }
        //initliazation and the title
        CalculatorFrame = new JDialog(mainFrame, "Calculator");
        CalculatorFrame.setLayout(null);
        //sets size for the JFrame in pixels by pixels
        CalculatorFrame.setSize(255,300);
        //sets background color for the JFrame; RGB values result in a light purple color
        CalculatorFrame.getContentPane().setBackground(new Color(r, g, b));
        // opens the window in the middle of the screen, as opposed to the corner
        CalculatorFrame.setLocationRelativeTo(null);
        CalculatorFrame.setResizable(false);
        
        // initialization of each button and the text on them
        button1= new JButton("1");
        button2= new JButton("2");
        button3= new JButton("3");
        button4= new JButton("4");
        button5= new JButton("5");
        button6= new JButton("6");
        button7= new JButton("7");
        button8= new JButton("8");
        button9= new JButton("9");
        button0= new JButton("0");
        buttonPlus= new JButton("+");
        buttonMinus= new JButton("-");
        buttonDivide= new JButton("/");
        buttonMultiply= new JButton("*");
        buttonDecimal = new JButton(".");
        buttonClear = new JButton("CLEAR");
        equals= new JButton("=");
        //initlialization of the textfield
        main = new JTextField();
        
        int width = 50;
        int height = 30;
        //coordinates of each element in the JFrame
        //gap space: 15
        button1.setBounds(25,50,width,height);
        button2.setBounds(80,50,width,height);
        button3.setBounds(135, 50, width,height);
        buttonPlus.setBounds(190,50,width,height);
        
        button4.setBounds(25,85,width,height);
        button5.setBounds(80,85,width,height);
        button6.setBounds(135,85,width,height);
        buttonMinus.setBounds(190,85,width,height);
        
        button7.setBounds(25, 120,width,height);
        button8.setBounds(80,120,width,height);
        button9.setBounds(135,120,width,height);
        buttonDivide.setBounds(190,120,width,height);
        
        button0.setBounds(25,155,width,height);
        buttonMultiply.setBounds(190,155,width,height);
        equals.setBounds(135,155,width,height);
        buttonDecimal.setBounds(80,155,width,height);

        buttonClear.setBounds(20,200,215,30);

        main.setBounds(20,10,215,30);
        main.setHorizontalAlignment(JTextField.RIGHT);
        main.setEditable(false);
        
        //adding all the elements to the JFrame
        CalculatorFrame.add(button1);
        CalculatorFrame.add(button2);
        CalculatorFrame.add(button3);
        CalculatorFrame.add(button4);
        CalculatorFrame.add(button5);
        CalculatorFrame.add(button6);
        CalculatorFrame.add(button7);
        CalculatorFrame.add(button8);
        CalculatorFrame.add(button9);
        CalculatorFrame.add(button0);
        CalculatorFrame.add(buttonDecimal);
        
        CalculatorFrame.add(buttonPlus);
        CalculatorFrame.add(buttonMinus);
        CalculatorFrame.add(buttonDivide);
        CalculatorFrame.add(buttonMultiply);
        CalculatorFrame.add(equals);

        CalculatorFrame.add(buttonClear);
        
        //set the frame visible to the user
        CalculatorFrame.add(main);
        CalculatorFrame.setVisible(true);

        //adding actionListener to each button and textfield with the instructions in the actionPerformed method in the class
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonDecimal.addActionListener(this);

        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonMultiply.addActionListener(this);

        //adding actionListener to the equals sign button; for the equals sign, a seperate actionPerformed method is declared to carry out the calculations
        equals.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //declare the double value for the first number
                double number1;
                //handling edge cases, in case the user presses an operator and then presses equals without giving the first number
                if (num1.equals("")||num1.equals("-")){
                    main.setText("Error");
                    startNum1 = false;
                    startNum2 = false;
                    operatorEnteredAllowed = false;
                    return;
                }
                //converting the string num1 into a double value
                else{
                    try{
                        number1 = Double.parseDouble(num1);
                    }
                    catch(Exception x){
                        main.setText("Error");
                        startNum1 = false;
                        startNum2 = false;
                        operatorEnteredAllowed = false;
                        return;
                    }
                }
                //declare the double value for the second number
                double number2;
                //handling edge cases, in case the user presses the first number and an operator and then hits equals without giving the second number
                if (num2.equals("")||num1.equals("-")){
                    main.setText("Error");
                    startNum1 = false;
                    startNum2 = false;
                    operatorEnteredAllowed = false;
                    return;
                }
                //converting the string num2 into a double value
                else{
                    try{
                        number2 = Double.parseDouble(num2);
                    }
                    catch(Exception x){
                        main.setText("Error");
                        startNum1 = false;
                        startNum2 = false;
                        operatorEnteredAllowed = false;
                        return;
                    }
                }
                //handling edge cases, in case the user doesn't specify an operator, throw an error
                if (operator.equals("o")){
                    main.setText("Error");
                    startNum2 = false;
                    return;
                }
                //calculations for addition
                else if (operator.equals("+")){
                    answer = number1+number2;
                    main.setText(String.valueOf(answer));
                    num1 = String.valueOf(answer);
                    num2 = "";
                    operator = "o";
                    // New Operation adjustments
                    startNum1 = false;
                    startNum2 = false;
                    operatorEnteredAllowed = true;
                    decimalAllowedForNum2 = true;
                }
                //calculations for subtraction
                else if (operator.equals("-")){
                    answer = number1-number2;
                    main.setText(String.valueOf(answer));
                    num1 = String.valueOf(answer);
                    num2 = "";
                    operator = "o";
                    // New Operation adjustments
                    startNum1 = false;
                    startNum2 = false;
                    operatorEnteredAllowed = true;
                    decimalAllowedForNum2 = true;
                }
                //calculations for multiplication
                else if (operator.equals("*")){
                    answer = number1*number2;
                    main.setText(String.valueOf(answer));
                    num1 = String.valueOf(answer);
                    num2 = "";
                    operator = "o";
                    // New Operation adjustments
                    startNum1 = false;
                    startNum2 = false;
                    operatorEnteredAllowed = true;
                    decimalAllowedForNum2 = true;
                }
                //calculations for division
                else if (operator.equals("/")){
                    if (number2 == 0){
                        //in case second number is 0, throw an error for dividing by zero
                        main.setText("Cannot Divide By Zero!");
                        startNum2 = false;
                        return;
                    }
                    else{
                        answer = number1/number2;
                        main.setText(String.valueOf(answer));
                        num1 = String.valueOf(answer);
                        num2 = "";
                        operator = "o";
                        // New Operation adjustments
                        startNum1 = false;
                        startNum2 = false;
                        operatorEnteredAllowed = true;
                        decimalAllowedForNum2 = true;
                    }
                }
            }
        });
        //adding actionListener to the clear button; for the clear button, a seperate actionPerformed method is declared to reset all the variables
        buttonClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //value of num1 and num2 is restored back to nothing
                num1="";
                num2="";
                // initial values for the boolean values are restores
                startNum1 = true;
                startNum2 = false;
                operatorEnteredAllowed = true;
                decimalAllowedForNum1 = true;
                decimalAllowedForNum2 = true;
                negativeNumberAllowedForNum1 = true;
                negativeNumberAllowedForNum2 = false;
                //clears the textfield
                main.setText("");
            }
        });
    }
    public void actionPerformed(ActionEvent x){
        // new JButton to identify which button was clicked by the user.
        JButton b1;
        b1 = (JButton)x.getSource();
        if (startNum1){
            // if number 1 was pressed
            if (b1==button1){
                num1 = num1+1;//append the number 1 to the string
                main.setText(num1);
                //once a digit is pressed, negative sign cannot be pressed anymore
                negativeNumberAllowedForNum1 = false;
            }
            // if number 2 was pressed
            else if (b1==button2){
                num1 = num1+2;//append the number 2 to the string
                main.setText(num1);
                //once a digit is pressed, negative sign cannot be pressed anymore
                negativeNumberAllowedForNum1 = false;
            }
            // if number 3 was pressed
            else if (b1==button3){
                num1 = num1+3;//append the number 3 to the string
                main.setText(num1);
                //once a digit is pressed, negative sign cannot be pressed anymore
                negativeNumberAllowedForNum1 = false;
            }
            // if number 4 was pressed
            else if (b1==button4){
                num1 = num1+4;//append the number 4 to the string
                main.setText(num1);
                //once a digit is pressed, negative sign cannot be pressed anymore
                negativeNumberAllowedForNum1 = false;
            }
            // if number 5 was pressed
            else if (b1==button5){
                num1 = num1+5;//append the number 5 to the string
                main.setText(num1);
                //once a digit is pressed, negative sign cannot be pressed anymore
                negativeNumberAllowedForNum1 = false;
            }
            // if number 6 was pressed
            else if (b1==button6){
                num1 = num1+6;//append the number 6 to the string
                main.setText(num1);
                //once a digit is pressed, negative sign cannot be pressed anymore
                negativeNumberAllowedForNum1 = false;
            }
            // if number 7 was pressed
            else if (b1==button7){
                num1 = num1+7;//append the number 7 to the string
                main.setText(num1);
                //once a digit is pressed, negative sign cannot be pressed anymore
                negativeNumberAllowedForNum1 = false;
            }
            // if number 8 was pressed
            else if (b1==button8){
                num1 = num1+8;//append the number 8 to the string
                main.setText(num1);
                //once a digit is pressed, negative sign cannot be pressed anymore
                negativeNumberAllowedForNum1 = false;
            }
            // if number 9 was pressed
            else if (b1==button9){
                num1 = num1+9;//append the number 9 to the string
                main.setText(num1);
                //once a digit is pressed, negative sign cannot be pressed anymore
                negativeNumberAllowedForNum1 = false;
            }
            // if number 0 was pressed
            else if (b1==button0){
                num1 = num1+0;//append the number 0 to the string
                main.setText(num1);
                //once a digit is pressed, negative sign cannot be pressed anymore
                negativeNumberAllowedForNum1 = false;
            }
            // if decimal is pressed
            else if (b1==buttonDecimal&&decimalAllowedForNum1){
                num1 = num1+".";
                main.setText(num1);
                //restricts the calcultor from registering another decimal point
                decimalAllowedForNum1 = false;
                //once a digit is pressed, negative sign cannot be pressed anymore
                negativeNumberAllowedForNum1 = false;
            }
            
        }
        if (operatorEnteredAllowed){
            //if the plus sign is pressed
            if (b1==buttonPlus){
                // to check if operator is pressed before the first number
                if (num1.equals("")){
                    main.setText("Enter a Number First");
                }
                else{
                    operator = "+";
                    startNum1 = false;//number 1 is over 
                    startNum2 = true;// number 2 can now be registered
                    negativeNumberAllowedForNum2 = true;//allows a negative sign to be pressed for the second number
                }
            }
            //if the minus sign is pressed
            else if (b1==buttonMinus){
                if (num1.equals("")||(negativeNumberAllowedForNum1||negativeNumberAllowedForNum2)){
                    //allows a negative sign to be pressed if no digit has been pressed yet for each number
                    if (negativeNumberAllowedForNum1){
                        num1 = num1+"-";//appends a minus sign onto the string num1
                        main.setText(num1);
                    }
                    else if (negativeNumberAllowedForNum2){//originally false
                        num2 = num2+"-";//appends minus sign onto string num2
                        main.setText(num2);
                    }
                    else {
                        main.setText("Enter a Number First");
                    }
                }
                else{
                    operator = "-";
                    startNum1 = false;//number 1 is over 
                    startNum2 = true;// number 2 can now be registered
                    negativeNumberAllowedForNum2 = true;//allows a negative sign to be pressed for the second number
                }
            }
            //if the divide sign is pressed
            else if (b1==buttonDivide){
                // to check if operator is pressed before the first number
                if (num1.equals("")){
                    main.setText("Enter a Number First");
                }
                else{
                    operator = "/";
                    startNum1 = false;//number 1 is over
                    startNum2 = true;//number 2 can now be registered
                    negativeNumberAllowedForNum2 = true;//allows a negative sign to be pressed for the second number
                }
            }
            //if the multiply sign is pressed
            else if (b1==buttonMultiply){
                // to check if operator is pressed before the first number
                if (num1.equals("")){
                    main.setText("Enter a Number First");
                }
                else{
                    operator = "*";
                    startNum1 = false;//number 1 is over
                    startNum2 = true;//number 2 can now be registered
                    negativeNumberAllowedForNum2 = true;//allows a negative number to be pressed for the second number
                }
            }
        }
        if (startNum2){
            //to identify button, set text and adjust boolean values
            if (b1==button1){
                num2 = num2+1;
                main.setText(num2);
                operatorEnteredAllowed = false;
                negativeNumberAllowedForNum2 = false;
            }
            else if (b1==button2){
                num2 = num2+2;
                main.setText(num2);
                operatorEnteredAllowed = false;
                negativeNumberAllowedForNum2 = false;
            }
            else if (b1==button3){
                num2 = num2+3;
                main.setText(num2);
                operatorEnteredAllowed = false;
                negativeNumberAllowedForNum2 = false;
            }
            else if (b1==button4){
                num2 = num2+4;
                main.setText(num2);
                operatorEnteredAllowed = false;
                negativeNumberAllowedForNum2 = false;
            }
            else if (b1==button5){
                num2 = num2+5;
                main.setText(num2);
                operatorEnteredAllowed = false;
                negativeNumberAllowedForNum2 = false;
            }
            else if (b1==button6){
                num2 = num2+6;
                main.setText(num2);
                operatorEnteredAllowed = false;
                negativeNumberAllowedForNum2 = false;
            }
            else if (b1==button7){
                num2 = num2+7;
                main.setText(num2);
                operatorEnteredAllowed = false;
                negativeNumberAllowedForNum2 = false;
            }
            else if (b1==button8){
                num2 = num2+8;
                main.setText(num2);
                operatorEnteredAllowed = false;
                negativeNumberAllowedForNum2 = false;
            }
            else if (b1==button9){
                num2 = num2+9;
                main.setText(num2);
                operatorEnteredAllowed = false;
                negativeNumberAllowedForNum2 = false;
            }
            else if (b1==button0){
                num2 = num2+0;
                main.setText(num2);
                operatorEnteredAllowed = false;
                negativeNumberAllowedForNum2 = false;
            }
            else if (b1==buttonDecimal&&decimalAllowedForNum2){
                num2 = num2+".";
                main.setText(num2);
                operatorEnteredAllowed = false;
                decimalAllowedForNum2 = false;
                negativeNumberAllowedForNum2 = false;
            }
        }
    }
}

