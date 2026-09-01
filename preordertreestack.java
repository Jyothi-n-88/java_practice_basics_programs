import java.util.Stack;

public class preordertreestack {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static void preorder(Node root) {

        if (root == null)
            return;

        Stack<Node> stack = new Stack<>();

        // Push root
        stack.push(root);

        while (!stack.isEmpty()) {

            // Remove top node
            Node current = stack.pop();

            // Visit node
            System.out.print(current.data + " ");

            // Push right first
            if (current.right != null)
                stack.push(current.right);

            // Push left second
            if (current.left != null)
                stack.push(current.left);
        }
    }

    public static void main(String[] args) {

        // Create tree
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Preorder: ");
        preorder(root);
    }
}