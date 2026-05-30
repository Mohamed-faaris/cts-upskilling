/*
10. Number Guessing Game
• Objective: Implement loops and conditional logic.
• Task: Create a game where the user guesses a randomly generated number.
• Instructions:
o Generate a random number between 1 and 100.
o Prompt the user to guess the number.
o Provide feedback if the guess is too high or too low.
o Continue until the user guesses correctly.
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        while(numberOfTries < 6) {
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            numberOfTries++;
            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed the number in " + numberOfTries + " tries.");
                break;
            }
        }
    }
}