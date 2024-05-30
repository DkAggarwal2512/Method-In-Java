import java.util.Scanner;

class Rectangle {
    // Attributes
    double length;
    double breadth;

    // Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area
    public double calculateArea() {
        return length * breadth;
    }

    // Method to display the area
    public void displayArea() {
        double area = calculateArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}

public class Rect {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the length
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Prompt the user for the breadth
        System.out.print("Enter the breadth (or width) of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Create a Rectangle object with the provided length and breadth
        Rectangle rectangle = new Rectangle(length, breadth);

        // Display the area of the rectangle
        rectangle.displayArea();

        // Close the scanner
        scanner.close();
    }
}
