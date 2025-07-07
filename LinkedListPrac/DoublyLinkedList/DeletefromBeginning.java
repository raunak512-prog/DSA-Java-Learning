package LinkedListPrac.DoublyLinkedList;

import java.util.Scanner;

public class DeletefromBeginning {
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

    DeletefromBeginning(){
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

    public void DeleteBegin(){
        if (head == null){
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null){
            head = null;
            tail = null;
            return;
        }
        else {
            head = head.next;
            head.prev = null;

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
        DeletefromBeginning dll = new DeletefromBeginning();

        System.out.println("Enter the size of list: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++){
            dll.insertAtEnd(sc.nextInt());
        }


        System.out.println("Do you want to delete from beginning? (yes/no)");
        String confirm = sc.next();

        if (confirm.equalsIgnoreCase("yes")){
            dll.DeleteBegin();
            System.out.println("List after deletion from beginning: ");
            dll.displayForward();
        }
        else {
            dll.displayForward();
        }

    }
}
