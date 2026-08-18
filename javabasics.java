import java.util.*;
public class javabasics{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of a and b :"+sum);   
        int product=a*b;
        System.out.println("The product of a and b :"+product); 
        System.out.println("Enter radius value of a circle");
        float radius=sc.nextFloat();
        float area=3.14f*radius*radius; // Add 'f' after 3.14 to tell Java it is a float(Java treats decimal numbers like 3.14 as a double by default)
        System.out.println("The Area of a circle :"+area);

    }
}