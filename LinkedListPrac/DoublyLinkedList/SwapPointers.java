package LinkedListPrac.DoublyLinkedList;

import java.util.Scanner;

public class SwapPointers {
    static class Node{
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

    SwapPointers(){
        head = null;
        tail = null;
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

    public void reverseList() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;


            current = current.prev;
        }


        if (temp != null) {
            head = temp.prev;
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
        SwapPointers dll = new SwapPointers();
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements: ");
        for (int i = 0; i  < size; i++){
            int val = sc.nextInt();
            dll.insertAtEnd(val);
        }

        System.out.println("Do you want to reverse the list? (yes/no)");
        String answer = sc.next();

        if (answer.equalsIgnoreCase("yes")) {
            dll.reverseList();
            System.out.println("List after reversing:");
            dll.displayForward();
        }

    }
}
