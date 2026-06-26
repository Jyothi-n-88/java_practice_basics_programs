//Qus:Write a Java program to check if a number is a palindrome in Java?
import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number mathematically
        while (number > 0) {
            // 1. Get the last digit
            int remainder = number % 10;
            
            // 2. Append the digit to the reversed number
            reversedNumber = (reversedNumber * 10) + remainder;
            
            // 3. Remove the last digit from the original number
            number = number / 10;
        }

        // Check if the reversed number matches the original
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker ---");
        System.out.print("Enter a number to check: ");
        
        int testNumber = scanner.nextInt();

        if (isPalindrome(testNumber)) {
            System.out.println(testNumber + " is a palindrome.");
        } else {
            System.out.println(testNumber + " is NOT a palindrome.");
        }

        scanner.close();
    }
}