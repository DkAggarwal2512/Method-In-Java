import java.util.Scanner;

class Person {
    // Attributes
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to greet the user
    public void greet() {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}

public class Name {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Create a Person object with the provided name and age
        Person person = new Person(name, age);

        // Greet the user
        person.greet();

        // Close the scanner
        scanner.close();
    }
}


