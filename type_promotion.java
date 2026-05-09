public class type_promotion
{
    public static void main(String args[])
    {
        short a=5;
        char b='b';
        System.out.println((int)b);
        System.out.println(a+b);//automatic type promotion from short , char to int
        byte c=5;
        // c=c*2; <-wrong automatic type conversion takes place to int 
        c=(byte)(c*2);
        System.out.println(c);
    }
}