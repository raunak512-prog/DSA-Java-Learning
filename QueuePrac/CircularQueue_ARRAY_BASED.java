package QueuePrac;

import java.util.Scanner;

public class CircularQueue_ARRAY_BASED {

    static class CircularQueue{
        int[] queue;
        int front,rear;
        int size;


        CircularQueue(int size){
            this.size = size;
            queue = new int[size];
            front= -1;
            rear = -1;
        }

        boolean isEmpty(){ // “Is the queue currently empty? Are there no elements at all?”
            return front == -1;
        }

        boolean isFull(){ // Is the queue completely filled? Is there no space left to enqueue?
            return (rear + 1) % size == front;
        }

        void enqueue(int value){
            if (isFull()){
                System.out.println("Queue is Full! ");
                return;
            }
            if (isEmpty()){
                front = 0;
            }

            rear = (rear + 1) % size; // "Hey, is the NEXT spot where front is sitting?"   "If yes, there’s NO ROOM — we’ll overlap!" Queue is FULL!
            queue[rear] = value;  // queue → This is the array holding all elements in the queue,rear → This is the index/seat where we want to place the new value, value → This is the actual data we’re inserting into the queue
            System.out.println(value + " Enqueued. ");
        }

        void dequeue(){
            if (isEmpty()){
                System.out.println("Queue is Empty!");
                return;
            }
            System.out.println("Removed: " + queue[front]);

            if (front == rear){
                front = rear = -1;
            }
            else {
                front = (front + 1) % size; //

            }
        }

        void display(){
            if (isEmpty()) {
                System.out.println("Queue is empty! ");
                return;
            }

            System.out.println("Queue: ");
            int i = front;
            while (true){ // It just sees:while (true) → okay, that’s always true. So I'll create an infinite loop  The loop condition is hardcoded as true
                System.out.print(queue[i] + " ");
                if (i == rear){
                    break;
                }

                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue que = new CircularQueue(5); //  Why here size is 5 ? what does it mean and what was its purpose.

        while (true){
            System.out.println("\nQueue Operations: ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter the value: ");
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
                    System.out.println("Invalid choice.");


            }
        }
    }
}
