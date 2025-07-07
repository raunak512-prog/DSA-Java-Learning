package StacksPrac;

import java.util.Scanner;
import java.util.Stack;

public class insertElementAtBottomUsingRecursion {
    public static void bottomStack(Stack<Integer> stack, int element){
        if (stack.isEmpty()){
            stack.push(element);
            return;
        }
        int top = stack.pop();
        bottomStack(stack, element);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack..");
        int size  = sc.nextInt();
        for (int i = 0; i < size; i++){
            stack.push(sc.nextInt());
        }
        System.out.println("Original stack.." + stack);
        System.out.println("Enter the element you want to insert..");
        int elem = sc.nextInt();
        bottomStack(stack, elem);
        System.out.println("stack after insertion " + elem + " at bottom" + stack);
    }
}
