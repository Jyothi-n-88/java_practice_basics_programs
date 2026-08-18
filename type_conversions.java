public class type_conversion
{
    public static void main(String args[])
    {
        int a=150;
        float b=a;//implicit conversion
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        float c=120.5f;
        int d=(int)c;//explicit conversion
        System.out.println("c:"+c);
        System.out.println("d:"+d);
    }
}