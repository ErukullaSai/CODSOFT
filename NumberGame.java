import java.util.Random;
import java.util.Scanner;
//TASK-1 of CODSOFT
//Number Game
public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //random class is used to give the random numbers
        Random random = new Random();
        boolean guessAgain = true;

        while (guessAgain) {
            int targetNumber = random.nextInt(100) + 1; 
            int attempts = 0;
            int maxAttempts = 10;// user can have to guess before completing max attemots
            boolean hasGuessedCorrectly = false;

            System.out.println("I have selected a number between 1 and 100. Can you guess it?");
            
            while (attempts < maxAttempts && !hasGuessedCorrectly) {
                System.out.println("Attempt " + (attempts + 1) + " of " + maxAttempts + ": Enter your guess:");
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess == targetNumber) {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the number correctly in " + attempts + " attempts.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've used all attempts. The correct number was: " + targetNumber);
            }

            System.out.println("Would you like to play again? (yes/no)");
            String userResponse = scanner.next();
            guessAgain = userResponse.equalsIgnoreCase("yes");
            //Another string
            if (guessAgain) {
                System.out.println("Starting a new round...");
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}