public class PalindromicPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {
            
            // 1. Print the spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Two spaces for cleaner formatting
            }
            
            // 2. Print the left half (decreasing numbers)
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            // 3. Print the right half (increasing numbers)
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Move to the next line after completing the row
            System.out.println();
        }
    }
}