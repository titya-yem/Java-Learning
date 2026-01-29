package NumberGuessingGame;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // random number always change
        final byte random = (byte) Math.round((Math.random() * 100));
        System.out.println("Please enter a number 1-100");

        while (true) {
            System.out.print("Enter your guess: ");
            byte guess = scanner.nextByte();

            // Validation
            if (guess < 1 || guess > 100)
                System.out.println("Please enter a number 1-100 only.");
            // Guessing game
            else if (guess == random) {
                System.out.println("Congratulations, number is: " + guess);
                break; // break out of the loop
            }
            else if (guess > random)
                System.out.println("Please, try smaller value.");
            else
                System.out.println("Please, try bigger value.");
        }
    }
}
