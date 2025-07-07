package JavaCore;

import java.util.Scanner;

public class boardpercentcalc {
    public static void main(String[] args) {
        System.out.println("Enter the Number you get on boards: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of sub1:");
        int a = sc.nextInt();
        System.out.println("Enter the marks of the sub2:");
        int b = sc.nextInt();
        System.out.println("Enter the marks of sub3:");
        int c = sc.nextInt();
        System.out.println("Enter the marks of sub4:");
        int d = sc.nextInt();
        System.out.println("Enter the marks of sub5:");
        int e = sc.nextInt();

        float sum = a + b + c + d + e;
        float total = 500;
        System.out.println("The sum of the five subject marks is:" + sum);

        float percent = sum/total * 100;

        System.out.println("The percentage of your marks is: " + percent);


    }
}
