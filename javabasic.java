import java.util.*;
class student
{
    void detail(String srn, String name,String email)
    {
         System.out.println("SRN:" +srn );
         System.out.println("Name:" +name );
         System.out.println("Email:" +email );
    }
}
public class javabasic {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your srn");
        String srn=sc.next();
        System.out.println("Enter your Name");
        String name=sc.next();
        System.out.println("Enter your email");
        String email=sc.next();
        student obj=new student();
        obj.detail(srn,name,email);
    }
}
