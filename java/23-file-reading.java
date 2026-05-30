/*
23. File Reading
• Objective: Read data from a file.
• Task: Read and display the contents of output.txt.
• Instructions:
o Open output.txt for reading.
o Read each line and display it on the console.
*/
import java.io.*;
class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {    
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}