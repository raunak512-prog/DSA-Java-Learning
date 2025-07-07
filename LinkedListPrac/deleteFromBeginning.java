package LinkedListPrac;

import java.util.Scanner;

public class deleteFromBeginning {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteBeginning(Node head){
        Node temp = head;
       if (temp == null){
           System.out.println("The list is already empty.");
           return null;
       }
       else {
           temp = temp.next;
       }
       return temp;
    }

    public static void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the list.");
        int size = sc.nextInt();

        Node head = null;
        Node tail = null;

        System.out.println("Enter the elements: ");

        for (int k = 0; k < size; k++){
            int elem = sc.nextInt();
            Node newNode = new Node(elem);

            if (head == null){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        printList(head);
        System.out.println("Deleting first node...");
        head = deleteBeginning(head);
        printList(head);

    }
}
