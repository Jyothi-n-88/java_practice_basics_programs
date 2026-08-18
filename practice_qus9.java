/* 
Qus: use the following methods of the Math class in Java:
a.Math.min( )
b.Math.max( )
c.Math.sqrt( )
d.Math.pow( )
e.Math.avg( )
f.Math.abs( ).

The standard java.lang.Math class includes utility methods for many calculations like Math.min(), Math.max(), and Math.abs(),
but it completely lacks a built-in average function.
*/



public class MathClassExamples {

    public static void main(String[] args) {
        
        System.out.println("--- Java Math Class Examples ---");

        // a. Math.min(a, b) - Returns the smaller of two numbers
        int minResult = Math.min(10, 25);
        System.out.println("Math.min(10, 25): " + minResult); 
        // Output: 10

        // b. Math.max(a, b) - Returns the larger of two numbers
        int maxResult = Math.max(10, 25);
        System.out.println("Math.max(10, 25): " + maxResult); 
        // Output: 25

        // c. Math.sqrt(a) - Returns the positive square root of a double
        double sqrtResult = Math.sqrt(64.0);
        System.out.println("Math.sqrt(64.0): " + sqrtResult); 
        // Output: 8.0

        // d. Math.pow(base, exponent) - Returns the base raised to the power of the exponent
        double powResult = Math.pow(2.0, 3.0); // 2 cubed (2 * 2 * 2)
        System.out.println("Math.pow(2.0, 3.0): " + powResult); 
        // Output: 8.0

        // e. Math.avg() DOES NOT EXIST. Here is the manual alternative:
        double num1 = 10, num2 = 20, num3 = 30;
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("Average of 10, 20, 30: " + average); 
        // Output: 20.0

        // f. Math.abs(a) - Returns the absolute (positive) value of a number
        int absResult = Math.abs(-50);
        System.out.println("Math.abs(-50): " + absResult); 
        // Output: 50
    }
}