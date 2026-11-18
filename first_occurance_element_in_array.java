class first_occurance_element_in_array
{
    public static int firstOccurance(int arr[], int n, int key)
    {
        if (n == arr.length)
            return -1;
        if (arr[n ] == key)
            return n ;
        return firstOccurance(arr, n +1, key);
    }
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5, 3, 6};
        int n = 0;
        int key = 3;
        int result = firstOccurance(arr, n, key);
        if (result != -1)
            System.out.println("First occurrence of " + key + " is at index: " + result);
        else
            System.out.println(key + " is not present in the array.");
    }
}