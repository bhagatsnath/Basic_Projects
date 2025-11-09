/**
 * Author: Bhagat Sabari Nath
 */
import java.util.*;
public class PriceConverter {
    public void priceConverter(double price){
        // Create a Scanner to read console input from the user
        Scanner sc = new Scanner(System.in);
        while (true){
            // Ask whether the user wants to see converted prices
            System.out.println("Would you like to see the prices in other currencies ");
            System.out.print("Press y for yes and n for no): ");
            String ans = sc.next();
            if (ans.equals("y")){
                // If yes, present the currency menu
                System.out.println("What currency would you like to convert to");
                while (true){
                    String ans2;
                    // Menu options for available currencies
                    System.out.println("1. INR");
                    System.out.println("2. EUR");
                    System.out.println("3. GBP");
                    System.out.println("Press -1 to cancel");
                    System.out.print("Choose one of the options: ");
                    String ans1 = sc.next();
                    if (ans1.equals("1")){
                        // Convert USD -> INR using a fixed multiplier
                        System.out.printf("The Price (INR): ₹%.2f\n",price*88.64);
                        System.out.println();
                        while (true){
                            // After showing conversion, ask if user wants another
                            System.out.print("Would you like to convert to another currency (y/n): ");
                            ans2 = sc.next();
                            if (ans2.equals("y")){
                                break;
                            }
                            else if (ans2.equals("n")){
                                break;
                            }
                            else{
                                // Invalid reply; re-prompt
                                System.out.println("Please answer again!");
                                System.out.println();
                            }
                        }
                        if (ans2.equals("n")){
                            break;
                        }
                    }
                    else if (ans1.equals("2")){
                        // Convert USD -> EUR using a fixed multiplier
                        System.out.printf("The Price (EUR): €%.2f\n",price*0.86);
                        System.out.println();
                        while (true){
                            // Ask again whether to perform another conversion
                            System.out.print("Would you like to convert to another currency (y/n): ");
                            ans2 = sc.next();
                            if (ans2.equals("y")){
                                break;
                            }
                            else if (ans2.equals("n")){
                                break;
                            }
                            else{
                                System.out.println("Please answer again!");
                                System.out.println();
                            }
                        }
                        if (ans2.equals("n")){
                            break;
                        }
                    }
                    else if (ans1.equals("3")){
                        // Convert USD -> GBP using a fixed multiplier
                        System.out.printf("The Price (GBP): £%.2f\n",price*0.76);
                        System.out.println();
                        while (true){
                            // Same follow-up prompt after GBP conversion
                            System.out.print("Would you like to convert to another currency (y/n): ");
                            ans2 = sc.next();
                            if (ans2.equals("y")){
                                break;
                            }
                            else if (ans2.equals("n")){
                                break;
                            }
                            else{
                                System.out.println("Please answer again!");
                                System.out.println();
                            }
                        }
                        if (ans2.equals("n")){
                            break;
                        }
                    }
                    else if (ans1.equals("-1")){
                        // User cancelled out of currency menu
                        break;
                    }
                    else{
                        // Invalid menu choice; prompt again
                        System.out.println("Please choose again");
                        System.out.println();
                    }
                }
                break;
            }
            else if (ans.equals("n")){
                break;
            }
            else{
                // Invalid top-level answer; prompt again
                System.out.println("Please enter your answer again ");
                System.out.println();
            }
        }
        System.out.println();
    }
}
