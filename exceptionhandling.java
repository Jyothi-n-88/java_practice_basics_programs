public class exceptionhandling
{
    public static void main(String args[])
    {
        try
        {
            //int x=10
            int x=10;
            int y=0;
            int result=x/y; //ArithmeticException
            int arr[]={10,20,30};
            System.out.println(arr[5]); //ArrayIndexOutOfBoundsException
            
        }
        catch(ArrayIndexOutOfBoundsException |ArithmeticException e)
        {
            System.out.println(e);
        }

    }
}