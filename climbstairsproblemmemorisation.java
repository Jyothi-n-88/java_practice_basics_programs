import java.util.Arrays;

public class climbstairsproblemmemorisation {

    static int climbStairs(int n, int[] dp) {

        // Base cases
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n]; 
        }

        // Calculate and store
        dp[n] = climbStairs(n - 1, dp) + climbStairs(n - 2, dp);

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 5;

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println("Number of ways: " + climbStairs(n, dp));
    }
}