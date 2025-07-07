package LinkedListPrac;

import java.util.Scanner;

public class FindMiddleNode {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node FindMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) { //  Floyd’s Tortoise and Hare algorithm
            slow = slow.next;  //  Floyd’s Tortoise and Hare algorithm
            fast = fast.next.next;//  Floyd’s Tortoise and Hare algorithm
        }
        return slow;//  Floyd’s Tortoise and Hare algorithm
    }

    public static void printList(Node head1) {
        Node temp = head1;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        System.out.println("Enter the number of elements: ");
        int num = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < num; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.print("Linked List: ");
        printList(head);

        Node middle = FindMiddle(head);
        System.out.println("Middle node value is: " + middle.data);
    }
}
