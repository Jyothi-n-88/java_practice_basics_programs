//Kadane's Algorithm
//time complexity:O(n)
//Space complexity: O(1)
public class maxsubarraysum3 {
    public static void max_sub_arrays(int array[]) { 
        int currentsum = 0;
        int maxSum=0;
        for(int i=0;i<array.length;i++)
        {
            currentsum=currentsum+array[i];
            if(currentsum<0)
            {
                currentsum=0;
            }
            maxSum=Math.max(currentsum,maxSum);

        }
        
        System.out.println("Max-Sum :"+maxSum);
    }
    public static void main(String[] args) {
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        max_sub_arrays(array);
    }
}
 