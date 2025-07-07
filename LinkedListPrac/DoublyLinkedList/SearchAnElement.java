package LinkedListPrac.DoublyLinkedList;

import java.util.Scanner;

public class SearchAnElement {
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

    SearchAnElement(){
        head = null;
        tail = null;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void searchElement(int key){
        Node current = head;

        int position = 1;

        while (current != null){
          if (current.data == key){
              System.out.println("Element " + current.data + " found at position: " + position);
              return;
          }
          else {
              current = current.next;
              position++;
          }

        }
        System.out.println("Element " + key + " not found in the list: ");
    }

    public void displayForward(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchAnElement dll = new SearchAnElement();
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements: ");
        for (int i = 0; i  < size; i++){
            int val = sc.nextInt();
            dll.insertAtEnd(val);
        }

        System.out.println("Enter the element to search ");
        int elem = sc.nextInt();
        dll.searchElement(elem);

        dll.displayForward();
    }
}
