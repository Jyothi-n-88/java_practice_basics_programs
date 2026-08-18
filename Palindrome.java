import java.util.Scanner;

public class Palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your String ");
        String str=sc.next();
        boolean palindrome=true;
        int i=0;
        int j=(str.length())-1;
        while(i < j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                palindrome=false;
                break;
            }

            i++;
            j--;
        }
        if(palindrome)
        {
           System.out.println("Palindrome");
        }
            
        else
        {
            System.out.println("Not a Palindrome");
        }
            
        sc.close();
    }
}
