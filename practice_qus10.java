//Qus:Write a Java method to compute the sum of the digits in an integer.
import java.util.Scanner;
public class Digitsum {

    public static int sum(int num)
    {
        int sum=0;
        while(num>0)
        {
          int lastdigit=num%10;
          sum+=lastdigit;
          num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Sum of digits entered ---");
        System.out.print("Enter a number to get a sum of their digits: ");
        
        int Number = scanner.nextInt();
        System.out.println("The sum of the entered number digits is:"+sum(Number));
        scanner.close();
    }
}