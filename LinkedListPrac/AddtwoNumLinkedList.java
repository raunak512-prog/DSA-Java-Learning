package LinkedListPrac;

import java.util.Scanner;

public class AddtwoNumLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node addTwo(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        Node p1 = head1;
        Node p2 = head2;

        int carry = 0;
        while (p1 != null || p2 != null || carry != 0) {
            int d1 = (p1 != null) ? p1.data : 0;
            int d2 = (p2 != null) ? p2.data : 0;

            int sum = d1 + d2 + carry;
            int newDigit = sum % 10;
            carry = sum / 10;

            tail.next = new Node(newDigit);
            tail = tail.next;

            if (p1 != null){
                p1 = p1.next;
            }
            if (p2 != null){
                p2 = p2.next;
            }

        }
        return dummy.next;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head1 = null;
        Node tail1 = null;

        Node head2 = null;
        Node tail2 = null;


        System.out.println("Enter the size of the list 1: ");
        int size1 = sc.nextInt();

        System.out.println("Enter the sorted number for list 1: ");
        for (int i = 0; i < size1; i++) {
            Node newNode = new Node(sc.nextInt());
            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }
        System.out.println("Enter the size of the list 2: ");
        int size2 = sc.nextInt();

        System.out.println("Enter the sorted number for list 2: ");
        for (int j = 0; j < size2; j++) {
            Node newNode = new Node(sc.nextInt());
            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }
        System.out.println("The list One is: ");
        printList(head1);

        System.out.println("The list two is: ");
        printList(head2);

        Node sum = addTwo(head1, head2);
        System.out.println("The sum of both the list are: ");
        printList(sum);
    }
}