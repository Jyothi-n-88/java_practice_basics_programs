import java.util.Scanner;
class clearithbit
{
    public static int clearithbit(int n, int i)
    {
        return n & ~(1<<i);
    }
    public static void main(String args[])
    {
        System.out.print(clearithbit(7,2));
    }
}