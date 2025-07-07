package QueuePrac;

import java.util.Queue;
import java.util.Scanner;

public class QueueLinkedList {
     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

     static class Queue {
        Node front, rear;

        Queue() {
            front = rear = null;
        }

        void enqueue(int value) {
            Node newNode = new Node(value);
            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            System.out.println(value + " Enqueued.");
        }
        void dequeue(){
            if (front == null){
                System.out.println("Queue is empty!");
                return;
            }
            System.out.println("Removed: " + front.data);
            front = front.next;

            if (front == null){
                rear = null;
            }
        }

        void display(){
            if (front == null){
                System.out.println("Queue is empty!");
                return;
            }
            Node temp = front;
            System.out.print("Queue: ");
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //q.enqueue(10);
      //  q.enqueue(20);
      //  q.enqueue(30);
      //  q.display();

     //   q.dequeue();
     //   q.display();

      //  q.dequeue();
     //   q.dequeue();
      //  q.dequeue();


        Queue que = new Queue();

        while (true){
            System.out.println("\n Queue Operation menu: ");
            System.out.println("1: Enqueue ");
            System.out.println("2: Dequeue ");
            System.out.println("3: Display ");
            System.out.println("4: Exit ");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the value to enqueue: ");
                    int val = sc.nextInt();
                    que.enqueue(val);
                    break;
                case 2:
                    que.dequeue();
                    break;
                case 3:
                    que.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice! Please select 1-4. ");
            }
        }
    }
}