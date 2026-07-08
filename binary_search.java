class largest
{
    public static int binary_search(int array[],int key)
    {
        int low=0,high=array.length-1,mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(key==array[mid])
            {
                return mid;
            }
            else if(key<array[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int array[]={-2,5,20,60};//array must be sorted first
        int key=60;
        int index=binary_search(array,key);
        if (index != -1) {
            System.out.println("The key " + key + " was found at index " + index);
        } else {
            System.out.println("The key " + key + " was not found in the array.");
        }
    }
}