//Time complexity :O(n^2)  {has better solution than this}


class medianof2sortedarrya {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length + nums2.length];//creating merged array

        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            arr[nums1.length + i] = nums2[i];
        }

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Find median
        int n = arr.length;

        if (n % 2 == 1) {

            // Odd
            return arr[n / 2];

        } else {

            // Even
            int left = arr[n / 2 - 1];
            int right = arr[n / 2];

            return (left + right) / 2.0;
        }
    }
    public static void main(String args[])
    {

    }
}