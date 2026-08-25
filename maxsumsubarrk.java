public class maxsumsubarrk {

    public static void max_sub_arrays(int array[], int k) {

        int currentsum=0;
        for(int i=0;i<k;i++)
        {
            currentsum+=array[i];
        }
        int maxsum=currentsum;

        for(int i=k;i<array.length;i++)
        {
            currentsum=currentsum+array[i]-array[i-k];
            if(currentsum>maxsum)
            {
                maxsum=currentsum;
            }
        }
        System.out.println("Max Sum: " + maxsum);
    }

    public static void main(String[] args) {

        int array[] = {-1,8,0,5,-5,1,3};
        int k = 3;

        max_sub_arrays(array, k);
    }
}