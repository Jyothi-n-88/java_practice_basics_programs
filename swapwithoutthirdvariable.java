class swapwithoutthirdvariable
{
    public static void main(String args[])
    {
        int x=3,y=4;
        x=x ^y;
        y=x ^y;
        x=x ^y;
        System.out.println("The swapped values are :" +x +"and" +y);
    }
}