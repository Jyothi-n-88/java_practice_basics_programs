class last_occurance_element_recursion
{
    public static int lastOccurance(int arr[], int n, int key)
    {
        if (n == 0)
            return -1;
        if (arr[n - 1] == key)
            return n - 1;
        return lastOccurance(arr, n - 1, key);
    }
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5, 3, 6};
        int n = arr.length;
        int key = 1;
        int result = lastOccurance(arr, n, key);
        if (result != -1)
            System.out.println("Last occurrence of " + key + " is at index: " + result);
        else
            System.out.println(key + " is not present in the array.");
    }
}