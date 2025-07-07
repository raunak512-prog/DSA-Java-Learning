package LinkedListPrac;

import java.util.Scanner;

public class deleteSpecificPosition {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node deleteAtSpecificPos(Node head, int position){
        Node temp = head;
        if (temp == null){
            System.out.println("List is empty..");
            return null;
        }
        if (position == 1){
            head = head.next;
            return head;
        }

        for (int i = 1; i < position - 1 && temp != null; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
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
        System.out.println("Enter the position you want to delete: ");
        int pos = sc.nextInt();
        if (pos > size ){
            System.out.println("Invalid position. Try Again!");
            return;
        }
        head = deleteAtSpecificPos(head, pos);
        printList(head);
    }
}
