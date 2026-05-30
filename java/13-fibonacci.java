
/*
13. Recursive Fibonacci
• Objective: Implement recursion.
• Task: Calculate the nth Fibonacci number using recursion.
• Instructions:
o Prompt the user for a positive integer n.
o Define a recursive method fibonacci(int n) that returns the nth Fibonacci number.
o Display the result.
*/
import java.util.*;

class Main {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.print("Invalid input");
        } else {
            System.out.print("Fibonacci: " + fibonacci(n));
        }
        sc.close();
    }
}