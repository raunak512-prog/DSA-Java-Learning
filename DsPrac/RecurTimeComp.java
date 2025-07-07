package DsPrac;

import java.util.Random;
import java.util.Scanner;

public class RecurTimeComp {
    static Random rand = new Random();
    public static int function(int n){
        int i = 0;
        if (n<=0){
            System.out.println("Invalid number.");
            return 0;
        }
        else {
            i = rand.nextInt(n);
            System.out.println("this..");
            return function(i) + function(n - 1 -i);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number..");
       int nu = sc.nextInt();

        int result = function(nu);
        System.out.println("Result: " + result);
    }
}
