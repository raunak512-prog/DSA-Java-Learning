package LinkedListPrac;

public class DeletingLoopLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node removeLoop(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                System.out.println("Our Systems detected an infinite loop. ");
               break;
            }
        }
        if (slow == fast){
            Node start = head;
            while (start != slow){
                start = start.next;
                slow = slow.next;
            }
            Node prev = start;
            while (prev.next != start){
                prev = prev.next;
            }
            prev.next = null;
            System.out.println("Loop removed successfully.");
        }
        else {
            System.out.println("No loop found");
        }

       return head;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
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
       head = removeLoop(head);
       printList(head);
    }
}
