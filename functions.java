import java.util.Scanner;
public class Functions
{

    public static int sum_calculation(int num1,int num2)//function definition
    {
        return num1+num2;
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number1 :");
       int a=sc.nextInt();
       System.out.print("Enter number2 :");
       int b=sc.nextInt();
       int sum=sum_calculation(a,b);//function calling
       System.out.println("The sum is 2 numbers is: "+sum);
    }
}