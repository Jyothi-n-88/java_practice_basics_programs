public class type_promotion
{
    public static void main(String args[])
    {
        short a=5;
        char b='b';
        System.out.println((int)b);
        System.out.println(a+b);//automatic type promotion from short , char to int
    }
}