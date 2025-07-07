package LinkedListPrac;

import java.util.Scanner;

public class FlattenAMultiLevelLinklist {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node flattenLinkedList(Node head1, int put, Node head2){
        if (head1 == null || head2 == null){
            return head1;
        }

        int count = 0;
        Node temp = head1;
        while (temp != null && count < put){
            temp = temp.next;
            count++;
        }

        if (temp == null){
            return head1;
        }

        Node next = temp.next;
        temp.next = head2;

        Node child = head2;
        while (child.next != null){
          child = child.next;
        }
        child.next = next;
        return head1;
    }

    public static void printList(Node head){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the original list.");
        int size = sc.nextInt();

        Node head = null;
        Node tail = null;

        System.out.println("Enter the elements: ");

        for (int l = 0; l < size; l++){

            Node newNode = new Node(sc.nextInt());

            if (head == null){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Enter the number of element from where you want to enter the annexure list:");
        int inser = sc.nextInt();

        System.out.println("Enter the size of the Annexure list.");
        int siz = sc.nextInt();

        Node head1 = null;
        Node tail1 = null;

        System.out.println("Enter the elements of Annexure list: ");

        for (int k = 0; k < siz; k++){

            Node newNode1 = new Node(sc.nextInt());

            if (head1 == null){
                head1 = newNode1;
                tail1 = newNode1;
            }
            else {
                tail1.next = newNode1;
                tail1 = newNode1;
            }
        }

        System.out.println("original list: ");
        printList(head);

        System.out.println("Annexure list: ");
        printList(head1);

        System.out.println("The modified list: ");
        Node newNod = flattenLinkedList(head, inser, head1);

        printList(newNod);

    }
}
