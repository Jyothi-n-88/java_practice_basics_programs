//Time Complexity:O(n)
//Space Complexity:O(n)
import java.util.Scanner;
public class Fibonaccirecursion
{
    static int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter number");
       int n=sc.nextInt();
       System.out.println("The Fibonacci Sum: "+fib(n));
    }
}