/**
 * Author: Bhagat Sabari Nath
 */
import java.util.*;
public class Tool_Shop {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        while (true){
            System.out.println("Welcome to the Tool Shop!");
            Login log = new Login();
            String x = log.login();
            if (x.equals("success")){
                tool_Workspace();
            }
            else if (x.equals("locked")){
                break;
            }
            else {
                end();
                break;
            }
        }
        
    }
    public static void tool_Workspace(){
        System.out.println("Welcome to the Tool Workspace");
        System.out.println("There are several categories to choose from: ");
        while(true){
            System.out.println("-------------------------------------------------------");
            System.out.println();
            System.out.println("1. Math tools");
            System.out.println("2. Finance tools");
            System.out.println("3. Games");
            System.out.println("Please choose one of the options above with the Corresponding Number");
            System.out.print("Enter your choice (Enter 0 to cancel): ");
            String ans = sc.next();
            if (ans.equals("1")){
                System.out.println();
                mathToolsExecution();
            }
            else if (ans.equals("2")){
                System.out.println();
                financeToolsExecution();
            }
            else if (ans.equals("3")){
                System.out.println();
                gamesExecution();
            }
            else if (ans.equals("0")){
                System.out.println();
                break;
            }
            else{
                System.out.println("Please answer again! ");
                System.out.println();
                System.out.println("-------------------------------------------------------");
            }
        }
    }
    public static void mathToolsExecution(){
        Math_Tools math = new Math_Tools();
        while (true){
            System.out.println("-------------------------------------------------------");
            System.out.println("Which Math Tool would you like: ");
            System.out.println("1. Units Converter");
            System.out.println("2. Roots Calculator");
            System.out.println("3. Volume Calculator");
            System.out.println("4. Area Calculator");
            System.out.println("Please choose one of the options above with the Coresponding Number");
            System.out.print("Enter your Choice (Press 0 to cancel): ");
            String option = sc.next();
            if (option.equals("1")){
                math.Unit_Converter();
                System.out.println();
            }
            else if (option.equals("2")){
                math.rootsCalculator();
                System.out.println();
                
            }
            else if (option.equals("3")){
                math.volumeCalculator();
                System.out.println();

            }
            else if (option.equals("4")){
                math.areaCalculator();
                System.out.println();
            }
            else if (option.equals("0")){
                System.out.println();
                break;
            }
            else{
                System.out.println("Please answer again! ");
                System.out.println();
                System.out.println("-------------------------------------------------------");
            }
        }
    }
    public static void financeToolsExecution(){
        Finance_Tools finance = new Finance_Tools();
        while(true){
            System.out.println("-------------------------------------------------------");
            System.out.println("Which Finance Tool would you like: ");
            System.out.println("1. Currency Converter");
            System.out.println("2. Loan Calculator");
            System.out.println("3. Fuel Cost Calculator");
            System.out.println("Please choose one of the options above with the Coresponding Number");
            System.out.print("Enter your Choice (Press 0 to cancel): ");
            String option = sc.next();
            if (option.equals("1")){
                finance.currencyConverter();
                System.out.println();
            }
            else if (option.equals("2")){
                finance.loanCalculator();
                System.out.println();
            }
            else if(option.equals("3")){
                finance.fuelCostCalculator();
                System.out.println();
            }
            else if (option.equals("0")){
                System.out.println();
                break;
            }
            else{
                System.out.println("Please answer again! ");
                System.out.println();
                System.out.println("-------------------------------------------------------");
            }
        }
    }
    public static void gamesExecution(){
        while (true){
            System.out.println("-------------------------------------------------------");
            System.out.println("Which Game would you like: ");
            System.out.println("1. Guess the Random Number");
            System.out.println("2. Dice Game");
            System.out.println("Please choose one of the options above with the Coresponding Number");
            System.out.print("Enter your Choice (Press 0 to cancel): ");
            String option = sc.next();
            if (option.equals("1")){
                Games.Game1.Game1Execution();
                System.out.println();
            }
            else if (option.equals("2")){
                Games.Game2.Game2Execution();
                System.out.println();
            }
            else if (option.equals("0")){
                System.out.println();
                break;
            }
            else{
                System.out.println("Please answer again! ");
                System.out.println();
                System.out.println("-------------------------------------------------------");
            }
        }
    }
    public static void end(){
        System.out.println();
        System.out.println("Please Visit Us Again");
    }
}
