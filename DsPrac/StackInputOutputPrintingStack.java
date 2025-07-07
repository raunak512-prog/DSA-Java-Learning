package DsPrac;
import java.util.Scanner;
import java.util.Stack;
public class StackInputOutputPrintingStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number you want to push. ");
        int push = sc.nextInt();
        int element;
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < push; i++) {
            System.out.println("Enter elements." + (i + 1) + ":");
            element = sc.nextInt();
            stack.push(element);
        }
        while (!stack.isEmpty()) {
            int num = stack.peek();
            if (num % 2 == 0) {
                sum += num;
                System.out.println("Even element in lifo is " + stack.pop());
            }
            if (num % 2!= 0){
                sum1 += num;
                System.out.println("Odd element in lifo is " + stack.pop());
            }
        }
        System.out.println("sum of the even number is " + sum);
        System.out.println("sum of the odd number is " + sum1);
    }
}


