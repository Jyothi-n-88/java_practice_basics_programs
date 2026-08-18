//Qus: Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;
class javabasics 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,choice;
        int evenNum=0;
        int oddNum=0;
        do
        {
            System.out.println("Enter your number");
            num=sc.nextInt();
            if (num%2==0) {
                evenNum+=num;
            }
            else
            {
                oddNum+=num;
            }
            System.out.println("Enter (1) to continue entering number and (0) to exit");
            choice=sc.nextInt();
        } 
        while(choice==1);
        System.out.println("Sum of even numbers are:" +evenNum);
        System.out.println("Sum of odd numbers are:" +oddNum);
    }
}