public class removedupinarr {
    public static int removeDuplicates(int[] arr) {

        int slow = 0;
        int fast = 1;

        while (fast < arr.length) {

            if (arr[slow] == arr[fast]) {
                fast++;
            }
            else {
                slow++;
                arr[slow] = arr[fast];
                fast++;
            }
        }

        return slow;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5};

        int n = removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}