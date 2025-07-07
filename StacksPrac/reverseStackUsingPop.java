package StacksPrac;

import java.util.Scanner;
import java.util.Stack;

public class reverseStackUsingPop {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        int size = sc.nextInt();
        System.out.println("Enter the " + size + " elements: ");
        for (int i = 0; i < size; i++){
            stack.push(sc.next());
        }
        System.out.println("Stack before popping: " + stack);
        System.out.println("Reversed order ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
