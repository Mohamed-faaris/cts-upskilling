/*
25. HashMap Example
• Objective: Use key-value pairs.
• Task: Map student IDs to names.
• Instructions:
o Create a HashMap with Integer keys and String values.
o Allow the user to add entries.
o Retrieve and display a name based on an entered ID.
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();
        while (true) {
            System.out.print("1 to add student, 2 to retrieve name, 0 to exit: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    studentMap.put(id, name);
                    break;
                case 2:
                    System.out.print("Enter student ID to retrieve name: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();
                    String retrievedName = studentMap.get(searchId);
                    if (retrievedName != null) {
                        System.out.println("Student Name: " + retrievedName);
                    } else {
                        System.out.println("No student found with ID: " + searchId);
                    }
                    break;
                case 0:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}