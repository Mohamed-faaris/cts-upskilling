/*
29. Records
• Objective: Use the record keyword for immutable data structures (Java 16+).
• Task: Create a record to represent a Person with name and age.
• Instructions:
o Define a record named Person.
o Create instances and print them.
o Use records in a List and filter based on age using Streams.
*/

import java.util.*;

public record Person(String name, int age) {
        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
}

class Main {
    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        System.out.println(p);

        List<Person> people = List.of(
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("Dave", 20)
        );
        List<Person> adults = people.stream().filter(person -> person.age() >= 30).toList();
        System.out.println(adults);
    }
}