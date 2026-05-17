import java.util.*;
class tax{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Income :");
        int income=sc.nextInt();
        double tax;
        if(income<500000)
        {
            System.out.print("Tax applied is 0");
        }
        else if(income>=500000 && income<=1000000)
        {
            System.out.print("Tax applied is "+(income*0.2));//2% gst
        }
        else
        {
            System.out.print("Tax applied is "+(income*0.3));//3% gst
        }
    }
}