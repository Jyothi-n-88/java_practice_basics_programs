class array
{
    public static void reverse_array(int array[])
    {
        int temp;
        int first=0;
        int last=array.length-1;
        while(first<last)
        {
            temp=array[last];
            array[last]=array[first];
            array[first]=temp;
            first++;
            last--;
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int array[]={-2,5,20,60};
        reverse_array(array);
    }
}