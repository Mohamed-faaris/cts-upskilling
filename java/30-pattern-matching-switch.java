/*
30. Pattern Matching for switch (Java 21)
• Objective: Simplify conditional logic with pattern matching in enhanced switch expressions.
• Task: Determine the type of an object and respond accordingly.
• Instructions:
o Create a method that accepts Object as input.
o Use a switch expression to check if the object is Integer, String, Double, etc.
o Print a message based on the object’s type.
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Object obj = "Hello, World!";
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer: " + i);
            case String s -> System.out.println("It's a String: " + s);
            case Double d -> System.out.println("It's a Double: " + d);
            default -> System.out.println("Unknown type");
        };
    }
}