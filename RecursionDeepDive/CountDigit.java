package RecursionDeepDive;

import java.util.Scanner;

public class CountDigit {
    int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        CountDigit sc = new CountDigit();

        System.out.println("Enter the number: ");
        int num = tc.nextInt();

        int result = sc.countDigits(num);

        System.out.println(result);
    }
}
