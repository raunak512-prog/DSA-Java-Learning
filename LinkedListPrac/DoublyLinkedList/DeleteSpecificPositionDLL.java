package LinkedListPrac.DoublyLinkedList;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class DeleteSpecificPositionDLL {
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

    DeleteSpecificPositionDLL(){
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

    public void deleteAtSpecific(int pos){

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (pos == 1) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return;
        }

        Node current = head;
        for (int i = 1; i < pos-1; i++){
            if (current == null){
                System.out.println("Position out of bounds.");
                return;
            }

            current = current.next;
        }
        Node toDelete = current.next;
        current.next = toDelete.next;

        if (toDelete.next != null) {
            toDelete.next.prev = current;
        } else {
            tail = current;

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
        DeleteSpecificPositionDLL dll = new DeleteSpecificPositionDLL();
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements: ");
        for (int i = 0; i  < size; i++){
            int val = sc.nextInt();
            dll.insertAtEnd(val);
        }

        System.out.println("Enter the position you want to delete: ");
        int num = sc.nextInt();

        System.out.println("Our original list is: ");
        dll.displayForward();

        dll.deleteAtSpecific(num);

        System.out.println("After the deletion the new linked list is: ");
        dll.displayForward();

    }
}
