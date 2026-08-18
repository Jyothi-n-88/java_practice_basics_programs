//Ques: Keep Entering the numbers till the user enters a multiple of 10

import java.util.*;
class javabasics 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        do
        {
            System.out.println("Enter your number");
            num=sc.nextInt();
            if(num%10==0)
            {
                break;
            }
            System.out.println(num);
        }
        while(true); //(OR) while (num % 10 != 0); -> No need of if and break
        System.out.println("You have entered a multiple of 10 so the loop got broke");
    }
}