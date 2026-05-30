/*
24. ArrayList Example
• Objective: Use dynamic arrays.
• Task: Manage a list of student names.
• Instructions:
o Create an ArrayList to store names.
o Allow the user to add names to the list.
o Display all names entered.
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        OUTER:
        while (true) {
            System.out.print("1 to add name, 2 to display names, 0 to exit: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    names.add(name);
                    break;
                case 2:
                    System.out.println("Names:");
                    for (String curentName : names) {
                        System.out.println(curentName);
                    }   break;
                case 0:
                    break OUTER;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        sc.close();
    }
}