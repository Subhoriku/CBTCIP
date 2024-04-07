import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxNumber = 100; 
        int attempts = 5; 
        int score = 0;

        
        while (true) {
            
            int randomNumber = random.nextInt(maxNumber) + 1;

            System.out.println("Guess the number between 1 and " + maxNumber + " (Attempts: " + attempts + ")");

            
            boolean guessedCorrectly = false;
            for (int i = 0; i < attempts; i++) {
                int guess = scanner.nextInt();

                if (guess == randomNumber) {
                    guessedCorrectly = true;
                    score++; 
                    System.out.println("Congratulations! You guessed the number in " + (i + 1) + " attempts.");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Your guess is too low. Try again!");
                } else {
                    System.out.println("Your guess is too high. Try again!");
                }
            }
            if (!guessedCorrectly) {
                System.out.println("You ran out of attempts. The number was " + randomNumber);
            }
            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing! Your final score is: " + score);
                break;
            }

            
            attempts = 5;
            score = 0;
        }

        scanner.close();
    }
}
