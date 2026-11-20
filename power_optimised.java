class power_optimised
{
    public static int powerfunc_optimised(int x,int n)
    {
         if(n==0)
         {
            return 1;
         }
         int halfpower= powerfunc_optimised(x,n/2);
         int halfpowerSqr=halfpower*halfpower;
         if(n%2!=0)
         {
            return x*halfpowerSqr;
         }
         return halfpowerSqr;
    }
    public static void main(String args[])
    {
        System.out.print(powerfunc_optimised(2,5));
    }
}