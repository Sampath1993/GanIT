import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int maxDigits = 999; // Maximum number with 3 digits
        int randomNumber = random.nextInt(maxDigits) + 1; // Generating a random number
        
        int attempts = 0;
        int maxAttempts = 10; // Maximum attempts allowed
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and " + maxDigits);
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + (attempts + 1) + " attempts.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
            
            attempts++;
        }
        
        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've used all your attempts. The number was: " + randomNumber);
        }
        
        scanner.close();
    }
}
