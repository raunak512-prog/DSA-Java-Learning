package StacksPrac;

import java.util.Scanner;
import java.util.Stack;

public class checkStackEmpty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter the element size: ");
        int size = sc.nextInt();
        System.out.println("Enter the " + size + " elements");
        for (int i = 0; i < size; i++){
            stack.push(sc.nextInt());
        }
        System.out.println("Popping " + size + " elements");
        while (!stack.isEmpty()){
            stack.pop();
        }
        if (stack.isEmpty()){
            System.out.println("Stack is now empty.");
        }
        else {
            System.out.println("Stack is not empty yet! ");
        }
    }
}
