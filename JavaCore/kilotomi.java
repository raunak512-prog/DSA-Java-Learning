package JavaCore;

import java.util.Scanner;
public class kilotomi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of kilometer to convert it into miles: ");
        int a = sc.nextInt();
        float miles = a * 0.621f;
        System.out.println("The value of miles from the given kilometer is:" + miles);
    }
}
