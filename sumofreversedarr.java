public class sumofreversedarr {

    public static void main(String args[]) {

        int[] arr1 = {9, 3, 0, 8, 0, 0};
        int[] result1 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result1[i] = arr1[arr1.length - 1 - i];
        }

        int[] arr2 = {3, 2, 8, 9};
        int[] result2 = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            result2[i] = arr2[arr2.length - 1 - i];
        }

        int n;

        if (arr1.length < arr2.length) {
            n = arr2.length;
        } else {
            n = arr1.length;
        }

        int[] result = new int[n + 1];

        int carry = 0;

        for (int i = 0; i < n; i++) {
            int x = 0;
            int y = 0;

            if (i < result1.length) {
                x = result1[i];
            }
            if (i < result2.length) {
                y = result2[i];
            }

            int sum = x + y + carry;

            result[i] = sum % 10;

            carry = sum / 10;
        }

        if (carry > 0) {
            result[n] = carry;
        }
        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}