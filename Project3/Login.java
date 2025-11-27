import java.util.Scanner;

/**
 * Author: Bhagat Sabari Nath
 */
import java.util.*;
public class Login {
    static Login log = new Login();
    static Scanner sc = new Scanner(System.in);
    String password = null;
    static String[] username = new String[50];
    static String[] passwords = new String[50];
    int position;
    int incorrectInfo = 0;
    static {
        username[0] = "bhagatsnath";
        username[1] = "bhagatnath2009";
        username[2] = "bhagatcodes24";
        username[3] = "bhagatcompiles";
        username[4] = "---------------";
        passwords[0] = "password1";
        passwords[1] = "password2";
        passwords[2] = "password3";
        passwords[3] = "password4";
    }

    public String login(){
        while (true){
            System.out.print("Do you have a Tool Shop Account (y/n): ");
            String ans = sc.next();
            if (ans.equals("y")){
                String x = log.Account_True();
                while (true){
                    if (x.equals("success")){
                        return "success";
                    }
                    else if (x.equals("ca")){
                        String y = log.Account_False();
                        if (y.equals("no")){
                            return "cancel";
                        }
                        x = log.Account_True();
                    }
                    else if (x.equals("locked")){
                        return "locked";
                    }
                    else{
                        return "cancel";
                    }
                }
            }
            else if (ans.equals("n")){
                while (true){
                    System.out.print("Would you like to Create an account with us (y/n): ");
                    String ans1 = sc.next();
                    if (ans1.equals("y")){
                        String y = log.Account_False();
                        if (y.equals("no")){
                            return "cancel";
                        }
                        String x = log.Account_True();
                        while (true){
                            if (x.equals("success")){
                                return "success";
                            }
                            else if (x.equals("locked")){
                                return "locked";
                            }
                            else if (x.equals("ca")){
                                y = log.Account_False();
                                if (y.equals("no")){
                                    return "cancel";
                                }
                                x = log.Account_True();
                            }
                            else{
                                return "cancel";
                            }
                        }
                    }
                    else if (ans1.equals("n")){
                        System.out.println();
                        return "cancel";
                    }
                    else{
                        System.out.println("Enter a Valid Answer\n");
                    }
                }
            }
            else if (ans.equals("0")){
                System.out.println();
                return "cancel";
            }
            else{
                System.out.println("Enter a Valid Answer");
                System.out.println("-------------------------------------------------------");
            }
        }
    }

    public String Account_False(){
        System.out.println();
        System.out.println("Press 0 to cancel");
        System.out.print("Enter your name: ");
        String name = sc.next();
        if (name.equals("0")){
            return "no";
        }
        System.out.println("Here are the Steps into Creating an Account,"+name+": ");
        System.out.println();
        System.out.print("Enter a Username: ");
        String username1 = sc.next();
        if (username1.equals("0")){
            return "no";
        }
        System.out.println();
        while (true){
            System.out.print("Enter a Password: ");
            password = sc.next();
            if (password.equals("0")){
                return "no";
            }
            System.out.print("Confirm your Pasword: ");
            String cpassword = sc.next();
            if (cpassword.equals("0")){
                return "no";
            }
            if (cpassword.equals(password)){
                username[4] = username1;
                passwords[4] = password;
                System.out.println("You will be sent to the login page now ");
                System.out.println();
                return "ok";
            }
            else{
                System.out.println("The passwords do not match: ");
                System.out.println();
            }
        }

    }
    public String Account_True(){
        while (incorrectInfo<4){
            System.out.println("Login Details: ");
            System.out.println("Press -1 to Create a new Account");
            System.out.println("Press 0 to cancel");
            System.out.print("Username: "); 
            String enterUsername = sc.next();
            if (enterUsername.equals("-1")){
                return "ca";
            }
            else if (enterUsername.equals("0")){
                return "cancel";
            }
            System.out.print("Password: ");
            String enterPassword = sc.next();
            if (enterPassword.equals("-1")){
                return "ca";
            }
            else if (enterPassword.equals("0")){
                return "cancel";
            }
            if (usernameDatabase(enterUsername)==true){
                for (int i = 0; i < username.length; i++) {
                    if (username[i].equalsIgnoreCase(enterUsername)) {
                        position = i;
                        break;
                    }
                }
                if (passwordDatabase(enterPassword,position)==true){
                    System.out.println("Login Sucessfull!");
                    System.out.println();
                    return "success";
                }
                else{
                    System.out.println("Password Incorrect!");
                    incorrectInfo++;
                    System.out.println("You have "+(4-incorrectInfo)+" more attempts");
                    System.out.println("-------------------------------------------------------");
                }
            }
            else{
                System.out.println("Username Not Found!");
                incorrectInfo++;
                System.out.println("You have "+(4-incorrectInfo)+" more attempts");
                System.out.println("-------------------------------------------------------");
            }
        }
        String incorrectInfoResult = locked(incorrectInfo);
        return incorrectInfoResult;
    }
    public boolean usernameDatabase(String s){
        if (username[0].equals(s)){
            return true;
        }
        else if (username[1].equals(s)){
            return true;
        }
        else if (username[2].equals(s)){
            return true;
        }
        else if (username[3].equals(s)){
            return true;
        }
        else if (username[4].equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean passwordDatabase(String s, int i){
        if (passwords[i].equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
    public String locked(int x){
        System.out.println("You have entered the Username/Password wrong "+x+" times!");
        System.out.println("Please Try Again Later!");
        return "locked";
    }

}
