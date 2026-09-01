import java.util.Scanner;

public class singlylinkedlistinputfromconsole {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void insertAtPosition(int data, int position) {

        Node newNode = new Node(data);

        // Insert at first position
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        // Move to the node before the position
        for (int i = 1; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Invalid position");
                return;
            }
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position");
            return;
        }

        // Insert new node
        newNode.next = current.next;
        current.next = newNode;
    }

    static void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter node values:");

        for (int i = 1; i <= n; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } 
            else {
                Node current = head;

                while (current.next != null) {
                    current = current.next;
                }

                current.next = newNode;
            }
        }

        System.out.println("Original List:");
        display();
        System.out.print("Enter value for new node: ");
        int data = sc.nextInt();
        System.out.print("Enter position: ");
        int position = sc.nextInt();
        insertAtPosition(data, position);
        System.out.println("After insertion:");
        display();
        sc.close();
    }
}