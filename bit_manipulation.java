import java.util.Scanner;
class bit_manipulation
{
    public static void oddoreven(int num)
    {
        if((num & 1)==0)
        {
            System.out.println("The Number is even");
        }
        else
        {
            System.out.println("The Number is odd");
        }
    }
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your number: ");
         int num=sc.nextInt();
         oddoreven(num);
    }
}