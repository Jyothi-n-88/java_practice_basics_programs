import java.util.Scanner;
class updateithbit
{
    public static int clearithbit(int n, int i)
    {
        return n & ~(1<<i);
    }
    public static int setithbit(int num,int i)
    {
        int bitmask=1<<i;
        return num | bitmask;
    }
    public static int updateithbit(int n, int i, int newbit)
    {
        if(newbit ==0)
        {
            return clearithbit(n,i);
        }
        else
        {
            return setithbit(n,i);
        }
    }
    public static void main(String args[])
    {
        System.out.print(updateithbit(14,2,1));
    }
}