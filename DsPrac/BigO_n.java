package DsPrac;

import java.util.Scanner;

public class BigO_n {
    public static void func1(int[] array, int length) {
        /*
        int n = 20;
        int x = 1;
        int y = 1;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0;i < n; i++){
            count1++;
            for (int j = 0;j < n; j++){
                x = y + 1;
                y++;
                count2++;
            }
        }
        System.out.println(x);
        System.out.println("Total outer loop execution is : " + count1);
        System.out.println("Total inner loop execution is : " + count2);

         */
        /*
        int[] arr = {2, 3, 4};
        int product = 2;

        for (int i = 0; i < arr.length; i++) {
           product = product *= arr[i];
        }
        System.out.println(product); // Output: 24


         */

        int sum = 0;
        int product = 1;
        // Big O(n) is used here because it uses separate for loop.
        // Calculate sum
        for (int i = 0; i < length; i++) {
            sum += array[i];
        }

        // Calculate product
        for (int i = 0; i < length; i++) {
            product *= array[i];
        }

        // Print results (optional, for checking output)
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }

    public static void main(String[] args) {
        //int[] arr = {3, 4, 66};
        //func1(arr,3);
        Scanner sc = new Scanner(System.in);
        int size = 3;
        int[] arr = new int [size];
        System.out.println("Enter the three elements.. ");

        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        func1(arr,size);
    }
}
