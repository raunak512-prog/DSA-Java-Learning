package StacksPrac;

import java.util.Scanner;
import java.util.Stack;

public class InsertElementBottomStack {
    public static void insertAtBottom(Stack<Integer> stack, int element){
        // Base case: if stack is empty, push the element

        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        // Hold all items in Function Call Stack
        int top = stack.pop();
        insertAtBottom(stack, element);

        // Push all held items back
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 elements: ");
        int num = 4;

        for (int i = 0; i < num; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            stack.push(sc.nextInt());
        }

        System.out.println("Enter the element you want to insert at bottom: ");
        int insert = sc.nextInt();

        // Insert at bottom using recursion
        insertAtBottom(stack, insert);

        // Print the stack by popping all elements
        System.out.println("\nStack after inserting at bottom:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }



    }
}