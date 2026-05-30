/*
27. Lambda Expressions
• Objective: Use functional programming features.
• Task: Sort a list of strings using a lambda expression.
• Instructions:
o Create a List of strings.
o Use Collections.sort() with a lambda to sort the list.
o Display the sorted list.
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
        Collections.sort(names, (a, b) -> a.length() - b.length());
        System.out.println(names);
    }
}