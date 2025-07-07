package StacksPrac;

import java.util.Scanner;
import java.util.Stack;

public class reverseStackUsingRecursion {

    // Helper function to insert element at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, element);
        stack.push(top);
    }

    // Main function to reverse the stack
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the stack:");
        int size = sc.nextInt();

        System.out.println("Enter the " + size + " elements:");
        for (int i = 0; i < size; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("Original Stack: " + stack);
        reverseStack(stack);
        System.out.println("Reversed Stack: " + stack);
    }
}
