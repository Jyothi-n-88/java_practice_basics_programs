import java.util.Scanner;

public class palindromeoneforloop {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your String ");
        String str=sc.next().toLowerCase();
        boolean palindrome=true;
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)!= str.charAt(n-i-1))
            {
                palindrome=false;
            }
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
