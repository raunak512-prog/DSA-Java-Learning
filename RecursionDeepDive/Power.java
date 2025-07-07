package RecursionDeepDive;

import java.util.Scanner;

public class Power {
    int power(int x, int n){
        if (n == 0)return 1;
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Power pc = new Power();

        System.out.println("Enter the base (x): ");
        int x = sc.nextInt();

        System.out.println("Enter the exponent (n): ");
        int n = sc.nextInt();

        int result = pc.power(x, n);

        System.out.println( "The result of base " + x +" and exponent "+ n +" is: "+result);
    }
}