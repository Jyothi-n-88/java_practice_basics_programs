class Swap
{
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4};

        int i = 0;
        int j = arr.length - 1;
        int temp = 0;

        while(i < j)
        {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

            i++;
            j--;
        }

        for(int k = 0; k < arr.length; k++)
        {
            System.out.print(arr[k] + " ");
        }
    }
}