import java.util.Scanner;
public class factorialrecursion
{
    static int fact(int n)
    {
         if(n<=1)
         {
            return 1;
         }
         return n*fact(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        System.out.println("The factorial of a number is: "+fact(n));
    }
}