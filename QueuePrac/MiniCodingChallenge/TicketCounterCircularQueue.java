package QueuePrac.MiniCodingChallenge;

import java.util.Scanner;

public class TicketCounterCircularQueue {

    static class TicketCounterQueue{
        int[] queue;
        int front, rear;
        int size;

        TicketCounterQueue(int size){
            this.size = size;

            queue = new int[size];
            front = -1;
            rear = -1;
        }

        boolean isEmpty(){
            return front == -1;
        }

        boolean isFull(){
            return (rear + 1) % size == front;
        }

        void enqueue(int ticket){
            if (isFull()){
                System.out.println("Line is full");
                return;
            }
            if (isEmpty()){
                front = 0;
            }

            rear =(rear + 1) % size;

            queue[rear] = ticket;

            System.out.println("Ticket " + ticket + " has joined the line");

        }

        void dequeue(){
            if (isEmpty()){
                System.out.println("Line is Empty! ");
                return;
            }
            System.out.println("Served: " + queue[front]);
            if (front == rear){
                front = rear = -1;
            }
           else {
                front = (front + 1) % size;
            }
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }
            System.out.print("Queue: ");
            int i = front;
            while (true) {
                System.out.print(queue[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketCounterQueue queue = new TicketCounterQueue(5);

        while (true) {
            System.out.println("\n🎟️ Ticket Counter Operations:");
            System.out.println("1. Enqueue (Join Line)");
            System.out.println("2. Dequeue (Serve)");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ticket number: ");
                    int ticket = sc.nextInt();
                    queue.enqueue(ticket);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting Ticket Counter...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
