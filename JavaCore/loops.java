package JavaCore;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to extract value. And wanted to print it in the revrese.");
        int a = sc.nextInt();
        int i = a;
        //do {
            //System.out.println(i);
            //i++;
        //}while (i <= n);

       // for (i = 1; i <=n; i = i+2){
            //System.out.println(i);

       // }

        for (i = a; i>=0; i--){
            System.out.println(i);

        }

    }
}

