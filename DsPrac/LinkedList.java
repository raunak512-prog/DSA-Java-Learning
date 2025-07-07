package DsPrac;

public class LinkedList {
    //  It creates a singly linked list and traverses it:

    // Node class representing each element in the linked list
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to traverse and print the linked list
    public static void linkedListTraversal(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.println("Element: " + ptr.data);
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
        // Creating nodes
        Node head = new Node(7);
        Node second = new Node(11);
        Node third = new Node(41);
        Node fourth = new Node(66);
        Node fifth = new Node(88);

        // Linking the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;// Optional, as default is null

        // Traversing the linked list
        linkedListTraversal(head);
    }
}
