import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class validbstornot {
    static boolean isBST(Node root, int min, int max) {

        // Empty tree is also a BST
        if (root == null) {
            return true;
        }

        // Check current node
        if (root.data <= min || root.data >= max) {
            return false;
        }

        // Check left and right subtrees
        return isBST(root.left, min, root.data)
                && isBST(root.right, root.data, max);
    }

    static Node createTree(int[] values, int index) {

        if (index >= values.length) {
            return null;
        }

        Node root = new Node(values[index]);

        root.left = createTree(values, 2 * index + 1);
        root.right = createTree(values, 2 * index + 2);

        return root;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        int[] values = new int[n];

        System.out.println("Enter node values:");

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        Node root = createTree(values, 0);

        if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            System.out.println("The tree is a BST");
        } else {
            System.out.println("The tree is not a BST");
        }

        sc.close();
    }
}
