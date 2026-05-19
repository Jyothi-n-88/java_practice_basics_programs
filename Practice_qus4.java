//Ques: Display all numbers entered by user except multiples of 10

import java.util.*;
class javabasics 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        while(true)
        {
            System.out.println("Enter your number (or -1 to quit)");
            num=sc.nextInt();
            if (num == -1) {
                break;
            }
            if(num%10==0)
            {
                continue;
            }
            System.out.println("The number is :"+num);
        } 
    }
}