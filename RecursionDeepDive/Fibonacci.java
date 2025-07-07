package RecursionDeepDive;

import java.util.Scanner;

public class Fibonacci {

    int Fib(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }

        return Fib(n - 1) + Fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci ac = new Fibonacci();
        System.out.println("Enter a number to find the fibonacci: ");
        int num = sc.nextInt();


        int result = ac.Fib(num);
        System.out.println("The fibonacci of the number " + num + " is: " + result);

    }
}
