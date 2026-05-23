import java.util.*;
class Solution{
    
    static int binary (int bin_no)
    {
        int dec_no=0;
        int last_digit;
        int pow=0;
        while(bin_no>0)
        {
            last_digit=bin_no%10;
            dec_no=dec_no+(last_digit*(int)Math.pow(2,pow));
            pow++;
            bin_no/=10;
        }
        return dec_no;
    }
    public static void main(String args[])
    {
        int bin_no=1111;
        int dec_no=binary(bin_no);
        System.out.println("The Binary no. is: "+bin_no+" & The Decimal no. is :"+dec_no);
    }
}