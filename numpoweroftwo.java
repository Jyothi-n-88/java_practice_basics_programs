public class numpoweroftwo
{
    static boolean checknumpowoftwo(int n)
    {
        return (n & (n-1)) == 0;
    }
    public static void main(String args[])
    {
        System.out.println(checknumpowoftwo(16));
    }
}