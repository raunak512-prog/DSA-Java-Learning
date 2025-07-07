package LinkedListPrac;

public class countingNodes {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        //Creating nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        //Linking nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // initializing count with 0.
        int count = 0;
        //Traversing and printing data and count using while loop.
        Node temp = head;
        while (temp != null){
            count++;
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        // shouting sout to print null and count total number of nodes
        System.out.println("Null");
        System.out.println("Total Nodes: " + count);
    }
}
