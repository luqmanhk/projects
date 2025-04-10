// Luqman Kabiru
// 3/24/2025
// CSC111
// Problem Set #4
//
// This program will create a game that helps elementary students learn basic arithmetic, like addition,
// subtraction, and multiplication.

import java.util.*;
// to be able to use all classes

// MAKE SURE TO COMMIT AND WRITE COMMENTS AFTER EVERY LINE OF CODE
public class ArithmeticQuiz {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // for all user input
        System.out.println("Arithmetic Quiz");
        // creating title of the program
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        // equal and minus signs for unique designs to the eye and separating the title from the prompt
        System.out.print("Enter the minimum of the range: ");
        // asking the user to enter the minimum number in their range
        int min = console.nextInt();
        System.out.print("Enter the maximum of the range: ");
        // asking the user to enter the max number in their range
        int max = console.nextInt();
        Random rand = new Random();
        /*
        int randomNumber = rand.nextInt(min, max + 1);
        int randomNumber2 = rand.nextInt(min, max + 1);
        // this is to be able to randomly pick two numbers in the range to use to make equations
        int randomOperator = rand.nextInt(1, 4);
        // using numbers to generate random operators either +, -, x
        */
        int num = 0;
        // initializing num for q1, q2, q3, ...

        boolean game = true;

        while (game) {
            int randomNumber = rand.nextInt(min, max + 1);
            int randomNumber2 = rand.nextInt(min, max + 1);
            // this is to be able to randomly pick two numbers in the range to use to make equations
            int randomOperator = rand.nextInt(1, 4);
            // using numbers to generate random operators either +, -, x
            if (randomOperator == 1) {
                num = num + 1;
                // created an if statement so that when a random number is generated, the operator assigned to that number will be used
                int answer = (randomNumber + randomNumber2);
                System.out.print("Q" + num + ": What is " + randomNumber + " + " + randomNumber2 + "? ");
                // this is the question that should be repeated every time the user gets the answer right
                // this is the correct answer
                int product = console.nextInt();
                // the user's answer
                if (product == answer) {
                    // another if statement within the main if statement to figure out whether the user is right or wrong
                    System.out.println("That's correct!");
                    // outputs correct
                }
                else {
                    // else statement if user is wrong
                    System.out.println("Oops... the correct answer is " + answer);
                    // output for wrong answer
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("You answered " + num + " questions correctly!");
                    break;
                }
            }
            else if (randomOperator == 2) {
                num = num + 1;
                System.out.print("Q" + num + ": What is " + randomNumber + " - " + randomNumber2 + "? ");
                // this is the question that should be repeated every time the user gets the answer right
                int answer = (randomNumber - randomNumber2);
                // this is the correct answer
                int product = console.nextInt();
                // the user's answer
                if (product == answer) {
                    // another if statement within the main if statement to figure out whether the user is right or wrong
                    System.out.println("That's correct!");
                    // outputs correct
                }
                else {
                    // else statement if user is wrong
                    System.out.println("Oops... the correct answer is " + answer);
                    // output for wrong answer
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("You answered " + num + " questions correctly!");
                    break;
                }
            }
            else if (randomOperator == 3) {
                num = num + 1;
                System.out.print("Q" + num + ": What is " + randomNumber + " x " + randomNumber2 + "? ");
                // this is the question that should be repeated every time the user gets the answer right
                int answer = (randomNumber * randomNumber2);
                // this is the correct answer
                int product = console.nextInt();
                // the user's answer
                if (product == answer) {
                    // another if statement within the main if statement to figure out whether the user is right or wrong
                    System.out.println("That's correct!");
                    // outputs correct
                }
                else {
                    // else statement if user is wrong
                    System.out.println("Oops... the correct answer is " + answer);
                    // output for wrong answer
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("You answered " + (num - 1) + " questions correctly!");
                    break;
                }
            }
        }
    }
}
