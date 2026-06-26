/*Write a method named isEven that accepts an int argument.The method should return true if the argument is even, or false otherwise.
Also write a program to test your method.*/
import java.util.Scanner;

public class EvenChecker {

    public static boolean isEven(int number) {
        // The modulo operator (%) returns the remainder of division.
        // If a number divided by 2 has a remainder of 0, it is even.
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Even Number Checker ---");
        System.out.print("Enter an integer to test: ");
        
        // Capture the user's input
        int testNumber = scanner.nextInt();

        // Call the isEven method and store the boolean result
        boolean result = isEven(testNumber);

        // Display the result based on the boolean value returned
        if (result) {
            System.out.println(testNumber + " is an even number.");
        } else {
            System.out.println(testNumber + " is an odd number.");
        }

        // Close the scanner
        scanner.close();
    }
}