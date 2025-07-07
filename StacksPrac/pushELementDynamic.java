package StacksPrac;

import java.util.Scanner;
import java.util.Stack;

public class pushELementDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter the size of the element: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements.. ");
        for (int i = 0; i < size; i++){
            stack.push(sc.nextInt());
        }
        System.out.println("Popped " + size + " elements.");
        while (!stack.isEmpty()){
            int top = stack.pop();
            System.out.println(top);
        }
    }
}
