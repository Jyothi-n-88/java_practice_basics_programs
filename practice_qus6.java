//Write a Java method to compute the average of three numbers..
import java.util.Scanner;
public class AverageCalculator {

    public static double computeAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Average Calculator ---");

        // Prompt the user for the three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Call the method with the user's input
        double result = computeAverage(num1, num2, num3);

        // Display the result
        System.out.println("The average is: " + result); 

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}