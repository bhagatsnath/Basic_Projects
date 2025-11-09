/**
 * Author: Bhagat Sabari Nath
 */
import java.util.*;
public class Smartphone_Info_Page{
    // Scanner for reading input from System.in
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        // Print a blank line for spacing, then a welcome header.
        System.out.println();
        System.out.println("Welcome to Smartphone Info Page: ");
        // Main interactive loop: ask user for a brand name and dispatch
        // to the appropriate handler. The loop continues until the
        // user types "STOP" (case-insensitive).
        while (true){
            System.out.println("----------------------------------------------------------------");
            System.out.print("Enter the Name of the Smartphone Brand (Type STOP to Stop the Program): ");
            // Read the next token from input and convert to lower-case
            String nameCase = sc.next();
            String name = nameCase.toLowerCase();
            // Local variables left here (not used directly in this method)
            double price;
            double tax;
            double subtotal;
            // Dispatch based on the user's input
            if (name.equals("apple")){
                // Enter Apple menu
                apple();
                System.out.println();
            }
            else if (name.equals("samsung")){
                // Enter Samsung menu
                samsung();
                System.out.println();
            }
            else if (name.equals("stop")){
                // Graceful exit
                System.out.println();
                System.out.println("Please Visit us Again!!");
                break;
            }
            else{
                // Unrecognized input; prompt again
                System.out.println("Please choose again: ");
                System.out.println();
            }
        }

    }
    public static void apple(){
        // Create an Apple helper object which contains methods that
        // print information about each Apple model.
        Apple apple = new Apple();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Welcome to Apple");
        // Loop until the user chooses to exit the Apple menu
        while (true){
            System.out.println("1. iPhone 16");
            System.out.println("2. iPhone 16 Plus");
            System.out.println("3. iPhone 16 Pro");
            System.out.println("4. iPhone 16 Pro Max");
            System.out.println("Press -1 to exit Apple");
            String option = "0";
            System.out.print("Please choose one of the options from above: ");
            option = sc.next();
            if (option.equals("1")){
                // Show iPhone 16 info
                System.out.println("----------------------------------------------------------------");
                apple.apple_iPhone16();
            }
            else if  (option.equals("2")){
                // Show iPhone 16 Plus info
                System.out.println("----------------------------------------------------------------");
                apple.apple_iPhone16Plus();
            }
            else if (option.equals("3")){
                // Show iPhone 16 Pro info
                System.out.println("----------------------------------------------------------------");
                apple.apple_iPhonePro();
            }
            else if (option.equals("4")){
                // Show iPhone 16 Pro Max info
                System.out.println("----------------------------------------------------------------");
                apple.apple_iPhone16ProMax();
            }
            else if (option.equals("-1")){
                // Exit back to main menu
                break;
            }
            else{
                // Invalid choice for Apple menu
                System.out.println("Please choose again!");
                System.out.println();
            }
        }
    }
    public static void samsung(){
        // Create a Samsung helper object that prints Samsung model info
        Samsung samsung = new Samsung();
        System.out.println("Welcome to Samsung");
        // Loop until the user exits the Samsung menu
        while (true){
            System.out.println("1. Samsung Galaxy S25 Ultra");
            System.out.println("2. Samsung Galaxy S25");
            System.out.println("3. Samsung Galaxy S25 Plus");
            System.out.println("Press -1 to exit Samsung");
            String option = "0";
            System.out.print("Please choose one of the options from above: ");
            option = sc.next();
            if (option.equals("1")){
                // Show Galaxy S25 Ultra info
                System.out.println("----------------------------------------------------------------");
                samsung.samsung_galaxys25Ultra();
            }
            else if  (option.equals("2")){
                // Show Galaxy S25 info
                System.out.println("----------------------------------------------------------------");
                samsung.samsung_galaxys25();
            }
            else if (option.equals("3")){
                // Show Galaxy S25 Plus info
                System.out.println("----------------------------------------------------------------");
                samsung.samsung_galaxys25Plus();
            }
            else if (option.equals("-1")){
                // Exit back to main menu
                break;
            }
            else{
                // Invalid choice for Samsung menu
                System.out.println("Please choose again!");
                System.out.println();
            }
        }
    }
    
}