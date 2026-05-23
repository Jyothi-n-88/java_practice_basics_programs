class Solution{
    static int decimalfunc(int dec_no)
    {
        int bin_no=0;
        int pow=0;
        int rem=0;
        while(dec_no>0)
        {
            rem=dec_no%2;
            bin_no=bin_no+(rem*(int)Math.pow(10,pow));
            pow++;
            dec_no/=2;
        }
        return bin_no;
    }
    public static void main(String args[])
    {
        int dec_no=8;
        int bin_no=decimalfunc(dec_no);
        System.out.println("The Decimal no. is: "+dec_no+" & The Binary no. is :"+bin_no);
    }
}