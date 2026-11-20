class power
{
    public static int powerfunc(int x,int n)
    {
         if(n==0)
         {
            return 1;
         }
         return x*powerfunc(x,n-1);
    }
    public static void main(String args[])
    {
        System.out.print(powerfunc(2,10));
    }
}