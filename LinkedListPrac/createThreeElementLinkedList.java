package LinkedListPrac;

public class createThreeElementLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Creating individual nodes.
        Node first = new Node(10);
        Node second = new Node(20);
        Node third =new Node(30);

        // Linking nodes
        first.next = second;
        second.next = third;

        // Printing the linked list
        Node temp = first;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
