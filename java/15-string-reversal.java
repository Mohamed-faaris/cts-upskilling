/*
15. String Reversal
• Objective: Manipulate strings.
• Task: Reverse a string entered by the user.
• Instructions:
o Prompt the user for a string.
o Use a loop or StringBuilder to reverse the string.
o Display the reversed string.
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder reversed0 = new StringBuilder(input).reverse();
        String reversed1 = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed1 += input.charAt(i);
        }
        System.out.println("Reversed (StringBuilder): " + reversed0);
        System.out.println("Reversed (Loop): " + reversed1); 
        sc.close();
    }
}