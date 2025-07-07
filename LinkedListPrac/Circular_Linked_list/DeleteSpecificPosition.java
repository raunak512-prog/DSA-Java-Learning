package LinkedListPrac.Circular_Linked_list;

import java.util.Scanner;

public class DeleteSpecificPosition {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        Node head = null;
        Node tail = null;

        public void insertAtEnd(int value){
            Node newNode = new Node(value);

            if (head == null){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }

        public void deleteSp(int position){
            if (head == null){
                System.out.println("List is empty.");
                return;
            }
            if (head == tail && position == 1){
                head = null;
                tail = null;
                return;
            }
            if (position == 1){
                head = head.next;
                tail.next = head;
                return;
            }
            Node temp = head;
            int count = 1;

            while (count < position - 1 && temp.next != head){
                temp = temp.next;
                count++;
            }

            if (temp.next == head || temp.next == null){
                System.out.println("Invalid position");
                return;
            }
            Node toDelete = temp.next;
            temp.next = toDelete.next;
            if (toDelete == tail){
                tail = temp;
            }
        }
        public void traverse(){
            if (head == null){
                System.out.println("List is empty.");
                return;
            }
            Node temp = head;
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            while (temp != head);
            System.out.println("(Back to head)");
        }
        public static void main(String[] args) {
            Scanner sc =  new Scanner(System.in);
            DeleteSpecificPosition cll = new DeleteSpecificPosition();
            System.out.println("Enter the size of the list: ");
            int size = sc.nextInt();
            System.out.println("Enter the elements: ");
            for (int i = 0; i < size; i++){
                cll.insertAtEnd(sc.nextInt());
            }
            System.out.println("This is Our circular linked list : ");
            cll.traverse();

            System.out.println("Enter the position to delete: ");
            int position = sc.nextInt();
            cll.deleteSp(position);
            System.out.println("Circular linked list after deletion: ");
            cll.traverse();
        }

}
