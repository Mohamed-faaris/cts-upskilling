/*
21. Custom Exception
• Objective: Create and use custom exceptions.
• Task: Define a custom exception InvalidAgeException.
• Instructions:
o Throw InvalidAgeException if the user's age is less than 18.
o Catch the exception and display a message.
*/
import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(int age) {
        super("InvalidAgeException: Age cannot be less than 18. Provided age: " + age);
    }
}


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException(age);
            } else {
                System.out.println("Valid age: " + age);
            }       
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}