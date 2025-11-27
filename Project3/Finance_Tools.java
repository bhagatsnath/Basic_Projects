
/**
 * Author: Bhagat Sabari Nath
 */
import java.util.*;

public class Finance_Tools {
    static Scanner sc = new Scanner(System.in);
    public void currencyConverter(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Welcome to Currency Converter: ");
        while (true) {
            System.out.println("Currency available: INR, USD, CAD, GBP, and EUR");
            System.out.println("Press 0 to Cancel");
            System.out.print("What currency are you converting from: ");
            String ucurrencyfrom = sc.next();
            String currencyfrom = ucurrencyfrom.toLowerCase();
            if (currencyfrom.equals("0")){
                break;
            }
            double currencyvalue = -1.0;
            while(true){
                System.out.print("What is the arithimetic value of the money: ");
                try{
                    currencyvalue=sc.nextDouble();
                }
                catch(Exception e){
                    sc.next();
                }
                if (currencyvalue<0){
                    System.out.println("Enter a Valid Answer!\n");
                }
                else{
                    break;
                }
            }
            if (currencyvalue==0){
                break;
            }
            System.out.print("What currency would you like to convert to: ");
            String ucurrencyto = sc.next();
            String currencyto = ucurrencyto.toLowerCase();
            if (currencyfrom.equals("inr")){
                if (currencyto.equals("inr")){
                    System.out.printf("The value in INR is ₹%.2f\n",currencyvalue);
                    System.out.println();
                }
                else if (currencyto.equals("usd")){
                    System.out.printf("The value in USD is $%.2f\n",currencyvalue*0.011);
                    System.out.println();
                }
                else if (currencyto.equals("cad")){
                    System.out.printf("The value in CAD is $%.2f\n",currencyvalue*0.016);
                    System.out.println();
                }
                else if (currencyto.equals("gbp")){
                    System.out.printf("The value in GBP is £%.2f\n",currencyvalue*0.0085);
                    System.out.println();
                }
                else if (currencyto.equals("eur")){
                    System.out.printf("The value in EUR is €%.2f\n",currencyvalue*0.0097);
                    System.out.println();
                }
                else{
                    System.out.println("That is not one of the available currencies!\n");
                }
            }
            else if (currencyfrom.equals("usd")){
                if (currencyto.equals("inr")){
                    System.out.printf("The value in INR is ₹%.2f\n",currencyvalue*89.62);
                    System.out.println();
                }
                else if (currencyto.equals("usd")){
                    System.out.printf("The value in USD is $%.2f\n",currencyvalue);
                    System.out.println();
                }
                else if (currencyto.equals("cad")){
                    System.out.printf("The value in CAD is $%.2f\n",currencyvalue*1.41);
                    System.out.println();
                }
                else if (currencyto.equals("gbp")){
                    System.out.printf("The value in GBP is £%.2f\n",currencyvalue*0.76);
                    System.out.println();
                }
                else if (currencyto.equals("eur")){
                    System.out.printf("The value in EUR is €%.2f\n",currencyvalue*0.87);
                    System.out.println();
                }
                else{
                    System.out.println("That is not one of the available currencies!\n");
                }
            }
            else if (currencyfrom.equals("cad")){
                if (currencyto.equals("inr")){
                    System.out.printf("The value in INR is ₹%.2f\n",currencyvalue*63.56);
                    System.out.println();
                }
                else if (currencyto.equals("usd")){
                    System.out.printf("The value in USD is $%.2f\n",currencyvalue*0.71);
                    System.out.println();
                }
                else if (currencyto.equals("cad")){
                    System.out.printf("The value in CAD is $%.2f\n",currencyvalue);
                    System.out.println();
                }
                else if (currencyto.equals("gbp")){
                    System.out.printf("The value in GBP is £%.2f\n",currencyvalue*0.54);
                    System.out.println();
                }
                else if (currencyto.equals("eur")){
                    System.out.printf("The value in EUR is €%.2f\n",currencyvalue*0.62);
                    System.out.println();
                }
                else{
                    System.out.println("That is not one of the available currencies!\n");
                }
            }
            else if (currencyfrom.equals("gbp")){
                if (currencyto.equals("inr")){
                    System.out.printf("The value in INR is ₹%.2f\n",currencyvalue*117.46);
                    System.out.println();
                }
                else if (currencyto.equals("usd")){
                    System.out.printf("The value in USD is $%.2f\n",currencyvalue*1.31);
                    System.out.println();
                }
                else if (currencyto.equals("cad")){
                    System.out.printf("The value in CAD is $%.2f\n",currencyvalue*1.84);
                    System.out.println();
                }
                else if (currencyto.equals("gbp")){
                    System.out.printf("The value in GBP is £%.2f\n",currencyvalue);
                    System.out.println();
                }
                else if (currencyto.equals("eur")){
                    System.out.printf("The value in EUR is €%.2f\n",currencyvalue*1.14);
                    System.out.println();
                }
                else{
                    System.out.println("That is not one of the available currencies!\n");
                }
            }
            else if (currencyfrom.equals("eur")){
                if (currencyto.equals("inr")){
                    System.out.printf("The value in INR is ₹%.2f\n",currencyvalue*103.19);
                    System.out.println();
                }
                else if (currencyto.equals("usd")){
                    System.out.printf("The value in USD is $%.2f\n",currencyvalue*1.15);
                    System.out.println();
                }
                else if (currencyto.equals("cad")){
                    System.out.printf("The value in CAD is $%.2f\n",currencyvalue*1.62);
                    System.out.println();
                }
                else if (currencyto.equals("gbp")){
                    System.out.printf("The value in GBP is £%.2f\n",currencyvalue*0.88);
                    System.out.println();
                }
                else if (currencyto.equals("eur")){
                    System.out.printf("The value in EUR is €%.2f\n",currencyvalue);
                    System.out.println();
                }
                else{
                    System.out.println("That is not one of the available currencies!\n");
                }
            }
            else{
                System.out.println("That is not one of the available currencies!\n");
            }
        }
    }

