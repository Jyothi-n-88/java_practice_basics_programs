import java.util.*;
public class javabasics{
    public static void main(String args[])
    {
        //Question1:In a program,input 3 numbers:A,B and C.You have to output the average of these 3 numbers.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        System.out.println("Enter c value");
        int c=sc.nextInt();
        int average=(a+b+c)/3;
        System.out.println("The average of 3 numbers :"+average);  

        //Question2:In a program,input the side of a square.You have to output the area of the square. 
        System.out.println("Enter side value of a square");
        int side=sc.nextInt();
        System.out.println("The area of a square is:"+side*side);

        //Question3:Enter cost of 3 items from the user(using float datatype)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
        // (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
         System.out.print("Enter cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of eraser: ");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Subtotal: " + total);
        // Advanced: Adding 18% GST
        float totalWithGst = total + (0.18f * total);
        System.out.println("Total Bill with 18% GST: " + totalWithGst);

    }
}