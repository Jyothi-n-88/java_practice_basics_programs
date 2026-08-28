import java.util.Scanner;

public class fastpowerrecursion {

    static long fastpower(long x, int n) {

        if (n == 0) {
            return 1;
        }
        long half = fastpower(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return x * half * half;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number");
        int x = sc.nextInt();
        System.out.println("Enter power number");
        int n = sc.nextInt();
        System.out.println("The power of a number is: " + fastpower(x, n));
    }
}