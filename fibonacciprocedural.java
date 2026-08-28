import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the positive number");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.println("Fibonacci series are: ");
        for(int i=1;i<=num;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        
    }
}