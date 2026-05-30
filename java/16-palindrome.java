/*
16. Palindrome Checker
• Objective: Combine string manipulation and conditional logic.
• Task: Check if a string is a palindrome.
• Instructions:
o Prompt the user for a string.
o Remove any non-alphanumeric characters and convert to lowercase.
o Check if the string reads the same forwards and backwards.
o Display the result.
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        if (cleaned.equals(reversed)) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not a Palindrome");
        }
        sc.close();
    }
}