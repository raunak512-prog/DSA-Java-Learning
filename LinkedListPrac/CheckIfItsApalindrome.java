package LinkedListPrac;

import java.util.Scanner;

public class CheckIfItsApalindrome {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node palindrome(Node head){
        Node temp = head;
        Node next;
        Node prev = null;

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        while (slow != null){
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        Node left = head;
        Node right = prev;

        boolean isPalindrome = true;

        while (right!= null) {
            if (left.data != right.data) {
                isPalindrome = false;
                break;
            }
            left = left.next;
            right = right.next;
        }
       if (isPalindrome){
           System.out.println("Yes! It's a Palindrome.");
       }
       else {
           System.out.println("Oops! It's not a Palindrome.");
       }
       return temp;
    }


    public static void printlist(Node head){
        Node temp = head;
        while (temp !=  null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Node head = null;
        Node tail = null;
        System.out.println("Enter the the size of the list: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the list: ");
        for (int i = 0; i <  size ; i++){
            Node newNode = new Node(sc.nextInt());

            if (head == null){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        System.out.println("The list is: ");
        printlist(head);

        head = palindrome(head);
        printlist(head);
    }
}
