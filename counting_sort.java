//Space Complexity = O(k) :: k = largest element in the array (more precisely, the size of the value range)
//Time Complexity = O(n + k)
public class counting_sort {

    public static void countingsort(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--) //Descending sorting order
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        countingsort(arr);
}
}