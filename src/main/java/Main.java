/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean playAgain = true;   //setting playAgain to "true".

        while (playAgain) {     //A play again loop. (Taken from WordGuess)
            playGame(scanner);

            System.out.print("Would you like to play again? (yes/no): ");
            String playChoice = scanner.next();
            playAgain = playChoice.equalsIgnoreCase("yes");     //if user inputs "yes".
        }

        System.out.println("\nThanks for playing Too Large Too Small the Guessing Game!");     //if user inputs "no".
        scanner.close();

    }
    public static void playGame(Scanner scanner){

        int randNum = (int)(Math.random() * 100) + 1;   //finds random number.
        int userGuess = 0;  //users guess.
        int numTries = 0;   //number of tries user takes to guess number.

        System.out.println("Welcome to Too Large Too Small the Guessing Game! Guess a number " +
                "between 1 and 100");

        while (userGuess != randNum) {
            System.out.println("Enter your guess: ");
            userGuess = scanner.nextInt();
            numTries++;
            System.out.println("Attempt #" + numTries);     //shows user how many attempts its taken them.
            if (userGuess < randNum) {
                System.out.println("-=----------------=-\nToo Small! Try again!\n-=----------------=-");
            } else if (userGuess > randNum) {
                System.out.println("-=----------------=-\nToo Big! Try again!\\n-=----------------=-\"");
            }
        }

        System.out.println("Congratulations! You have guessed the correct number: " + randNum);
        System.out.println("It took you " + numTries + " tries to find the number!\n");
    }
}
