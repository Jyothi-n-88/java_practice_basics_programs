class Patterns
{
    public static void main(String args[])
    {
        char ch='A';
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Inverted pattern");
        System.out.println();
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--)//(or) for(int j=1;j<=n-i+1;j++) where n is the total no. of line pattern(n=4)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //half pyramid pattern
         for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        //Character Pattern
         for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}