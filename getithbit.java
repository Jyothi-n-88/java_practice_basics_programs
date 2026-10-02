import java.util.Scanner;
class bit_manipulation
{
    public static int getithbit(int num,int i)
    {
        int bitmask=1<<i;
        if((num & bitmask)==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your number: ");
         int num=sc.nextInt();
         System.out.println("Enter the ith bit : ");
         int i=sc.nextInt();
         System.out.println(getithbit(num,i));
    }
}