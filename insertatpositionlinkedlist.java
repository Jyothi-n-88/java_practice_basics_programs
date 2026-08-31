
public class insertatpositionlinkedlist {

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

        // Move current to the node before the position
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

        // Insert the new node
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

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original List:");
        display();

        insertAtPosition(25, 3);

        System.out.println("After insertion:");
        display();
    }
}