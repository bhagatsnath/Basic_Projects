
/*
 * Author: Bhagat Sabari Nath
 */
import java.util.*;

public class Games {
    static Scanner sc = new Scanner(System.in);

    static class Game1 {
        public static void Game1Execution() {
            System.out.println("-------------------------------------------------------");
            System.out.println();
            System.out.println("Welcome to the Guess the Random Number!\n");
            while (true) {
                System.out.println(
                        "For this game, you have to guess any number between one and the level that you choose and then ");
                System.out.println("you have to guess that number within 10 tries to win. Good Luck!\n");
                System.out.println("Enter 0 to cancel\n");
                System.out.println("Easy -- guess up to 100");
                System.out.println("Medium -- guess up to 1000");
                System.out.println("Hard -- guess up to 10000");
                System.out.print("Select a level: ");
                String level = sc.next();
                if (level.equalsIgnoreCase("easy") || level.equalsIgnoreCase("e")) {
                    guess(100);
                } else if (level.equalsIgnoreCase("medium") || level.equalsIgnoreCase("m")) {
                    guess(1000);
                } else if (level.equalsIgnoreCase("hard") || level.equalsIgnoreCase("h")) {
                    guess(10000);
                } else if (level.equalsIgnoreCase("0")) {
                    System.out.println();
                    break;
                } else {
                    System.out.println("Enter a Valid Answer!\n");
                }
            }
        }

        public static void guess(double x) {
            double guess = -1.0;
            double guessLeft = 10;
            double num = (int)(Math.random() * x) + 1;
            while (true) {
                while (true) {
                    System.out.print("Guess the number: ");
                    try {
                        guess = sc.nextDouble();
                    } catch (Exception e) {
                        sc.next();
                    }
                    if (guess < 0) {
                        System.out.println("Enter a valid answer!\n");
                    } 
                    else {
                        break;
                    }
                }
                if (guess==0){
                    break;
                }
                if (guess > num) {
                        System.out.println("The Number is Lower!\n");
                        guessLeft--;
                        System.out.println("\nYou have "+guessLeft+" tries left!");
                        if (guessLeft <= 0) {
                            System.out.println("\nSorry you are out of tries!\n");
                            break;
                        }
                    } 
                else if (guess < num) {
                    System.out.println("The Number is Higher!\n");
                    guessLeft--;
                    System.out.println("\nYou have "+guessLeft+" tries left!");
                    if (guessLeft <= 0) {
                        System.out.println("\nSorry you are out of tries!\n");
                        break;
                    }
                } 
                else {
                    System.out.println("\nCongratulations, you got the number!");
                    System.out.println("You got the number in " + (10 - guessLeft) + " tries!\n");
                    break;
                }
            }
        }
    }

    static class Game2 {
        public static void Game2Execution() {
            while (true) {
                System.out.println("-------------------------------------------------------");
                System.out.println();
                System.out.println("Welcome to the Game of Dice!");
                System.out.println("Enter 0 to cancel");
                double times = -1.0;
                while (true) {
                    System.out.print("How many rounds do you want to play: ");
                    try {
                        times = sc.nextInt();
                    } catch (Exception e) {
                        sc.next();
                    }
                    if (times < 0) {
                        System.out.println("Enter a Valid Answer!\n");
                    } else {
                        break;
                    }
                }
                if (times == 0) {
                    break;
                }
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.print("What is Player 1 name: ");
                String name = sc.next();
                if (name.equals("0")) {
                    break;
                }
                run(times, name);
            }
        }

        public static String compare(int a, int b) {
            if (a == b) {
                return "Pair";
            } else if (a == b + 1 || b == a + 1) {
                return "Consecutive";
            } else {
                return "Nothing";
            }
        }

        public static void run(double x, String a) {
            Scanner sc = new Scanner(System.in);
            int pair = 0;
            int consecutive = 0;
            int roll1;
            int roll2;
            System.out.println(a + "'s Results");
            int totalPoints = dice(a, x);
            System.out.println();
            System.out.print("What is Player 2 name: ");
            String b = sc.next();
            System.out.println(b + "'s Results");
            int totalPoints2 = dice(b, x);
            System.out.println();
            if (totalPoints > totalPoints2) {
                System.out.println(a + " is the winner");
            } else if (totalPoints < totalPoints2) {
                System.out.println(b + " is the winner");
            } else {
                System.out.println("This is a tie");
            }

        }

        public static int dice(String a, double x) {
            int pair = 0;
            int consecutive = 0;
            int totalPoints;
            for (int i = 1; i <= x; i++) {
                int roll1 = (int) (Math.random() * 6) + 1;
                int roll2 = (int) (Math.random() * 6) + 1;
                String result = compare(roll1, roll2);
                System.out.print("Round#" + i + ": " + roll1 + " and " + roll2 + " ==> ");
                if (result.equals("Pair")) {
                    pair++;
                } else if (result.equals("Consecutive")) {
                    consecutive++;
                }
                System.out.println(result);
            }
            System.out.println(pair + " Pairs " + consecutive + " Consecutives ");
            totalPoints = (pair * 4) + (consecutive * 2);
            System.out.println(a + " Total Point = " + totalPoints);
            return totalPoints;
        }
    }
}
