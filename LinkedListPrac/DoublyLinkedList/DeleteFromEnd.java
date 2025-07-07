package LinkedListPrac.DoublyLinkedList;

import java.util.Scanner;

public class DeleteFromEnd {
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

    DeleteFromEnd(){
        head = null;
        tail = null;
    }

    public void insertAtEnd(int data) {
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

    public void DeleteEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        else {
            tail = tail.prev;
            tail.next = null;
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
        DeleteFromEnd dll = new DeleteFromEnd();

        System.out.println("Enter the size of list: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++){
            dll.insertAtEnd(sc.nextInt());
        }


        System.out.println("Do you want to delete from End? (yes/no)");
        String confirm = sc.next();

        if (confirm.equalsIgnoreCase("yes")){
            dll.DeleteEnd();
            System.out.println("List after deletion from end: ");
            dll.displayForward();
        }
        else {
            System.out.println("The list is remained same.");
            dll.displayForward();
        }
    }
}
