import java.util.Scanner;
public class Functions
{
    public static int fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
           fact*=i;
        }
        return fact;
    }
    public static int binomialcoff(int n,int r)//function definition
    {
        int a=fact(n);//function calling
        int b=fact(r);
        int c=fact(n-r);
        return a/(b*c);
    }
    public static void main(String args[])
    {
       int binomial_coff=binomialcoff(10,5);//function calling
       System.out.println("The result of binomial coefficient is: "+binomial_coff);
    }
}