package JavaCore;

import java.util.Scanner;

public class ps4 {
    public static void main(String[] args) {

      /*

        Question 1.

        int a = 10;
        if (a == 11){
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }
        */

        /*

         Question 2.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of first subject:");
        int a = sc.nextInt();

        System.out.println("Enter the number of second subject:");
        int b = sc.nextInt();
        System.out.println("Enter the number of third subject:");
        int c = sc.nextInt();

        int total =  a + b + c;
        System.out.println("Your total number is: " + total);

        float percent = (float) total / 300 * 100;

        System.out.println("Your percentage is: " + percent);

        if (total >= 40 && a > 33 && b > 33 && c > 33){
            System.out.println("Congratulations! You  are passed with total percentage of: " + percent);
        }
        else {
            System.out.println("Sorry you are failed! Try again next time.");
        }

         */

       /* Question 3.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary in lakhs: ");
        float s = 2.5f;
        float d = 5.0f;
        float f = 10.0f;
        float a = sc.nextFloat();
        int q = 5;
        int w = 20;
        int e = 30;
        if (a > 2.5f && a < 5.0f){
            System.out.println("Your payable tax on your salary is: " + q + "%");
        }

        else if (a >= 5.0f && a < 10.0f) {
            System.out.println("Your payable tax on your salary is: " + w + "%");
        }

        else if (a >= 10.0f) {
            System.out.println("Your payable tax on your salary is: " + e + "%");
        }
        else {
            System.out.println("You do not have to pay any tax.");
        }
        */

        // Question 4.
        /*

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for the day: 1-monday..... till 7.");

        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("MONDAY");
                break;

            case 2:
                System.out.println("TUESDAY");
                break;

            case 3:
                System.out.println("WEDNESDAY");
                break;

            case 4:
                System.out.println("THURSDAY");
                break;

            case 5:
                System.out.println("FRIDAY");
                break;

            case 6:
                System.out.println("SATURDAY");
                break;

            case 7:
                System.out.println("SUNDAY");
                break;

            default:
                System.out.println("Number is outside of given range.");
        }

         */


        //Question 5.
        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year you want to check if its a leap year: ");
        int a = sc.nextInt();

        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)){
            System.out.println(a + " is a Leap Year.");

        }

        else {
            System.out.println(a + " is not a leap year.");
        }

         */

        // Question 6.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of website.");
        String pc = sc.next();
        if (pc.endsWith(".org")){
            System.out.println("The website is organisational website.");
        } else if (pc.endsWith(".com")) {
            System.out.println("The website is commercial website.");
        } else if (pc.endsWith(".in")) {
            System.out.println("The website is indian website.");
        }

    }


}
