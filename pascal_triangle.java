public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Variable to keep track of the number to print
            int number = 1;
            
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                
                // Calculate the next number in the row
                number = number * (i - j) / j;
            }
            System.out.println();
        }
    }
}