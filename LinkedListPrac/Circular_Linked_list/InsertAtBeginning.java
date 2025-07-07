package LinkedListPrac.Circular_Linked_list;

import java.util.Scanner;

public class InsertAtBeginning {
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

    public void insertAtbBginning(int value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            newNode.next = head;
            head = newNode;
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
        InsertAtBeginning cll = new InsertAtBeginning();
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++){
            int value = sc.nextInt();
            cll.insertAtbBginning(value);
        }
        System.out.println("This is Our circular linked list : ");
        cll.traverse();
    }
}
