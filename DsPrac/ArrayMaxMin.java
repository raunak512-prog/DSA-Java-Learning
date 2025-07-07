package DsPrac;

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int size = sc.nextInt();
        int[] Arr = new int[size];
        System.out.println("Enter the " + size + " elements.");
        // using for loop for storing user input values in the array.
        for (int i = 0; i < size; i++) {
            Arr[i] = sc.nextInt();
        }
        // We assume that max and min initialize with 0.
        int max = Arr[0];
        int min = Arr[0];
        //Using for loop to find which element is maximum and minimum.
        for (int i = 0; i < size; i++) {
            if (Arr[i] > max) {
               max  = Arr[i];
            }
            if(Arr[i] < min) {
                min = Arr[i];
            }
        }
        //Printing the result
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
    }
}
