package LinkedListPrac;

public class FloydLoopDetection {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static boolean hasloop(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) { //  Floyd’s Tortoise and Hare algorithm
            slow = slow.next;  //  Floyd’s Tortoise and Hare algorithm
            fast = fast.next.next;//  Floyd’s Tortoise and Hare algorithm
            if (slow == fast){ // if condition used cuz in infinite loop slow and fast should meet at some point
                System.out.println("Our Systems detected a infinite loop.");
                return true;
            }
           if (fast == null || fast.next == null){ //if not then this part executes.
               System.out.println("Our systems does not detected any infinite loop");
               return true;
           }
        }
        return false;
    }

    public static void main(String[] args) {
        //Creating nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        //linking nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = head;
        // calling hasloop
        hasloop(head);

    }
}
