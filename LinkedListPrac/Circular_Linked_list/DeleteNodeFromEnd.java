package LinkedListPrac.Circular_Linked_list;

import java.util.Scanner;

public class DeleteNodeFromEnd {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insertAtEnd(int value){
        Node newNode = new Node(value);

        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
        }
    }
    public void DeleteEnd(){
        if (head == tail){
            head = null;
            tail = null;
        }
        else {
           Node temp = head;
           if (temp.next != tail){
               temp = temp.next;
           }
           tail = temp;
           tail.next = head;
        }
    }

    public void traverse(){
        if (head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        while (temp != head);
        System.out.println("(Back to head)");
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        DeleteNodeFromEnd cll = new DeleteNodeFromEnd();
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++){
            cll.insertAtEnd(sc.nextInt());
        }
        System.out.println("This is Our circular linked list : ");
        cll.traverse();

        System.out.println("Deleting a node from beginning...");
        cll.DeleteEnd();

        System.out.println("List after deletion:");
        cll.traverse();
    }
}
