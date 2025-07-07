package LinkedListPrac.DoublyLinkedList;

import java.util.Scanner;

public class DoublyLinkedListInsertAtBeginning {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

    DoublyLinkedListInsertAtBeginning(){
        head = null;
        tail = null;
    }

    public  void insertAtBeginning(int data){
        Node newNode = new Node(data);


        if (head == null){
            head =newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void displayForward(){
        Node current = head;
        System.out.print("List (Forward): ");
        while (current != null){
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedListInsertAtBeginning dll = new DoublyLinkedListInsertAtBeginning();
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements: ");
        for (int i = 0; i  < size; i++){
            int val = sc.nextInt();
            dll.insertAtBeginning(val);
        }

        System.out.println("This is our linked list(Insert At Beginning): ");
        dll.displayForward();

    }
}
