//TC- O(n)
//SC- O(1)

public class DiagonalSumOptimal {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            sum += mat[i][i];

            // Add secondary diagonal element only if it's not the overlapping center
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        System.out.println("Sum: " + diagonalSum(matrix)); // Output: 25
    }
}