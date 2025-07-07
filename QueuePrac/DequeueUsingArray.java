package QueuePrac;

import java.util.Scanner;

public class DequeueUsingArray {
    static class Dequeue{
        int [] dequeue;
        int front, rear, size;

        Dequeue(int size){
            this.size = size;

            dequeue = new int[size];
            front = -1;
            rear = -1;
        }

        boolean isEmpty(){
            return front == -1;
        }

        boolean isFull(){
            return (rear + 1) % size == front;
        }

        void insertRear(int value){
            if (isFull()){
                System.out.println("Dequeue is Full!");
                return;
            }

            if (isEmpty()){
                front = 0;
                rear = 0;
            }
            else {
                rear = (rear + 1) % size;
            }

            dequeue[rear] = value;
            System.out.println( value + " inserted at rear. ");
        }

        void insertFront(int value){
            if (isFull()){
                System.out.println("Dequeue is Full! ");
                return;
            }
            if (isEmpty()){
                front = rear = 0;
            }
            else {
                front = (front - 1 + size) % size;
            }

            dequeue[front] = value;
            System.out.println(value + " inserted at front.");
        }

        void deleteFront(){
            if (isEmpty()){
                System.out.println("Dequeue is Empty! ");
                return;
            }
            System.out.println("Removed from front: " + dequeue[front]);

            if (front == rear){
                front = rear = -1;
            }
            else {
                front = (front + 1) % size;
            }
        }

        void deleteRear(){
            if (isEmpty()){
                System.out.println("Dequeue is Empty! ");
                return;
            }

            System.out.println("Removed from rear: " + dequeue[rear]);

            if (front == rear){
                front = rear = -1;
            }
            else {
                rear = (rear - 1 + size) % size;
            }

        }

        void Display(){
            if (isEmpty()) {
                System.out.println("Deque is empty!");
                return;
            }

            System.out.print("Deque: ");
            int i = front;
            while (i != rear){
                System.out.print(dequeue[i] + " ");
                i = (i + 1) % size;
            }
            System.out.print(dequeue[rear]);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dequeue dq = new Dequeue(5);

        while (true){
            System.out.println("\n--- DEQUE OPERATIONS MENU ---");
            System.out.println("1. Insert at Front");
            System.out.println("2. Insert at Rear");
            System.out.println("3. Delete from Front");
            System.out.println("4. Delete from Rear");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the value to insert at front: ");
                    int frontVal = sc.nextInt();

                    dq.insertFront(frontVal);
                    break;

                case 2:
                    System.out.println("Enter the value to insert at rear: ");
                    int rearVal = sc.nextInt();
                    dq.insertRear(rearVal);
                    break;

                case 3:
                    dq.deleteFront();
                    break;

                case 4:
                    dq.deleteRear();
                    break;

                case 5:
                    dq.Display();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again!");

            }
        }
    }
}
