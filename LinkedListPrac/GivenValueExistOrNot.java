package LinkedListPrac;

import java.util.Scanner;

public class GivenValueExistOrNot {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean searchForValue(Node head, int value){
        Node temp = head;
       while (temp != null){
           if (temp.data == value){
               return true;
           }
           temp = temp.next;
       }

        return false;
    }
    public static void printList(Node head){
        Node temp = head;
        while (temp!= null){
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
        System.out.println("Enter the number to find in the list: ");
        int find = sc.nextInt();
       boolean result = searchForValue(head, find);
       if (result){
           System.out.println("The value is present.");
       }
       else {
           System.out.println("Value is not present.");
       }
        printList(head);
    }
}
