
public class maxsubarraysum2 {
    public static void max_sub_arrays(int array[]) { 
        int currentsum = 0, start, end;
        int maxsum = Integer.MIN_VALUE;
        int prefixarr[]=new int[array.length];
        prefixarr[0]=array[0];
        for(int i=1;i<array.length;i++)
        {
            prefixarr[i]= prefixarr[i-1]+array[i];
        }
        for(int i = 0; i < array.length; i++) {
            start = i;
            for(int j = i; j < array.length; j++) {
               end = j;
               currentsum= start==0 ? prefixarr[end] : prefixarr[end]-prefixarr[start-1];
            }
            if(currentsum>maxsum)
            {
                maxsum=currentsum;
            }
        }
        System.out.println("Max-Sum"+maxsum);
    }
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40};
        max_sub_arrays(array);
    }
}
 