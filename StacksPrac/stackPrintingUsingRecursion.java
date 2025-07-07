package StacksPrac;

import java.util.Scanner;
import java.util.Stack;

public class stackPrintingUsingRecursion {
    public static void printStack(Stack<Integer> stack){
        if (stack.empty()){
            return;
        }
        int top = stack.pop();

        printStack(stack);

        System.out.println(top);
        stack.push(top);
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements. ");
        for (int  i = 0; i < size; i++){
            stack.push(sc.nextInt());
        }
        System.out.println("Printing the stack..");
        printStack(stack);
    }
}
