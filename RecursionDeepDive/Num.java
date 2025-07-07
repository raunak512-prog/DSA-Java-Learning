package RecursionDeepDive;

import java.util.Scanner;

public class Num {

    void printFrom1ToN(int n) {
        if (n == 0) return;

        System.out.print(n + " ");
        printFrom1ToN(n - 1);
    }

    public static void main(String[] args) {
         Num sc = new Num();

         Scanner tc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = tc.nextInt();

         sc.printFrom1ToN(num);
    }
}
