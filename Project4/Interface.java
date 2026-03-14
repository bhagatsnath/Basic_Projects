/**
 * Author: Bhagat Sabari Nath
 * Date: Jan 26, 2026
 * Project 4
 */
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import java.nio.file.*;
import java.util.List;

import javax.swing.*;
public class Interface extends Canvas implements ActionListener{
    //Jframe Resolution:
    /**
     *           1700
     *          --------------------
     * 1025     |
     *          |
     *          |
     *          |
     */


    static JFrame mainFrame;
    static JTextField timeField;
    static JButton dock;
    static JTextField nameField;
    static JButton logout;
    static JButton deleteAccount;
    //colors variables
    static int r;
    static int g;
    static int b;
    static int r2;
    static int g2;
    static int b2;
    static String color = "";

    //boolean values for permissions
    boolean popupAllowedForCalc = true;
    boolean popupAllowedForCC = true;
    boolean popupAllowedForUC = true;
    boolean popupAllowedForGG = true;


    //window opening buttons
    static JButton calc;
    static JButton settings;
    static JButton CConverter;
    static JButton about;
    static JButton UConverter;
    static JButton guessGame;

    public static void initialize(String[]details, int indexOfCredential){
        new Interface(details,indexOfCredential);
    }
    public Interface(String[] details, int indexOfCredential){
        r = 120;
        g = 199;
        b = 245;
        r2 = 105;
        g2 = 180;
        b2 = 250;
        //frame settings
        mainFrame = new JFrame("Nath Toolkit");
        mainFrame.setSize(1700,1025);
        mainFrame.setLayout(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.getContentPane().setBackground(new Color(r,g,b));
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);

        //---------------------------------------------------------------------------------------------
        // time text field settings and positioning
        timeField = new JTextField();
        timeField.setEditable(false);
        timeField.setBounds(1590,10,100,20);
        timeField.setHorizontalAlignment(JTextField.RIGHT);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm a");
        Timer timeSet = new Timer(60, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String time = LocalTime.now().format(format);
                timeField.setText(time);
            }
        });
        timeSet.setInitialDelay(0);
        timeSet.start();
        mainFrame.add(timeField);
        //---------------------------------------------------------------------------------------------
        //nameField settings and positioning
        nameField = new JTextField();
        nameField.setBounds(1350,10,230,20);
        nameField.setHorizontalAlignment(JTextField.CENTER);
        nameField.setEditable(false);
        nameField.setText("Welcome, "+details[0]);
        mainFrame.add(nameField);
        //---------------------------------------------------------------------------------------------
        //logout settings and positioning
        logout = new JButton("Logout");
        logout.setBounds(1280,10,60,20);
        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JDialog confirmFrame = new JDialog(mainFrame,"Confirmation");
                confirmFrame.setSize(300,100);
                confirmFrame.setLocationRelativeTo(null);
                confirmFrame.setLayout(null);
                confirmFrame.getContentPane().setBackground(new Color(r,g,b));
                confirmFrame.setResizable(false);
                JLabel statement = new JLabel("Are you Sure You want to Logout");
                statement.setBounds(10,10,280,20);
                statement.setHorizontalAlignment(JLabel.CENTER);
                confirmFrame.add(statement);
                JButton confirmButton = new JButton("Yes");
                confirmButton.setBounds(130,40,40,20);
                confirmButton.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        mainFrame.dispose();
                        Nath_ToolKit.main(new String[0]);
                    }
                });
                confirmFrame.add(confirmButton);
                confirmFrame.setVisible(true);
            }
        });
        mainFrame.add(logout);
        //---------------------------------------------------------------------------------------------
        //deleteAccount settings and positioning
        deleteAccount = new JButton("Delete Account");
        deleteAccount.setBounds(1150,10,120,20);
        deleteAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JDialog confirmFrame = new JDialog(mainFrame,"Confirmation");
                confirmFrame.setSize(400,100);
                confirmFrame.setLocationRelativeTo(null);
                confirmFrame.setLayout(null);
                confirmFrame.setResizable(false);
                confirmFrame.getContentPane().setBackground(new Color(r,g,b));
                JLabel statement = new JLabel("Are you Sure you want to Delete Your Toolkit Account");
                statement.setBounds(10,10,380,20);
                statement.setHorizontalAlignment(JLabel.CENTER);
                confirmFrame.add(statement);
                JButton confirmButton = new JButton("Yes");
                confirmButton.setBounds(180,40,40,20);
                confirmButton.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent ee){
                        confirmFrame.setVisible(false);
                        JDialog verifyFrame = new JDialog();
                        verifyFrame.setSize(300,200);
                        verifyFrame.setLocationRelativeTo(null);
                        verifyFrame.setLayout(null);
                        verifyFrame.setResizable(false);
                        verifyFrame.getContentPane().setBackground(new Color(r,g,b));
                        JLabel statement2 = new JLabel("Enter Your Password For Confirmation");
                        statement2.setBounds(10,10,280,20);
                        statement2.setHorizontalAlignment(JLabel.CENTER);
                        verifyFrame.add(statement2);
                        JPasswordField verifyField = new JPasswordField();
                        verifyField.setBounds(50,40,200,20);
                        verifyField.setHorizontalAlignment(JTextField.RIGHT);
                        verifyFrame.add(verifyField);
                        JButton verifyButton = new JButton("Delete Account");
                        verifyButton.setBounds(50,110,200,20);
                        verifyButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent eee){
                                String passVerify = new String(verifyField.getPassword());
                                if (passVerify.equals(details[2])){
                                    verifyFrame.setVisible(false);
                                    Path path = Paths.get("project4Data.txt");
                                    try{
                                        List<String> credentials = Files.readAllLines(path);
                                        credentials.remove(indexOfCredential);
                                        credentials.removeIf(line -> line.trim().isEmpty());
                                        String content = String.join(System.lineSeparator(),credentials);
                                        Files.writeString(path,content);
                                        mainFrame.dispose();
                                        Nath_ToolKit.main(new String[0]);
                                    }
                                    catch(Exception ex){
                                        ex.printStackTrace();
                                    }
                                }
                                else {
                                    JLabel incorrectPassword = new JLabel("Incorrect Password");
                                    incorrectPassword.setBounds(50,75,200,20);
                                    incorrectPassword.setHorizontalAlignment(JLabel.CENTER);
                                    incorrectPassword.setForeground(Color.RED);
                                    verifyFrame.add(incorrectPassword);
                                }
                            }
                        });
                        verifyFrame.add(verifyButton);
                        verifyFrame.setVisible(true);
                    }
                });
                confirmFrame.add(confirmButton);
                confirmFrame.setVisible(true);
            }
        });
        mainFrame.add(deleteAccount);
        //---------------------------------------------------------------------------------------------
        //About button settings and positioning
        about = new JButton("About");
        about.setBounds(95,10,75,20);
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                AboutPage.initialize(r,g,b);
            }
        });
        mainFrame.add(about);
        //---------------------------------------------------------------------------------------------
        calc = new JButton("C");
        calc.setBounds(360,930,50,50);
        calc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Calculator.initialize(mainFrame,popupAllowedForCalc,r,g,b);
                popupAllowedForCalc = false;
            }
        });
        mainFrame.add(calc);
        //---------------------------------------------------------------------------------------------
        CConverter = new JButton("CC");
        CConverter.setBounds(420,930,50,50);
        CConverter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                CurrencyConverter.initialize(mainFrame,popupAllowedForCC,r,g,b);
                popupAllowedForCC = false;
            }
        });
        mainFrame.add(CConverter);
        //---------------------------------------------------------------------------------------------
        // settings button settings and positioning
        settings = new JButton("Settings");
        settings.setBounds(10,10,75,20);
        mainFrame.add(settings);
        settings.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Settings();
            }
        });
        //---------------------------------------------------------------------------------------------
        //UConverter button settings and positioning 
        UConverter = new JButton("UC");
        UConverter.setBounds(480,930,50,50);
        mainFrame.add(UConverter);
        UConverter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                UnitConverter.initialize(mainFrame,popupAllowedForUC,r,g,b);
                popupAllowedForUC = false;
           } 
        });
        //---------------------------------------------------------------------------------------------
        //guessGame button settings and positioning
        guessGame = new JButton("GG");
        guessGame.setBounds(540,930,50,50);
        mainFrame.add(guessGame);
        guessGame.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                GuessGame.initialize(mainFrame,popupAllowedForGG,r,g,b);
                popupAllowedForGG = false;
            }
        });
        //---------------------------------------------------------------------------------------------
        
        //---------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------

        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Dock must stay at this part of the code due to logic in layering
        dock = new JButton(){
            public void paintComponent(Graphics g){
                g.setColor(new Color(r2, g2, b2));
                g.fillRect(0,0, getWidth(),getHeight());
                super.paintComponent(g);
            }
        };
        dock.setForeground(Color.WHITE);
        dock.setBorderPainted(false);
        dock.setFocusPainted(false); 
        dock.setBounds(335, 925, 1000, 60);
        mainFrame.add(dock);
        //---------------------------------------------------------------------------------------------
        mainFrame.setVisible(true);
    }
    public static void Settings(){
        JFrame settingsFrame = new JFrame("Settings");
        settingsFrame.setSize(400,300);
        settingsFrame.setLocationRelativeTo(null);
        settingsFrame.getContentPane().setBackground(new Color(r,g,b));
        settingsFrame.setResizable(false);
        settingsFrame.setLayout(null);
        settingsFrame.setVisible(true);
        //Wallpaper TextField Settings and positioning
        JTextField wallpaper = new JTextField("Wallpaper");
        wallpaper.setEditable(false);
        wallpaper.setBounds(50,40,75,20);
        settingsFrame.add(wallpaper);
        //JComboBox Settings and Positioning
        String[] options = {"Blue","Green","Red"};
        JComboBox<String> combobox = new JComboBox<>(options);
        combobox.setBounds(200,40,150,20);
        settingsFrame.add(combobox);
        //save button settings and positioning
        JButton save = new JButton("SAVE");
        save.setBounds(50,215,300,20);
        settingsFrame.add(save);
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                color = (String) combobox.getSelectedItem();
                if (color.equals("Blue")){
                    r = 120;
                    g = 199;
                    b = 245;
                    r2 = 105;
                    g2 = 180;
                    b2 = 250;
                    settingsFrame.getContentPane().setBackground(new Color(r,g,b));
                    mainFrame.getContentPane().setBackground(new Color(r,g,b));
                }
                else if (color.equals("Green")){
                    r=191;
                    g=255;
                    b=184;
                    r2 = 62;
                    g2 = 250;
                    b2 = 75;
                    settingsFrame.getContentPane().setBackground(new Color(r,g,b));
                    mainFrame.getContentPane().setBackground(new Color(r,g,b));
                }
                else if (color.equals("Red")){
                    r=252;
                    g=182;
                    b=182;
                    r2 = 255;
                    g2 = 125;
                    b2 = 125;
                    settingsFrame.getContentPane().setBackground(new Color(r,g,b));
                    mainFrame.getContentPane().setBackground(new Color(r,g,b));
                }
                JOptionPane.showMessageDialog(settingsFrame,"<html><center><b>All Changes Saved!<br/>Note: All the changes may not apply to open windows unless you close the application and re-open it</b></center></html>","Notice",JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
    public void actionPerformed(ActionEvent e){

    }
}