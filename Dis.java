import java.util.Scanner;

class DistanceCalculator {
    // Method to calculate the distance between two points
    public double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

public class Dis {
    public static void main(String[] args) {
        // Create a DistanceCalculator object
        DistanceCalculator distanceCalculator = new DistanceCalculator();

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first coordinate
        System.out.print("Enter the x-coordinate of the first point: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = scanner.nextDouble();

        // Prompt the user for the second coordinate
        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = scanner.nextDouble();

        // Calculate the distance between the two points
        double distance = distanceCalculator.calculateDistance(x1, y1, x2, y2);

        // Display the distance
        System.out.println("The distance between the two points is: " + distance);

        // Close the scanner
        scanner.close();
    }
}