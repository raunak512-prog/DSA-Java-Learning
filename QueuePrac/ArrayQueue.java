package QueuePrac;
import java.util.Scanner;

public class ArrayQueue {
    static class Queue {
        int front, rear, size;
        int capacity;
        int[] queue;

        Queue(int capacity) { // This is the constructor — called when we create a new Queue object.
            this.capacity = capacity;
            front = 0;
            rear = -1;
            size = 0;
            queue = new int[capacity];
        }

        // Enqueue
        void enqueue(int value) {
            if (isFull()) {
                System.out.println("Queue is full!");
                return;
            }
            rear++;
            if (rear >= capacity) {
                System.out.println("Queue is full!");
                rear--; // undo the increment
                return;
            }
            queue[rear] = value;
            size++;

        }

        // Dequeue
        void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }
            System.out.println("Removed: " + queue[front]);
            front++;
            size--;
        }

        // Peek
        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return queue[front];
        }

        // isEmpty
        boolean isEmpty() {
            return size == 0;
        }

        // isFull
        boolean isFull() {
            return size == capacity;
        }

        // Display
        void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();

        System.out.println("Front element is: " + q.peek());

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // should show "Queue is full!"
        q.display();
    }
}
