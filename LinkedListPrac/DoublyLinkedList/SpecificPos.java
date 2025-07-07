package LinkedListPrac.DoublyLinkedList;

import java.util.Scanner;

public class SpecificPos {
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

    SpecificPos(){
        head = null;
        tail = null;
    }

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAtPos(int data, int pos){
        Node newNode = new Node(data);

        if (pos == 1){
            insertAtBeginning(data);
            return;
        }

        Node current = head;
        for (int i = 1; i < pos - 1; i++){
            if (current == null){
                System.out.println("Position out of bounds.");
                return;
            }
            current = current.next;
        }
        if (current.next == null){
            insertAtEnd(data);
            return;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
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
        SpecificPos dll = new SpecificPos();
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements: ");
        for (int i = 0; i  < size; i++){
            int val = sc.nextInt();
            dll.insertAtEnd(val);
        }

        System.out.println("Enter the number you want to insert: ");
        int num = sc.nextInt();

        System.out.println("Enter the Position: ");
        int pos = sc.nextInt();

        dll.insertAtPos(num, pos);

        System.out.println("After insertion the new List is: ");
        dll.displayForward();
    }

}
