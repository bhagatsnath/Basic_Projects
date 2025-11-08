/**
 * Author: Bhagat Sabari Nath
 * Project 1: iStore
 * Date: Sept 26, 2025
 */
import java.util.*;
public class Project1
{
    public static Scanner sc = null;
    public static void main(String[]args)
    {
        sc = new Scanner(System.in);
        String name = null;
        
        String email1 = ("bhagat.s.nath@gmail.com");
        String email2 = ("bhagatcompiles@gmail.com");
        String email3 = ("bhagatbestprogrammer@gmail.com");
        String email4 = null;
        
        String password1 = ("bugattichiron1");
        String password2 = ("bugatti2");
        String password3 = ("bugatti3");
        String password4 = null;
        
        System.out.println("Welcome to iStore");
        System.out.println("Best Quality Porducts ever!!!!");
        boolean run = true;
        while (run){
        System.out.println();
        System.out.print("Do you have an iAccount. Press y for yes and n for no: ");
        String y = sc.nextLine();
        if (y.equals("y")){
             run = false;
        }
        else if (y.equals("n")){
            boolean runs = true;
            while (runs){
            System.out.println();
            System.out.println("Here are the Steps to create an iAccount");
            System.out.print("Enter your Full Name: ");
            name = sc.nextLine();
            System.out.print("Enter your email address: ");
            email4 = sc.nextLine();
            System.out.print("Enter a Password: ");
            password4 = sc.nextLine();
            System.out.print("Confirm your password: ");
            String cpassword = sc.nextLine();
            if (password4.equals(cpassword)){
                System.out.println("Thank you for making an iAccount");
                System.out.println("You will be sent to the Login Page");
                runs = false;
                run = false;
            }
            else{
                System.out.println("The passwords do not match");
            }
           }
        }
        else{
            System.out.println("Neither yes nor no");
        }
    }
        
        
        
        boolean running = true;
        
        while (running){
        System.out.println("Enter Login details: ");
        System.out.print("Email Address: ");
        String email = sc.nextLine();
        System.out.println();
        System.out.print("Password: ");
        String password = sc.nextLine();
        System.out.println();
        if (email.equals(email1) && password.equals(password1)){
            System.out.println("Welcome back, Bhagat Sabari Nath");
            initialize();
        }
        else if (email.equals(email2) && password.equals(password2)){
            System.out.println("Welcome back, Bhagat Compiles"); 
            initialize();
        }
        else if (email.equals(email3) && password.equals(password3)){
             System.out.println("Welcome back, Bhagat Best Programmer");
             initialize();
        }
        else if (email.equals(email4) && password.equals(password4)){
            System.out.println("Welcome, "+name);
            initialize();
        }
        else{
             System.out.println("Incorrect Email Address or Password");
             System.out.println();
             System.out.println();
        }
    
        
    }
}
public static void initialize(){           
             System.out.println("This is iStore");
             System.out.println("What would you like to buy from the options below? ");
             System.out.println("1 iPhone 17 Pro");
             System.out.println("2 iPhone 17 Pro Max");
             System.out.println("3 iPhone 17");
             System.out.println("4 iPhone Air");
             System.out.println("5 M4 Macbook Air");
             System.out.println("6 M4 Macbook Pro");
             System.out.print("Enter the number alongside the product you want: ");
             double a = sc.nextInt();
             double num1 = 1;
             double num2 = 2;
             double num3 = 3;
             double num4 = 4;
             double num5 = 5;
             double num6 = 6;
             if (a ==num1){
                 System.out.println("Product: iPhone 17 Pro");
                 System.out.println("Price: $1600");
                 System.out.print("How many of this product do you want: ");
                 double q = sc.nextInt();
                 System.out.printf("Subtotal: $%.2f",(1600*q));
                 System.out.println();
                 System.out.printf("Tax: $%.2f",(1600*q*0.13));
                 System.out.println();
                 System.out.printf("Total: $%.2f",(1600*q*1.13));
                 System.out.println();
                 System.out.println();
                 System.out.println();
             }
             else if (a==num2){
                 System.out.println("Product: iPhone 17 Pro Max");
                 System.out.println("Price: $1900");
                 System.out.print("How many of this product do you want: ");
                 double q = sc.nextInt();
                 System.out.printf("Subtotal: $%.2f",(1900*q));
                 System.out.println();
                 System.out.printf("Tax: $%.2f",(1900*q*0.13));
                 System.out.println();
                 System.out.printf("Total: $%.2f",(1900*q*1.13));
                 System.out.println();
                 System.out.println();
                 System.out.println();
             }
             else if (a==num3){
                 System.out.println("Product: iPhone 17");
                 System.out.println("Price: $1100");
                 System.out.print("How many of this product do you want: ");
                 double q = sc.nextInt();
                 System.out.printf("Subtotal: $%.2f",(1100*q));
                 System.out.println();
                 System.out.printf("Tax: $%.2f",(1100*q*0.13));
                 System.out.println();
                 System.out.printf("Total: $%.2f",(1100*q*1.13));
                 System.out.println();
                 System.out.println();
                 System.out.println();
             }
             else if (a==num4){
                 System.out.println("Product: iPhone Air");
                 System.out.println("Price: $1400");
                 System.out.print("How many of this product do you want: ");
                 double q = sc.nextInt();
                 System.out.printf("Subtotal: $%.2f",(1400*q));
                 System.out.println();
                 System.out.printf("Tax: $%.2f",(1400*q*0.13));
                 System.out.println();
                 System.out.printf("Total: $%.2f",(1400*q*1.13));
                 System.out.println();
                 System.out.println();
                 System.out.println();
             }
             else if (a==num5){
                 System.out.println("Product: M4 Macbook Air");
                 System.out.println("Price: $2200");
                 System.out.print("How many of this product do you want: ");
                 double q = sc.nextInt();
                 System.out.printf("Subtotal: $%.2f",(2200*q));
                 System.out.println();
                 System.out.printf("Tax: $%.2f",(2200*q*0.13));
                 System.out.println();
                 System.out.printf("Total: $%.2f",(2200*q*1.13));
                 System.out.println();
                 System.out.println();
                 System.out.println();
             }
             else if (a==num6){
                 System.out.println("Product: M4 Macbook Pro");
                 System.out.println("Price: $3200");
                 System.out.print("How many of this product do you want: ");
                 double q = sc.nextInt();
                 System.out.printf("Subtotal: $%.2f",(3200*q));
                 System.out.println();
                 System.out.printf("Tax: $%.2f",(3200*q*0.13));
                 System.out.println();
                 System.out.printf("Total: $%.2f",(3200*q*1.13));
                 System.out.println();
                 System.out.println();
                 System.out.println();
             }
             else{
                 System.out.println("Invalid Product");
                 System.out.println();
                 System.out.println();
             }
}
}
