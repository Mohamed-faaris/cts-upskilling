/*
2. Simple Calculator
• Objective: Practice arithmetic operations and user input.
• Task: Develop a calculator that performs addition, subtraction, multiplication, and division.
• Instructions:
o Prompt the user to enter two numbers.
o Ask the user to choose an operation.
o Display the result of the operation.
*/
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.nextLine();
        String sy = sc.nextLine().trim();

        switch (sy) {
            case "+" -> System.out.print(a + b);
            case "-" -> System.out.print(a - b);
            case "*" -> System.out.print(a * b);
            case "/" -> {
                if (b == 0) {
                    System.out.print("Cannot divide by zero");
                } else {
                    System.out.print(a / b);
                }
            }
            case "%" -> {
                if (b == 0) {
                    System.out.print("Cannot divide by zero");
                } else {
                    System.out.print(a % b);
                }
            }
            default -> System.out.print("Invalid operation");
        }

        sc.close();
    }
}