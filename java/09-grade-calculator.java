/*
9. Grade Calculator
• Objective: Use conditional statements to determine grades.
• Task: Assign grades based on marks entered by the user.
• Instructions:
o Prompt the user for marks out of 100.
o Use if-else statements to assign grades:
▪ 90-100: A
▪ 80-89: B
▪ 70-79: C
▪ 60-69: D
▪ Below 60: F
o Display the assigned grade.
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks > 100 || marks < 0) {
            System.out.print("Invalid marks");
        } else if (marks >= 90) {
            System.out.print("Grade: A");
        } else if (marks >= 80) {
            System.out.print("Grade: B");
        } else if (marks >= 70) {
            System.out.print("Grade: C");
        } else if (marks >= 60) {
            System.out.print("Grade: D");
        } else {
            System.out.print("Grade: F");
        }
        sc.close();
    }
}