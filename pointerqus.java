public class pointerqus {

    public static void twopointer(int array[], int target) {

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                System.out.println("The target is formed at indices: "+ left + " and " + right);
                return;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println("No pair found");
    }

    public static void main(String[] args) {

        int array[] = {2, 7, 11, 15};
        int target = 9;

        twopointer(array, target);
    }
}