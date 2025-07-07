package JavaCore;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + " Have a good day. Lets move on to our work");
        System.out.println("Enter the numbers of the three subjects:");
        System.out.println("Enter the marks of first subject: ");
        int a = sc.nextInt();
        System.out.println("Enter the marks of second subject: ");
        int b = sc.nextInt();
        System.out.println("Enter the marks of third subject: ");
        int c = sc.nextByte();
        float sum = a + b + c;
        float total = 300;
        float percent = sum/total * 100;

        System.out.println("The percenatage of your marks are :" + percent);

        float cgpa = percent/9.5f;
        System.out.println("The CGPA from your percentage are are calculated as: " + cgpa);
    }
}
