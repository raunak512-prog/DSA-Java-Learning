package JavaCore;

import java.util.Scanner;

public class sumthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();

        int total = a + b + c;
        System.out.println("The sum of the three numbers are:" + total);
    }
}
