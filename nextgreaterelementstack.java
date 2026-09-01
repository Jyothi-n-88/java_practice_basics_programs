import java.util.Stack;

public class nextgreaterelementstack {

    static int[] nextGreaterElement(int[] arr) {

        // Create stack
        Stack<Integer> stack = new Stack<>();

        // Create result array and fill it with -1
        int[] result = new int[arr.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        // Process array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {

            int currentNum = arr[i];

            // Remove elements smaller than or equal to current element
            while (!stack.isEmpty() && stack.peek() <= currentNum) {
                stack.pop();
            }

            // If stack is not empty, top is the next greater element
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }

            // Push current element into stack
            stack.push(currentNum);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] array = {5, 2, 8, 3, 6};

        int[] result = nextGreaterElement(array);

        System.out.print("Input Array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.print("Next Greater Elements: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}