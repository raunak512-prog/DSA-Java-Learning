package LinkedListPrac;

import java.util.Scanner;

public class deleteFromEnd {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteEnd(Node head){
        Node temp = head;
        if (temp == null){
            System.out.println("List is already Empty! ");
            return null;
        }
        else {
            while (temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
        return head;
    }

    public static void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the list.");
        int size = sc.nextInt();

        Node head = null;
        Node tail = null;

        System.out.println("Enter the elements: ");

        for (int k = 0; k < size; k++){
            int elem = sc.nextInt();
            Node newNode = new Node(elem);

            if (head == null){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        printList(head);
        System.out.println("Deleting last Node..");
        head = deleteEnd(head);
        printList(head);
    }
}
