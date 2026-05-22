class OverloadedMath 
{
    // Method 1: One parameter
    static int calculateSum(int n) 
    {
        return n * (n + 1) / 2; //sum of n natural number
    }

    // Method 2: Two parameters 
    static int calculateSum(int a, int b) 
    {
        return a + b; 
    }

    public static void main(String[] args) 
    {
        System.out.println("Sum of 1 to 100 is: " + calculateSum(100));
        System.out.println("Sum of 50 and 50 is: " + calculateSum(50, 50));
    }
}
