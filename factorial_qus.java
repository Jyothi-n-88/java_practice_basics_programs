import java.util.*;
class Solution{
    public static void main(String args[])
    {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the positive number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.println("Factorial is "+fact);
    }
}