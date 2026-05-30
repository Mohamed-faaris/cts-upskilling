/*
22. File Writing
• Objective: Write data to a file.
• Task: Write user input to a text file.
• Instructions:
o Prompt the user for a string.
o Write the string to a file named output.txt.
o Confirm that the data has been written.
*/

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(input);
            System.out.println("Data written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        sc.close();
    }
}