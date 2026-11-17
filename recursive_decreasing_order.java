class recursive_decreasing_order
{
    public static void printInc(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return ;
        }
        System.out.println(n);
         printInc(n-1);
    }
    public static void main(String[] args)
    {
        int n=5;
        printInc(n);
    }
}