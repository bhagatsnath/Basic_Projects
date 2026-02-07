/**
 * Author: Bhagat Sabari Nath
 * Date: Jan 28, 2026
 * Project 4
 */
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class UnitConverter implements ActionListener{
    JDialog UCFrame;
    //for distance
    JTextField distanceField;
    JTextField unitToForDistance;
    JTextField unitFromForDistance;
    JTextField unitEnter1ForDistance;
    JTextField unitEnter2ForDistance;
    JTextField unitReturned1ForDistance;
    JTextField unitReturned2ForDistance;
    JButton convertForDistance;
    String distanceFrom;
    String distanceTo;
    double distanceNumInitial;
    double distanceNumFinal;

    //for mass
    JTextField massField;
    JTextField unitToForMass;
    JTextField unitFromForMass;
    JTextField unitEnter1ForMass;
    JTextField unitEnter2ForMass;
    JTextField unitReturned1ForMass;
    JTextField unitReturned2ForMass;
    JButton convertForMass;
    String massFrom;
    String massTo;
    double massNumInitial;
    double massNumFinal;

    //for fluid
    JTextField liquidField;
    JTextField unitToForLiquid;
    JTextField unitFromForLiquid;
    JTextField unitEnter1ForLiquid;
    JTextField unitEnter2ForLiquid;
    JTextField unitReturned1ForLiquid;
    JTextField unitReturned2ForLiquid;
    JButton convertForLiquid;
    String liquidFrom;
    String liquidTo;
    double liquidNumInitial;
    double liquidNumFinal;

    //for speed
    JTextField speedField;
    JTextField unitToForSpeed;
    JTextField unitFromForSpeed;
    JTextField unitEnter1ForSpeed;
    JTextField unitEnter2ForSpeed;
    JTextField unitReturned1ForSpeed;
    JTextField unitReturned2ForSpeed;
    JButton convertForSpeed;
    String speedFrom;
    String speedTo;
    double speedNumInitial;
    double speedNumFinal;

    public static void initialize(JFrame mainFrame,boolean popupAllowed, int r, int g, int b){
        new UnitConverter(mainFrame,popupAllowed,r,g,b);
    }
    public UnitConverter(JFrame mainFrame,boolean popupAllowed, int r, int g, int b){
        if (popupAllowed){
            JOptionPane.showMessageDialog(UCFrame, "<html><center><b>This Unit Converter contains many possible<br/> conversions where it features Dropboxes where you can select <br/>your desired Units and then hit Convert to show <br/>the value in the units you want to see in<br/><br/><br/><br/><br/>Developed By Bhagat Sabari Nath</b></center></html>", "Welcome to Unit Converter", JOptionPane.INFORMATION_MESSAGE);
        }
        UCFrame = new JDialog(mainFrame,"Unit Converter");
        UCFrame.setSize(610,700);
        UCFrame.getContentPane().setBackground(new Color(r,g,b));
        UCFrame.setResizable(false);
        UCFrame.setLayout(null);
        UCFrame.setLocationRelativeTo(null);
        UCFrame.setVisible(true);




        //DISTANCE:
        //distanceField settings and Positioning
        distanceField = new JTextField();
        distanceField.setBounds(30,30,250,20);
        distanceField.setEditable(false);
        distanceField.setHorizontalAlignment(JTextField.CENTER);
        distanceField.setText("Distance Conversions");
        UCFrame.add(distanceField);
        //unitFrom for distance settings and positioning
        unitFromForDistance = new JTextField();
        unitFromForDistance.setBounds(30,60,115,20);
        unitFromForDistance.setEditable(false);
        unitFromForDistance.setHorizontalAlignment(JTextField.CENTER);
        unitFromForDistance.setText("From Unit: ");
        UCFrame.add(unitFromForDistance);
        //unitTo for distance settings and positioning
        unitToForDistance = new JTextField();
        unitToForDistance.setBounds(165,60,115,20);
        unitToForDistance.setEditable(false);
        unitToForDistance.setHorizontalAlignment(JTextField.CENTER);
        unitToForDistance.setText("To Unit: ");
        UCFrame.add(unitToForDistance);
        //String[] with options for conversions
        String[]optionsForDistance = {"km","m","cm","in","ft","mi"};
        //JComboBox for unitFrom settings and positioning 
        JComboBox<String> distanceOptions1 = new JComboBox<>(optionsForDistance);
        distanceOptions1.setBounds(30,95,115,20);
        UCFrame.add(distanceOptions1);
        //JComboBox for unitTo settings and positioning 
        JComboBox<String> distanceOptions2 = new JComboBox<>(optionsForDistance);
        distanceOptions2.setBounds(165,95,115,20);
        UCFrame.add(distanceOptions2);
        //unitEnter1ForDistance setting and positioning
        unitEnter1ForDistance = new JTextField();
        unitEnter1ForDistance.setBounds(30,125,250,20);
        unitEnter1ForDistance.setEditable(false);
        unitEnter1ForDistance.setHorizontalAlignment(JTextField.CENTER);
        unitEnter1ForDistance.setText("Enter the Value of the Measurement: ");
        UCFrame.add(unitEnter1ForDistance);
        //unitEnter2ForDistance settings and positioning
        unitEnter2ForDistance = new JTextField();
        unitEnter2ForDistance.setBounds(63,155,174,20);
        unitEnter2ForDistance.setHorizontalAlignment(JTextField.CENTER);
        UCFrame.add(unitEnter2ForDistance);
        //unitReturned1ForDistance settings and positioning
        unitReturned1ForDistance = new JTextField();
        unitReturned1ForDistance.setBounds(30,185,250,20);
        unitReturned1ForDistance.setEditable(false);
        unitReturned1ForDistance.setHorizontalAlignment(JTextField.CENTER);
        unitReturned1ForDistance.setText("Converted Value:");
        UCFrame.add(unitReturned1ForDistance);
        //unitReturned2ForDistance settings and positioning
        unitReturned2ForDistance = new JTextField();
        unitReturned2ForDistance.setBounds(63,215,174,20);
        unitReturned2ForDistance.setEditable(false);
        unitReturned2ForDistance.setHorizontalAlignment(JTextField.CENTER);
        UCFrame.add(unitReturned2ForDistance);
        //convertForDistance settings and positioning
        convertForDistance = new JButton("Convert");
        convertForDistance.setBounds(100,245,100,20);
        convertForDistance.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                boolean stodSucess = true;
                try{
                    distanceNumInitial = Double.parseDouble(unitEnter2ForDistance.getText());
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(UCFrame, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                    stodSucess = false;
                }
                if (stodSucess){
                    distanceFrom = (String)distanceOptions1.getSelectedItem();
                    distanceTo = (String)distanceOptions2.getSelectedItem();
                    distanceNumFinal = distanceLogic();
                    if (distanceNumFinal>99999999999999.0){
                        DecimalFormat df = new DecimalFormat("0.###E0");
                        String distanceNumFinalS = df.format(distanceNumFinal);
                        unitReturned2ForDistance.setText(distanceNumFinalS+" "+distanceTo);
                    }
                    else{
                        unitReturned2ForDistance.setText(String.format("%.3f",distanceNumFinal)+" "+distanceTo);
                    }
                }
            }
        });
        UCFrame.add(convertForDistance);





        //For MASS
        //mass field settings and posiitoning 
        massField = new JTextField();
        massField.setBounds(330,30,250,20);
        massField.setEditable(false);
        massField.setHorizontalAlignment(JTextField.CENTER);
        massField.setText("Mass Conversions");
        UCFrame.add(massField);
        //unitFromForMass settings and positioning
        unitFromForMass = new JTextField();
        unitFromForMass.setBounds(330,60,115,20);
        unitFromForMass.setEditable(false);
        unitFromForMass.setHorizontalAlignment(JTextField.CENTER);
        unitFromForMass.setText("From Unit: ");
        UCFrame.add(unitFromForMass);
        //unitToForMass settings and positioning
        unitToForMass = new JTextField();
        unitToForMass.setBounds(465,60,115,20);
        unitToForMass.setEditable(false);
        unitToForMass.setHorizontalAlignment(JTextField.CENTER);
        unitToForMass.setText("To Unit: ");
        UCFrame.add(unitToForMass);
        //String[] with all the options
        String[] optionsForMass  = {"kg","g","mg","lb","oz"};
        //JComboBox settings and positionings
        JComboBox<String> massOptions1 = new JComboBox<>(optionsForMass);
        massOptions1.setBounds(330,95,115,20);
        UCFrame.add(massOptions1);
        JComboBox<String> massOptions2 = new JComboBox<>(optionsForMass);
        massOptions2.setBounds(465,95,115,20);
        UCFrame.add(massOptions2);
        //unitEnter1ForMass settings and positioning
        unitEnter1ForMass = new JTextField();
        unitEnter1ForMass.setBounds(330,125,250,20);
        unitEnter1ForMass.setEditable(false);
        unitEnter1ForMass.setHorizontalAlignment(JTextField.CENTER);
        unitEnter1ForMass.setText("Enter the Value of the Measurement: ");
        UCFrame.add(unitEnter1ForMass);
        //unitEnter2ForMass settings and positioning
        unitEnter2ForMass = new JTextField();
        unitEnter2ForMass.setBounds(363,155,174,20);
        unitEnter2ForMass.setHorizontalAlignment(JTextField.CENTER);
        UCFrame.add(unitEnter2ForMass);
        //unitReturned1ForMass settings and positioning
        unitReturned1ForMass = new JTextField();
        unitReturned1ForMass.setBounds(330,185,250,20);
        unitReturned1ForMass.setEditable(false);
        unitReturned1ForMass.setHorizontalAlignment(JTextField.CENTER);
        unitReturned1ForMass.setText("Converted Value: ");
        UCFrame.add(unitReturned1ForMass);
        //unitReturned2ForMass settings and positioning
        unitReturned2ForMass = new JTextField();
        unitReturned2ForMass.setBounds(363,215,174,20);
        unitReturned2ForMass.setHorizontalAlignment(JTextField.CENTER);
        UCFrame.add(unitReturned2ForMass);
        //Convert button settings and positioning
        convertForMass = new JButton("Convert");
        convertForMass.setBounds(400,245,100,20);
        convertForMass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                boolean stodSucess = true;
                try{
                    massNumInitial = Double.parseDouble(unitEnter2ForMass.getText());
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(UCFrame, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                    stodSucess = false;
                }
                if (stodSucess){
                    massFrom = (String)massOptions1.getSelectedItem();
                    massTo = (String)massOptions2.getSelectedItem();
                    massNumFinal = massLogic();
                    if (massNumFinal>99999999999999.0){
                        DecimalFormat df = new DecimalFormat("0.###E0");
                        String massNumFinalS = df.format(massNumFinal);
                        unitReturned2ForMass.setText(massNumFinalS+" "+massTo);
                    }
                    else{
                        unitReturned2ForMass.setText(String.format("%.3f",massNumFinal)+" "+massTo);
                    }
                }
            }
        });
        UCFrame.add(convertForMass);





        //For Liquid
        //LiquidField Settings and positioning
        liquidField = new JTextField();
        liquidField.setBounds(30,350,250,20);
        liquidField.setEditable(false);
        liquidField.setHorizontalAlignment(JTextField.CENTER);
        liquidField.setText("Fluid Volume Conversions");
        UCFrame.add(liquidField);
        //unitFrom settings and positioning
        unitFromForLiquid = new JTextField();
        unitFromForLiquid.setBounds(30,380,115,20);
        unitFromForLiquid.setEditable(false);
        unitFromForLiquid.setHorizontalAlignment(JTextField.CENTER);
        unitFromForLiquid.setText("From Unit: ");
        UCFrame.add(unitFromForLiquid);
        //unitToForLiquid settings and positioning
        unitToForLiquid = new JTextField();
        unitToForLiquid.setBounds(165,380,115,20);
        unitToForLiquid.setEditable(false);
        unitToForLiquid.setHorizontalAlignment(JTextField.CENTER);
        unitToForLiquid.setText("To Unit: ");
        UCFrame.add(unitToForLiquid);
        //String[] with options for conversions
        String[] optionsForLiquid = {"L","mL","fluid oz","cup","gallon"};
        //JComboBox for unitFrom settings and psoitioning
        JComboBox<String> liquidOptions1 = new JComboBox<>(optionsForLiquid);
        liquidOptions1.setBounds(30,415,115,20);
        UCFrame.add(liquidOptions1);
        //JComboBox for unitTo settings and positioning
        JComboBox<String> liquidOptions2 = new JComboBox<>(optionsForLiquid);
        liquidOptions2.setBounds(165,415,115,20);
        UCFrame.add(liquidOptions2);
        //unitEnter1ForLiquid setting and positioning
        unitEnter1ForLiquid = new JTextField();
        unitEnter1ForLiquid.setBounds(30,445,250,20);
        unitEnter1ForLiquid.setEditable(false);
        unitEnter1ForLiquid.setHorizontalAlignment(JTextField.CENTER);
        unitEnter1ForLiquid.setText("Enter the Value of the Measurement: ");
        UCFrame.add(unitEnter1ForLiquid);
        //unitEnter2ForLiquid settings and positioning
        unitEnter2ForLiquid = new JTextField();
        unitEnter2ForLiquid.setBounds(63,475,174,20);
        unitEnter2ForLiquid.setHorizontalAlignment(JTextField.CENTER);
        UCFrame.add(unitEnter2ForLiquid);
        //unitReturned1ForLiquid settings and positioning
        unitReturned1ForLiquid = new JTextField();
        unitReturned1ForLiquid.setBounds(30,505,250,20);
        unitReturned1ForLiquid.setEditable(false);
        unitReturned1ForLiquid.setHorizontalAlignment(JTextField.CENTER);
        unitReturned1ForLiquid.setText("Converted Value:");
        UCFrame.add(unitReturned1ForLiquid);
        //unitReturned2ForLiquid settings and positioning
        unitReturned2ForLiquid = new JTextField();
        unitReturned2ForLiquid.setBounds(63,535,174,20);
        unitReturned2ForLiquid.setEditable(false);
        unitReturned2ForLiquid.setHorizontalAlignment(JTextField.CENTER);
        UCFrame.add(unitReturned2ForLiquid);
        //convertForLiquid settings and psoitioning
        convertForLiquid = new JButton("Convert");
        convertForLiquid.setBounds(100,565,100,20);
        convertForLiquid.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                boolean stodSucess = true;
                try{
                    liquidNumInitial = Double.parseDouble(unitEnter2ForLiquid.getText());
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(UCFrame, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                    stodSucess = false;
                }
                if (stodSucess){
                    liquidFrom = (String)liquidOptions1.getSelectedItem();
                    liquidTo = (String)liquidOptions2.getSelectedItem();
                    liquidNumFinal = liquidLogic();
                    if (liquidNumFinal!=1&&(liquidTo.equals("cup")||liquidTo.equals("gallon"))){
                        liquidTo = liquidTo+"s";
                    }
                    if (liquidNumFinal>999999999.0){
                        DecimalFormat df = new DecimalFormat("0.###E0");
                        String liquidNumFinalS = df.format(liquidNumFinal);
                        unitReturned2ForLiquid.setText(liquidNumFinalS+" "+liquidTo);
                    }
                    else{
                        unitReturned2ForLiquid.setText(String.format("%.3f",liquidNumFinal)+" "+liquidTo);
                    }
                }
            }
        });
        UCFrame.add(convertForLiquid);



        //For Speed
        //speedField settings and positioning
        speedField = new JTextField();
        speedField.setBounds(330,350,250,20);
        speedField.setEditable(false);
        speedField.setHorizontalAlignment(JTextField.CENTER);
        speedField.setText("Speed Conversions");
        UCFrame.add(speedField);
        //unitFromForSpeed settings and positioning
        unitFromForSpeed = new JTextField();
        unitFromForSpeed.setBounds(330,380,115,20);
        unitFromForSpeed.setEditable(false);
        unitFromForSpeed.setHorizontalAlignment(JTextField.CENTER);
        unitFromForSpeed.setText("From Unit: ");
        UCFrame.add(unitFromForSpeed);
        //unitToForSpeed settings and postioning
        unitToForSpeed = new JTextField();
        unitToForSpeed.setBounds(465,380,115,20);
        unitToForSpeed.setEditable(false);
        unitToForSpeed.setHorizontalAlignment(JTextField.CENTER);
        unitToForSpeed.setText("To Unit: ");
        UCFrame.add(unitToForSpeed);
        //String[] with options for conversions
        String[] optionsForSpeed = {"km/h","m/s","mph","ft/s","kn"};
        //JComboBox settings and positioning
        JComboBox<String> speedOptions1 = new JComboBox<>(optionsForSpeed);
        speedOptions1.setBounds(330,415,115,20);
        UCFrame.add(speedOptions1);
        //JComboBox settings and positioning
        JComboBox<String> speedOptions2 = new JComboBox<>(optionsForSpeed);
        speedOptions2.setBounds(465,415,115,20);
        UCFrame.add(speedOptions2);
        //unitEnter1ForSpeed settings and positioning
        unitEnter1ForSpeed = new JTextField();
        unitEnter1ForSpeed.setBounds(330,445,250,20);
        unitEnter1ForSpeed.setEditable(false);
        unitEnter1ForSpeed.setHorizontalAlignment(JTextField.CENTER);
        unitEnter1ForSpeed.setText("Enter the Value of the Measurement: ");
        UCFrame.add(unitEnter1ForSpeed);
        //unitEnter2ForSpeed settings and positioning
        unitEnter2ForSpeed = new JTextField();
        unitEnter2ForSpeed.setBounds(363,475,174,20);
        unitEnter2ForSpeed.setHorizontalAlignment(JTextField.CENTER);
        UCFrame.add(unitEnter2ForSpeed);
        //unitReturned1ForSpeed settings and positioning
        unitReturned1ForSpeed = new JTextField();
        unitReturned1ForSpeed.setBounds(330,505,250,20);
        unitReturned1ForSpeed.setEditable(false);
        unitReturned1ForSpeed.setHorizontalAlignment(JTextField.CENTER);
        unitReturned1ForSpeed.setText("Converted Value: ");
        UCFrame.add(unitReturned1ForSpeed);
        //unitReturned2ForSpeed settings and positioning
        unitReturned2ForSpeed = new JTextField();
        unitReturned2ForSpeed.setBounds(363,535,174,20);
        unitReturned2ForSpeed.setEditable(false);
        unitReturned2ForSpeed.setHorizontalAlignment(JTextField.CENTER);
        UCFrame.add(unitReturned2ForSpeed);
        //convertForSpeed settings and positioning
        convertForSpeed = new JButton("Convert");
        convertForSpeed.setBounds(400,565,100,20);
        convertForSpeed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                boolean stodSucess = true;
                try{
                    speedNumInitial = Double.parseDouble(unitEnter2ForSpeed.getText());
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(UCFrame,"Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                    stodSucess = false;
                }
                if (stodSucess){
                    speedFrom = (String)speedOptions1.getSelectedItem();
                    speedTo = (String)speedOptions2.getSelectedItem();
                    speedNumFinal = speedLogic();
                    if (speedNumFinal>999999999.0){
                        DecimalFormat df = new DecimalFormat("0.###E0");
                        String speedNumFinalS = df.format(speedNumFinal);
                        unitReturned2ForSpeed.setText(speedNumFinalS+" "+speedTo);
                    }
                    else{
                        unitReturned2ForSpeed.setText(String.format("%.3f",speedNumFinal)+" "+speedTo);
                    }
                }
            }
        });
        UCFrame.add(convertForSpeed);


    }
    public double distanceLogic(){
        if (distanceFrom.equals("km")){
            if (distanceTo.equals("km")){
                return distanceNumInitial;
            }
            else if (distanceTo.equals("m")){
                return distanceNumInitial*1000;
            }
            else if (distanceTo.equals("cm")){
                return distanceNumInitial*100000;
            }
            else if (distanceTo.equals("in")){
                return distanceNumInitial*39370.079;
            }
            else if (distanceTo.equals("ft")){
                return distanceNumInitial*3280.84;
            }
            else if (distanceTo.equals("mi")){
                return distanceNumInitial*0.62;
            }
            else{
                return 0;
            }
        }
        else if (distanceFrom.equals("m")){
            if (distanceTo.equals("km")){
                return distanceNumInitial*0.001;
            }   
            else if (distanceTo.equals("m")){
                return distanceNumInitial;
            }
            else if (distanceTo.equals("cm")){
                return distanceNumInitial*100;
            }
            else if (distanceTo.equals("in")){
                return distanceNumInitial*39.37;
            }
            else if (distanceTo.equals("ft")){
                return distanceNumInitial*3.28;
            }
            else if (distanceTo.equals("mi")){
                return distanceNumInitial*0.00062;
            }
            else{
                return 0;
            }
        }
        else if (distanceFrom.equals("cm")){
            if (distanceTo.equals("km")){
                return distanceNumInitial*0.00001;
            }
            else if (distanceTo.equals("m")){
                return distanceNumInitial*0.01;
            }
            else if (distanceTo.equals("cm")){
                return distanceNumInitial;
            }
            else if (distanceTo.equals("in")){
                return distanceNumInitial*0.39;
            }
            else if (distanceTo.equals("ft")){
                return distanceNumInitial*0.033;
            }
            else if (distanceTo.equals("mi")){
                return distanceNumInitial*0.0000062;
            }
            else{
                return 0;
            }
        }
        else if (distanceFrom.equals("in")){
            if (distanceTo.equals("km")){
                return distanceNumInitial*0.000025;
            }
            else if (distanceTo.equals("m")){
                return distanceNumInitial*0.025;
            }
            else if (distanceTo.equals("cm")){
                return distanceNumInitial*2.54;
            }
            else if (distanceTo.equals("in")){
                return distanceNumInitial;
            }
            else if (distanceTo.equals("ft")){
                return distanceNumInitial*0.083;
            }
            else if (distanceTo.equals("mi")){
                return distanceNumInitial*0.000016;
            }
            else{
                return 0;
            }
        }
        else if (distanceFrom.equals("ft")){
            if (distanceTo.equals("km")){
                return distanceNumInitial*0.0003048;
            }
            else if (distanceTo.equals("m")){
                return distanceNumInitial*0.3048;
            }
            else if (distanceTo.equals("cm")){
                return distanceNumInitial*30.48;
            }
            else if (distanceTo.equals("in")){
                return distanceNumInitial*12;
            }
            else if (distanceTo.equals("ft")){
                return distanceNumInitial;
            }
            else if (distanceTo.equals("mi")){
                return distanceNumInitial*0.00019;
            }
            else{
                return 0;
            }
        }
        else if (distanceFrom.equals("mi")){
            if (distanceTo.equals("km")){
                return distanceNumInitial*1.61;
            }
            else if (distanceTo.equals("m")){
                return distanceNumInitial*1609.34;
            }
            else if (distanceTo.equals("cm")){
                return distanceNumInitial*160934.4;
            }
            else if (distanceTo.equals("in")){
                return distanceNumInitial*63360;
            }
            else if (distanceTo.equals("ft")){
                return distanceNumInitial*5280;
            }
            else if (distanceTo.equals("mi")){
                return distanceNumInitial;
            }
            else{
                return 0;
            }
        }
        else{
                return 0;
            }
    }
    public double massLogic(){
        if (massFrom.equals("kg")){
            if (massTo.equals("kg")){
                return massNumInitial;
            }
            else if (massTo.equals("g")){
                return massNumInitial*1000;
            }
            else if (massTo.equals("mg")){
                return massNumInitial*1000000;
            }
            else if (massTo.equals("lb")){
                return massNumInitial*2.2;
            }
            else if (massTo.equals("oz")){
                return massNumInitial*35.27;
            }
            else{
                return 0;
            }
        }
        else if (massFrom.equals("g")){
            if (massTo.equals("kg")){
                return massNumInitial*0.001;
            }
            else if (massTo.equals("g")){
                return massNumInitial;
            }
            else if (massTo.equals("mg")){
                return massNumInitial*1000;
            }
            else if (massTo.equals("lb")){
                return massNumInitial*0.0022;
            }
            else if (massTo.equals("oz")){
                return massNumInitial*0.035;
            }
            else{
                return 0;
            }
        }
        else if (massFrom.equals("mg")){
            if (massTo.equals("kg")){
                return massNumInitial*0.000001;
            }
            else if (massTo.equals("g")){
                return massNumInitial*0.001;
            }
            else if (massTo.equals("mg")){
                return massNumInitial;
            }
            else if (massTo.equals("lb")){
                return massNumInitial*0.0000022;
            }
            else if (massTo.equals("oz")){
                return massNumInitial*0.000035;
            }
            else{
                return 0;
            }
        }
        else if (massFrom.equals("lb")){
            if (massTo.equals("kg")){
                return massNumInitial*0.45359237;
            }
            else if (massTo.equals("g")){
                return massNumInitial*453.59237;
            }
            else if (massTo.equals("mg")){
                return massNumInitial*453592.37;
            }
            else if (massTo.equals("lb")){
                return massNumInitial;
            }
            else if (massTo.equals("oz")){
                return massNumInitial*16;
            }
            else{
                return 0;
            }
        }
        else if (massFrom.equals("oz")){
            if (massTo.equals("kg")){
                return massNumInitial*0.028;
            }
            else if (massTo.equals("g")){
                return massNumInitial*28.35;
            }
            else if (massTo.equals("mg")){
                return massNumInitial*28349.52;
            }
            else if (massTo.equals("lb")){
                return massNumInitial*0.062;
            }
            else if (massTo.equals("oz")){
                return massNumInitial;
            }
            else{
                return 0;
            }
        }
        else{
            return 0;
        }
    }
    public double liquidLogic(){
        if (liquidFrom.equals("L")){
            if (liquidTo.equals("L")){
                return liquidNumInitial;
            }
            else if (liquidTo.equals("mL")){
                return liquidNumInitial*1000;
            }
            else if (liquidTo.equals("fluid oz")){
                return liquidNumInitial*33.81;
            }
            else if (liquidTo.equals("cup")){
                return liquidNumInitial*4.23;
            }
            else if (liquidTo.equals("gallon")){
                return liquidNumInitial*0.26;
            }
            else{
                return 0;
            }
        }
        else if (liquidFrom.equals("mL")){
            if (liquidTo.equals("L")){
                return liquidNumInitial*0.001;
            }
            else if (liquidTo.equals("mL")){
                return liquidNumInitial;
            }
            else if (liquidTo.equals("fluid oz")){
                return liquidNumInitial*0.034;
            }
            else if (liquidTo.equals("cup")){
                return liquidNumInitial*0.0042;
            }
            else if (liquidTo.equals("gallon")){
                return liquidNumInitial*0.00026;
            }
            else{
                return 0;
            }
        }
        else if (liquidFrom.equals("fluid oz")){
            if (liquidTo.equals("L")){
                return liquidNumInitial*0.03;
            }
            else if (liquidTo.equals("mL")){
                return liquidNumInitial*29.54;
            }
            else if (liquidTo.equals("fluid oz")){
                return liquidNumInitial;
            }
            else if (liquidTo.equals("cup")){
                return liquidNumInitial*0.12;
            }
            else if (liquidTo.equals("gallon")){
                return liquidNumInitial*0.0078;
            }
            else{
                return 0;
            }
        }
        else if (liquidFrom.equals("cup")){
            if (liquidTo.equals("L")){
                return liquidNumInitial*0.24;
            }
            else if (liquidTo.equals("mL")){
                return liquidNumInitial*236.59;
            }
            else if (liquidTo.equals("fluid oz")){
                return liquidNumInitial*8;
            }
            else if (liquidTo.equals("cup")){
                return liquidNumInitial;
            }
            else if (liquidTo.equals("gallon")){
                return liquidNumInitial*0.062;
            }
            else{
                return 0;
            }
        }
        else if (liquidFrom.equals("gallon")){
            if (liquidTo.equals("L")){
                return liquidNumInitial*3.79;
            }
            else if (liquidTo.equals("mL")){
                return liquidNumInitial*3785.41;
            }
            else if (liquidTo.equals("fluid oz")){
                return liquidNumInitial*128;
            }
            else if (liquidTo.equals("cup")){
                return liquidNumInitial*16;
            }
            else if (liquidTo.equals("gallon")){
                return liquidNumInitial;
            }
            else{
                return 0;
            }
        }
        else{
            return 0;
        }
    }
    public double speedLogic(){
        if (speedFrom.equals("km/h")){
            if (speedTo.equals("km/h")){
                return speedNumInitial;
            }
            else if (speedTo.equals("m/s")){
                return speedNumInitial*0.27777777777777778;
            }
            else if (speedTo.equals("mph")){
                return speedNumInitial*0.62;
            }
            else if (speedTo.equals("ft/s")){
                return speedNumInitial*0.91;
            }
            else if (speedTo.equals("kn")){
                return speedNumInitial*0.54;
            }
            else{
                return 0;
            }
        }
        else if (speedFrom.equals("m/s")){
            if (speedTo.equals("km/h")){
                return speedNumInitial*3.6;
            }
            else if (speedTo.equals("m/s")){
                return speedNumInitial;
            }
            else if (speedTo.equals("mph")){
                return speedNumInitial*2.24;
            }
            else if (speedTo.equals("ft/s")){
                return speedNumInitial*3.28;
            }
            else if (speedTo.equals("kn")){
                return speedNumInitial*1.94;
            }
            else{
                return 0;
            }
        }
        else if (speedFrom.equals("mph")){
            if (speedTo.equals("km/h")){
                return speedNumInitial*1.61;
            }
            else if (speedTo.equals("m/s")){
                return speedNumInitial*0.45;
            }
            else if (speedTo.equals("mph")){
                return speedNumInitial;
            }
            else if (speedTo.equals("ft/s")){
                return speedNumInitial*1.47;
            }
            else if (speedTo.equals("kn")){
                return speedNumInitial*0.87;
            }
            else{
                return 0;
            }
        }
        else if (speedFrom.equals("ft/s")){
            if (speedTo.equals("km/h")){
                return speedNumInitial*1.097;
            }
            else if (speedTo.equals("m/s")){
                return speedNumInitial*0.3;
            }
            else if (speedTo.equals("mph")){
                return speedNumInitial*0.68;
            }
            else if (speedTo.equals("ft/s")){
                return speedNumInitial;
            }
            else if (speedTo.equals("kn")){
                return speedNumInitial*0.59;
            }
            else{
                return 0;
            }
        }
        else if (speedFrom.equals("kn")){
            if (speedTo.equals("km/h")){
                return speedNumInitial*1.85;
            }
            else if (speedTo.equals("m/s")){
                return speedNumInitial*0.51;
            }
            else if (speedTo.equals("mph")){
                return speedNumInitial*1.15;
            }
            else if (speedTo.equals("ft/s")){
                return speedNumInitial*1.69;
            }
            else if (speedTo.equals("kn")){
                return speedNumInitial;
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
