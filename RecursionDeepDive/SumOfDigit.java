package RecursionDeepDive;

import java.util.Scanner;

public class SumOfDigit {

    int Sum(int n){
        if (n == 0){
            return 0;
        }
        else {
            return (n % 10) + Sum(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        SumOfDigit sc = new SumOfDigit();

        System.out.println("Enter the number: ");
        int num = tc.nextInt();

        int result = sc.Sum(num);
        System.out.println("Sum of digits: " + result);
    }
}