    public void loanCalculator() {
        while (true) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Welcome to Loan Calculator: ");
            System.out.println("Press 0 to Cancel");
            double principal = -1.0;
            while(true){
                System.out.print("Enter the Loan Amount: $");
                try{
                    principal=sc.nextDouble();
                }
                catch(Exception e){
                    sc.next();
                }
                if (principal<0){
                    System.out.println("Enter a Valid Answer!\n");
                }
                else{
                    break;
                }
            }
            if (principal==0){
                break;
            }
            double annualInterestRate = -1.0;
            while(true){
                System.out.print("Enter the Annual Interest Rate (in %): ");
                try{
                    annualInterestRate=sc.nextDouble();
                }
                catch(Exception e){
                    sc.next();
                }
                if (annualInterestRate<0){
                    System.out.println("Enter a Valid Answer!\n");
                }
                else{
                    break;
                }
            }
            if (annualInterestRate==0){
                break;
            }
            double years = -1.0;
            while(true){
                System.out.print("Enter the Loan Term (in years): ");
                try{
                    years=sc.nextDouble();
                }
                catch(Exception e){
                    sc.next();
                }
                if (years<0){
                    System.out.println("Enter a Valid Answer!\n");
                }
                else{
                    break;
                }
            }
            if (years==0){
                break;
            }
            double interest = (principal*(annualInterestRate/100))*years;
            double monthlyPayment = principal/(years*12);
            System.out.printf("Monthly Payments: %.2f",monthlyPayment);
            System.out.println("/month");
            System.out.printf("Total Interest Payment: $%.2f\n\n",interest);
        }

    }
    public void fuelCostCalculator() {
        while(true){
            System.out.println("-------------------------------------------------------");
            System.out.println("Welcome to Fuel Calculator: ");
            System.out.println("Press 0 to Cancel");
            double fuelEconomy = -1.0;
            while(true){
                System.out.print("Enter the Fuel Economy of your Car (in litres/100km, only enter the magnitude): ");
                try{
                    fuelEconomy = sc.nextDouble();
                }
                catch(Exception e){
                    sc.next();
                }
                if (fuelEconomy<0){
                    System.out.println("Enter a Valid Answer!\n");
                }
                else{
                    break;
                }
            }
            if (fuelEconomy==0){
                break;
            }
            double distance = -1.0;
            while(true){
                System.out.print("Enter the distance you are going to travel (in km): ");
                try{
                    distance = sc.nextDouble();
                }
                catch(Exception e){
                    sc.next();
                }
                if (distance<0){
                    System.out.println("Enter a Valid Answer!\n");
                }
                else{
                    break;
                }
            }
            if (distance==0){
                break;
            }
            double cost = -1.0;
            while(true){
                System.out.print("Enter the price per litre of fuel: $");
                try{
                    cost = sc.nextDouble();
                }
                catch(Exception e){
                    sc.next();
                }
                if (cost<0){
                    System.out.println("Enter a Valid Answer!\n");
                }
                else{
                    break;
                }
            }
            if (cost==0){
                break;
            }
            double fuelPerKm = fuelEconomy/100;
            double fuelWorth = cost*(fuelPerKm*distance);
            System.out.print("The "+distance+"km trip spent $");
            System.out.printf("%.2f",fuelWorth);
            System.out.println(" worth of fuel!");
        }
    }
}
