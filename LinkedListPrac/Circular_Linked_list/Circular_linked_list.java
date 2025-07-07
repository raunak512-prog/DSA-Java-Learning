package LinkedListPrac.Circular_Linked_list;

import java.util.Scanner;

public class Circular_linked_list {
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

    public void insertAtend(int value){
        Node newNode = new Node(value);

        if (head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
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
       Circular_linked_list cll = new Circular_linked_list();
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++){
            int value = sc.nextInt();
           cll.insertAtend(value);
        }
        System.out.println("This is Our circular linked list : ");
        cll.traverse();
    }
}
