class check_array_sorted_recursive
{
    public static boolean isSorted(int arr[], int i)
    {
        if (i == arr.length - 1)
            return true;
        if (arr[i] > arr[i + 1])
            return false;
        return isSorted(arr, i + 1);
    }
    public static void main(String args[])
    {
        int arr[] = {1, 10, 3, 4, 5};
        if (isSorted(arr, 0))
            System.out.println("The array is sorted.");
        else
            System.out.println("The array is not sorted.");
    }
}