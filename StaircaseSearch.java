//TC-O(n+m)
//Space Complexity: O(1)
public class StaircaseSearch {
    public static void searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Invalid matrix.");
            return;
        }

        int n = matrix.length;       // Number of rows
        int m = matrix[0].length;    // Number of columns

        // Start at top-right corner
        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                 System.out.println("Element " + target + " found at cell: [" + row + ", " + col + "]"); // Element found
                 return ;
            } else if (matrix[row][col] > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }
        System.out.println("Element " + target + " not found in the matrix.");
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 10, 20, 30, 40 },
            { 15, 25, 35, 45 },
            { 27, 29, 37, 48 },
            { 32, 33, 39, 50 }
        };

        int target = 25;
        searchMatrix(matrix, target);
    }
}