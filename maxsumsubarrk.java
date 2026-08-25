// Time complexity:O(n)
//Space complexity:O(1)

public class maxsumsubarrk {

    public static void max_sub_arrays(int array[], int k) {

        int currentsum=0;
        for(int i=0;i<k;i++)
        {
            currentsum+=array[i];
        }
        int maxsum=currentsum;
        int lastinx=k-1;
        for(int i=k;i<array.length;i++)
        {
            currentsum=currentsum+array[i]-array[i-k];
            if(currentsum>maxsum)
            {
                maxsum=currentsum;
                lastinx=i;
            }
        }
        System.out.println("Max Sum: " + maxsum);
        System.out.println("Array elements added to get max-subarray-sum are:" + array[lastinx-k+1] +":" +array[lastinx-k+2] +":" + array[lastinx]);
    }

    public static void main(String[] args) {

        int array[] = {-1,8,0,5,-5,1,3};
        int k = 3;

        max_sub_arrays(array, k);
    }
}