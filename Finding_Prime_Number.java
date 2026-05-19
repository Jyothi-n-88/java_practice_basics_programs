import java.util.Scanner;

class JavaBasics 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        // A flag to keep track of our result. We assume it is true until proven false.
        boolean isPrime = true;
        
        // 0, 1, and negative numbers are mathematically not prime
        if (num <= 1) 
        {
            isPrime = false;
        } 
        else 
        {
            // We only need to check from 2 up to the square root of the number
            for (int i = 2; i <= Math.sqrt(num); i++) 
            {
                if (num % i == 0) 
                {
                    isPrime = false; // We found a divisor, so it's not prime
                    break;           // Stop the loop instantly
                }
            }
        }
        
        // Print the final result based on the flag
        if (isPrime) 
        {
            System.out.println(num + " is a prime number.");
        } 
        else 
        {
            System.out.println(num + " is NOT a prime number.");
        }
        
        sc.close();
    }
}