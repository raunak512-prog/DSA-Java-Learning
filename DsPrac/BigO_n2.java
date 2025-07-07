package DsPrac;

import java.util.Scanner;

public class BigO_n2 {
    public static void func(int n) {
        int sum = 0;
        int product = 1;
        // Big O(n^2) is used here because it uses nested  for loop.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " , " + j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number..");
        int num = sc.nextInt();
        func(num);
    }
}