/*
20. Try-Catch Example
• Objective: Handle exceptions gracefully.
• Task: Handle division by zero using try-catch.
• Instructions:
o Prompt the user for two integers.
o Attempt to divide the first by the second.
o Catch any ArithmeticException and display an appropriate message.
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Cannot divide by zero");
        }
        sc.close();
    }
}