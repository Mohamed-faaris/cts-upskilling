/*
28. Stream API
• Objective: Process collections using streams.
• Task: Filter and display even numbers from a list.
• Instructions:
o Create a List of integers.
o Use the Stream API to filter even numbers.
o Collect and display the result.
*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(evenNumbers);
    }
}