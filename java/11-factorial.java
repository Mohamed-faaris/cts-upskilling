/*
11. Factorial Calculator
• Objective: Use loops to perform repetitive calculations.
• Task: Calculate the factorial of a number entered by the user.
• Instructions:
o Prompt the user for a non-negative integer.
o Use a for loop to calculate the factorial.
o Display the result.
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            System.out.print("Invalid input");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.print("Factorial: " + factorial);
        }
        sc.close();
    }
}