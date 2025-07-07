package JavaCore;

import java.util.Scanner;

public class ps5 {
   // static int factorial(int n){
     //   if (n==0 || n==1){
     //       return 1;
   //     }
    //    else {
     //       return n*factorial(n-1);        //factorial(n) = n*factorial(n-1)
    //    }
   // }
    public static void main(String[] args) {
        // Question 1.  star pattern.
        /*

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int i = 1;
        int j = 1;
        int a = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int b = sc.nextInt();

        for (i = 1; i<=a; i++){
            System.out.println();

            for (j = a - i + 1;j > 0; j--){
                System.out.print("\t*");

            }
        }
       */

        // Question 2. sum of first n number using while loop.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of even numbers you want the sum.");
        // int a = sc.nextInt();
        // int i = a;
        // while (i <= 2*a){
        //   System.out.println(i);
        // i = i + 2;
        // }

        // Question 3. Multiplication table.
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the number you want the multiplication of.");
       // int cons = sc.nextInt();
       // int i = 1;
       // System.out.println("The multiplication of given number " + cons + " is:");
       // for (i = 1;i<=10;i++){
       //     System.out.println(cons + "X" + i + "="+ cons * i);
       // }

        //Question 4. Reverse Multiplication table.
        // Scanner sc = new Scanner(System.in);
         // System.out.println("Enter the number you want the multiplication of.");
         // int cons = sc.nextInt();
         // int i = 10;
         // System.out.println("The multiplication of given number " + cons + " is:");
         // for (i = 10;i >= 1;i--){
            //  System.out.println(cons + "X" + i + "="+ cons * i);
        //  }

        //Question 5. factorial using JavaCore.recursion.
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the number you want the factorial.");
       // int fact = sc.nextInt();
      //  System.out.println(factorial(fact));

        //Question 6,7,8 done.

        //Question 9.sum of results in the multiplication table.

        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number you want the multiplication of.");
        int cons = sc.nextInt();
        int i = 1,sum=0;
         System.out.println("The multiplication of given number " + cons + " is:");
         for (i = 1;i<=10;i++){
             int result = cons * i;
            System.out.println(cons + " X " + i + " = "+ result);
            sum = sum + result;
         }
        System.out.println("The sum of the result is: " + sum);


    }
}