class largest
{
    public static void largest_in_array(int array[],int largest,int smallest)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>largest)
            {
                largest=array[i];
            }
        }
        System.out.println("The largest number in the array is :"+largest);

        for(int i=0;i<array.length;i++)
        {
            if(array[i]<smallest)
            {
                smallest=array[i];
            }
        }
        System.out.println("The smallest number in the array is :"+smallest);
    }
    public static void main(String args[])
    {
        int array[]={10,5,6,48,-2};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        largest_in_array(array ,largest, smallest);
    }
}