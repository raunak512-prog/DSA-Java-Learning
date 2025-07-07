package LinkedListPrac;

public class createLinkedListManually {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        //Creat
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        //Linking nodes
        head.next = second;
        second.next = third;
        //Traversing and printing data sing while loop.
        while (head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        // shouting sout to print null
        System.out.println("Null");
    }
}
