package StacksPrac;

import java.util.Scanner;
import java.util.Stack;

public class sortThefuncUsingRecursion {
    // Helper function to sort an element
    public static void insertSorted(Stack<Integer> stack, int element){
        if (stack.isEmpty() || element > stack.peek()){
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertSorted(stack, element);
        stack.push(top);
    }
    public static void sortStack(Stack<Integer> stack){
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        sortStack(stack);
        insertSorted(stack, top);
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
      sortStack(stack);
      System.out.println("ascended Stack: " + stack);
  }
}