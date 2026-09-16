//Time Complexity: O(h)
//Space Complexity: O(h)
import java.util.HashSet;

public class commonancestortree {

    static class Node {
        int data;
        Node left;
        Node right;
        Node parent;

        Node(int data) {
            this.data = data;
            this.parent = null;
        }
    }

    static Node findLCA(Node node1, Node node2) {

        HashSet<Node> ancestors = new HashSet<>();

        // Move upward from node1
        while (node1 != null) {
            ancestors.add(node1);
            node1 = node1.parent;
        }

        // Move upward from node2
        while (node2 != null) {

            if (ancestors.contains(node2)) {
                return node2;
            }

            node2 = node2.parent;
        }

        return null;
    }

    public static void main(String[] args) {

        // Create nodes
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        // Create tree
        n1.left = n2;
        n1.right = n3;

        n2.parent = n1;
        n3.parent = n1;

        n2.left = n4;
        n2.right = n5;

        n4.parent = n2;
        n5.parent = n2;

        // Find LCA of 4 and 5
        Node result = findLCA(n2, n3);

        System.out.println("LCA = " + result.data);
    }
}