
public class maxsubarraysum {
    public static void max_sub_arrays(int array[]) { 
        int currentsum = 0, start, end;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            start = i;
            for(int j = i; j < array.length; j++) {
               end = j;
               currentsum=0;
               for(int k = start; k <= end; k++) {
                  currentsum+=array[k];
               }
               System.out.println(currentsum);
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
 