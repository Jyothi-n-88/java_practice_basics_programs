class Node {
    int data;
    Node left;
    Node right;

    // Constructor
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class treepreorderrecursive {

    // Preorder Traversal: Root -> Left -> Right
    static void preorder(Node root) {

        // Base condition
        if (root == null) {
            return;
        }

        // 1. Visit Root
        System.out.print(root.data + " ");

        // 2. Visit Left Subtree
        preorder(root.left);

        // 3. Visit Right Subtree
        preorder(root.right);
    }

    public static void main(String[] args) {

        // Creating the binary tree
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Preorder Traversal
        System.out.print("Preorder Traversal: ");
        preorder(root);
    }
}