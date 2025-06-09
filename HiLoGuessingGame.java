package highlow;

import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class HiLoGuessingGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        String restart;

        do {
            int target = random.nextInt(100) + 1;
            int guess;
            int guesses = 0;

            out.println("Welcome to Hi-Lo!");
            out.println("I'm thinking of a number between 1 and 100.");

            while (true) {
                out.print("Enter your guess: ");
                guess = keyboard.nextInt();
                guesses++;

                if (guess == target) {
                    out.println("Correct! The number was: " + target);
                    out.println("You guessed it in " + guesses + " tries.");
                    break;
                } else if (guess < target) {
                    out.println("Too low!");
                } else {
                    out.println("Too high!");
                }
            }

            out.print("Would you like to play again? (Y/N): ");
            restart = keyboard.next();
        } while (restart.equalsIgnoreCase("y"));

        out.println("Thanks for playing!");
    }
}
