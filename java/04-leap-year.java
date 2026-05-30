
/*
4. Leap Year Checker
• Objective: Apply nested conditional logic.
• Task: Check if a given year is a leap year.
• Instructions:
o Prompt the user to enter a year.
o A year is a leap year if it's divisible by 4 but not by 100, unless it's also divisible by 400.
o Display the result accordingly.
*/
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.print("Leap Year");
        } else {
            System.out.print("Not a Leap Year");
        }
        sc.close();
    }
}