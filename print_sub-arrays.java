public class array {
    public static void sub_arrays(int array[]) { 
        int totalsubarrays = 0, start, end;
        for(int i = 0; i < array.length; i++) {
            start = i;
            for(int j = i; j < array.length; j++) {
               end = j;
               for(int k = start; k <= end; k++) {
                System.out.print(array[k] + " ");
               }
               System.out.print("| ");
               totalsubarrays++;
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: " + totalsubarrays);
    }
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40};
        sub_arrays(array);
    }
}
 