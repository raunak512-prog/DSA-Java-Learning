package StacksPrac;

import java.util.Scanner;
import java.util.Stack;

public class peekTopElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter the size of the stack: ");
        int size = sc.nextInt();
        System.out.println("Enter the " + size + " elements");
        for (int i = 0; i < size;i++){
            stack.push(sc.nextInt());
        }
        System.out.println("Stack before peek\n " + stack);
        if (!stack.isEmpty()){
            int top = stack.peek();
            System.out.println("Top element Peeked : " + top);
        }
        else {
            System.out.println("Stack is empty: ");
        }
        System.out.println("Stack after peek remains same " + stack);

    }
}
