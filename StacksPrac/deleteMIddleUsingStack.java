package StacksPrac;

import java.util.Scanner;
import java.util.Stack;

public class deleteMIddleUsingStack {
    // Helper function to delete middle part
    public static void deleteMiddle(Stack<Integer> stack, int current, int size){
        if (current == size/2){
            stack.pop();
            return;
        }
        int top = stack.pop();
        deleteMiddle(stack, current + 1, size);
        stack.push(top);
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
        int siz = stack.size();
        deleteMiddle(stack, 0, size);
        System.out.println("After Deleting Middle: " + stack);
    }
}
