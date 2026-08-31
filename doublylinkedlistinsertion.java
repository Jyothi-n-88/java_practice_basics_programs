public class DoublyLinkedList {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static Node head = null;

    // Insert at first
    static void insertFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at end
    static void insertEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    // Insert at specific position
    static void insertAtPosition(int data, int position) {

        Node newNode = new Node(data);

        if (position == 1) {
            insertFirst(data);
            return;
        }

        Node current = head;

        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        newNode.prev = current;

        current.next.prev = newNode;
        current.next = newNode;
    }

    // Display
    static void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ⇄ ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        insertEnd(10);
        insertEnd(20);
        insertEnd(30);

        System.out.println("Original:");
        display();

        insertFirst(5);

        System.out.println("After inserting at first:");
        display();

        insertAtPosition(25, 4);

        System.out.println("After inserting 25 at position 4:");
        display();

        insertEnd(40);

        System.out.println("After inserting at end:");
        display();
    }
}