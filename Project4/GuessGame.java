
/**
 * Author: Bhagat Sabari Nath
 * Date: Jan 31, 2026
 * Project 4
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GuessGame implements ActionListener{
    JDialog levelFrame;
    JDialog gameFrame;

    //general game properties
    int range;
    int guessLeft = 10;
    int randomNumber;
    String enteredNumS = "";
    int enteredNum;

    //levelFrame properties
    JTextField welcomeField;
    JTextField chooseField;
    JButton easyButton;
    JButton mediumButton;
    JButton hardButton;
    JButton helpButton;


    //gameFrame properties
    JTextField mainDisplay;
    JLabel hint;
    JTextField hintDisplay;
    JPanel numbers;
    JButton num1;
    JButton num2;
    JButton num3;
    JButton num4;
    JButton num5;
    JButton num6;
    JButton num7;
    JButton num8;
    JButton num9;
    JButton num0;
    JButton checkAns;
    JButton clearButton;
    JButton helpButton2;
    JLabel guessLeftDisplay; 
    JButton startOver;

    public static void initialize(JFrame mainFrame,boolean popupAllowed, int r, int g, int b){
        new GuessGame(mainFrame,popupAllowed,r,g,b);
    }
    public GuessGame(JFrame mainFrame,boolean popupAllowed, int r, int g, int b){
        if(popupAllowed){
            throwPopUp();
        }
        // levelFrame settings and positioning
        levelFrame = new JDialog(mainFrame,"Choose Your Level");
        levelFrame.setSize(500,400);
        levelFrame.getContentPane().setBackground(new Color(r,g,b));
        levelFrame.setResizable(false);
        levelFrame.setLayout(null);
        levelFrame.setLocationRelativeTo(null);
        levelFrame.setVisible(true);
        // gameFrame settings and positioning
        gameFrame = new JDialog(mainFrame,"Guess the Number");
        gameFrame.setSize(800,500);
        gameFrame.getContentPane().setBackground(new Color(r,g,b));
        gameFrame.setResizable(false);
        gameFrame.setLayout(null);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(false);

        //In Level Frame
        //welcomeField settings and positioning 
        welcomeField = new JTextField();
        welcomeField.setBounds(20,20,460,40);
        welcomeField.setEditable(false);
        welcomeField.setHorizontalAlignment(JTextField.CENTER);
        Font font1 = new Font("Arial",Font.PLAIN,30);
        welcomeField.setFont(font1);
        welcomeField.setText("Welcome to Guess the Number");
        levelFrame.add(welcomeField);
        //chooseField settings and positioning
        chooseField = new JTextField();
        chooseField.setBounds(150,80,200,20);
        chooseField.setEditable(false);
        chooseField.setHorizontalAlignment(JTextField.CENTER);
        chooseField.setText("Choose your Level: ");
        levelFrame.add(chooseField);
        //easyButton settings and positioning
        easyButton = new JButton("Easy Level");
        easyButton.setBounds(150,110,200,20);
        easyButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                range = 50;
                randomNumber = (int)(Math.random()*range)+1;
                levelFrame.setVisible(false);
                gameFrame.setVisible(true);
            }
        });
        levelFrame.add(easyButton);
        //mediumButton settings and positioning
        mediumButton = new JButton("Medium Level");
        mediumButton.setBounds(150,140,200,20);
        mediumButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                range = 100;
                randomNumber = (int)(Math.random()*range)+1;
                levelFrame.setVisible(false);
                gameFrame.setVisible(true);
            }
        });
        levelFrame.add(mediumButton);
        //hardButton settings and positioning
        hardButton = new JButton("Hard Level");
        hardButton.setBounds(150,170,200,20);
        hardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                range = 200;
                randomNumber = (int)(Math.random()*range)+1;
                levelFrame.setVisible(false);
                gameFrame.setVisible(true);
            }
        });
        levelFrame.add(hardButton);
        // Button for popUp with instructions
        helpButton = new JButton("Instructions");
        helpButton.setBounds(380,335,100,20);
        helpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                throwPopUp();
            }
        });
        levelFrame.add(helpButton);


        // In the GameFrame
        //mainDisplay settings and positioning
        mainDisplay = new JTextField();
        mainDisplay.setBounds(20,20,250,250);
        mainDisplay.setEditable(false);
        Font font2 = new Font("Arial",Font.PLAIN,60);
        mainDisplay.setFont(font2);
        mainDisplay.setHorizontalAlignment(JTextField.CENTER);
        gameFrame.add(mainDisplay);
        //hint settings and positioning
        hint = new JLabel("Hints: ");
        hint.setBounds(120,300,60,20);
        Font font3 = new Font("Arial",Font.PLAIN,20);
        hint.setFont(font3);
        gameFrame.add(hint);
        //hintDisplay settings and positioning
        hintDisplay = new JTextField();
        hintDisplay.setBounds(20,330,250,50);
        hintDisplay.setEditable(false);
        Font font4 = new Font("Arial",Font.PLAIN, 12);
        hintDisplay.setFont(font4);
        hintDisplay.setHorizontalAlignment(JTextField.CENTER);
        gameFrame.add(hintDisplay);
        //initializing number buttons and adding action listener
        num1 = new JButton("1");
        num1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                enteredNumS = enteredNumS+"1";
                mainDisplay.setText(enteredNumS);
            }
        });
        num2 = new JButton("2");
        num2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                enteredNumS = enteredNumS+"2";
                mainDisplay.setText(enteredNumS);
            }
        });
        num3 = new JButton("3");
        num3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                enteredNumS = enteredNumS+"3";
                mainDisplay.setText(enteredNumS);
            }
        });
        num4 = new JButton("4");
        num4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                enteredNumS = enteredNumS+"4";
                mainDisplay.setText(enteredNumS);
            }
        });
        num5 = new JButton("5");
        num5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                enteredNumS = enteredNumS+"5";
                mainDisplay.setText(enteredNumS);
            }
        });
        num6 = new JButton("6");
        num6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                enteredNumS = enteredNumS+"6";
                mainDisplay.setText(enteredNumS);
            }
        });
        num7 = new JButton("7");
        num7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                enteredNumS = enteredNumS+"7";
                mainDisplay.setText(enteredNumS);
            }
        });
        num8 = new JButton("8");
        num8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                enteredNumS = enteredNumS+"8";
                mainDisplay.setText(enteredNumS);
            }
        });
        num9 = new JButton("9");
        num9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                enteredNumS = enteredNumS+"9";
                mainDisplay.setText(enteredNumS);
            }
        });
        num0 = new JButton("0");
        num0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                enteredNumS = enteredNumS+"0";
                mainDisplay.setText(enteredNumS);
            }
        });
        //JPanel that contains numbers settings and positioning
        numbers = new JPanel(new GridLayout(5,5));
        numbers.setBackground(new Color(r,g,b));
        numbers.setBounds(300,20,450,300);
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);
        numbers.add(num6);
        numbers.add(num7);
        numbers.add(num8);
        numbers.add(num9);
        numbers.add(num0);
        gameFrame.add(numbers);
        //helpbutton 2 settings and positioning
        helpButton2 = new JButton("Instructions");
        helpButton2.setBounds(400,430,120,20);
        helpButton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                throwPopUp();
            }
        });
        gameFrame.add(helpButton2);
        //clear button settings and positioning
        clearButton = new JButton("Clear");
        clearButton.setBounds(550,430,100,20);
        clearButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                enteredNumS = "";
                mainDisplay.setText("");
            }
        });
        gameFrame.add(clearButton);
        //guessLeftDisplay settings and positioning
        guessLeftDisplay = new JLabel("Guesses Left: "+String.valueOf(guessLeft));
        guessLeftDisplay.setBounds(670,430,120,20);
        gameFrame.add(guessLeftDisplay);
        //startOver settings and positioning
        startOver = new JButton("Start Over");
        startOver.setBounds(100,400,100,20);
        startOver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                enteredNumS = "";
                mainDisplay.setText("");
                hintDisplay.setText("");
                guessLeft = 10;
                gameFrame.remove(startOver);
                gameFrame.add(checkAns);
                gameFrame.revalidate();
                gameFrame.repaint();
                gameFrame.setVisible(false);
                levelFrame.setVisible(true);
            }
        });
        //checkAns settings and positioning
        checkAns = new JButton("Check Answer");
        checkAns.setBounds(100,400,100,20);
        checkAns.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (guessLeft>1){
                    String feedback = gameLogic();
                    if (feedback.equals("error")){
                        hintDisplay.setText("Enter a Number First!");
                    }
                    else if (!(feedback.equals("Correct"))){
                        enteredNumS = "";
                        mainDisplay.setText("");
                        hintDisplay.setText("The Number is "+feedback+" than your guess!");
                        guessLeft--;
                        guessLeftDisplay.setText("Guesses Left: "+String.valueOf(guessLeft));
                    }
                    else if (feedback.equals("Correct")){
                        enteredNumS = "";
                        hintDisplay.setText("Congratulations You got the Number!!!!");
                        guessLeftDisplay.setText("Guesses Left: "+String.valueOf(guessLeft));
                        gameFrame.remove(checkAns);
                        gameFrame.add(startOver);
                        gameFrame.revalidate();
                        gameFrame.repaint();
                    }
                }
                else{
                    guessLeft--;
                    guessLeftDisplay.setText("Guesses Left: "+String.valueOf(guessLeft));
                    hintDisplay.setText("Sorry You are Out of Turns");
                    gameFrame.remove(checkAns);
                    gameFrame.add(startOver);
                    gameFrame.revalidate();
                    gameFrame.repaint();
                }
            }
        });
        gameFrame.add(checkAns);

    }
    public void throwPopUp(){
        JOptionPane.showMessageDialog(levelFrame,"<html><center><b>This Game is a guessing game<br/> where the game will randomly generate a number <br/>based on the level that you choose <br/>the and you will have 10 attempts to figure out the number<br/><br/>Level Easy: Guess Number From 1 to 50<br/>Level Medium: Guess Number From 1 to 100<br/>Level Hard: Guess Number From 1 to 200<br/><br/><br/><br/><br/>Developed By Bhagat Sabari Nath</b></center></html>","",JOptionPane.INFORMATION_MESSAGE);
    }
    public String gameLogic(){
        try{
            enteredNum = (int)Double.parseDouble(enteredNumS);
        }
        catch(Exception ex){
            return "error";
        }
        if (enteredNum>randomNumber){
            return "lower";
        }
        else if (enteredNum<randomNumber){
            return "higher";
        }
        else{
            return "Correct";
        }
    }
    public void actionPerformed(ActionEvent e){

    }
}
