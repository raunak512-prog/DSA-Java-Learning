package DsPrac;

import java.util.Scanner;

public class ReverseArrayDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int size = sc.nextInt();
        int[] Arr = new int[size];
        System.out.println("Enter the " + size + " elements.");
        // using for loop for storing user input values in the array.
        for (int i = 0; i < size; i++){
            Arr[i] = sc.nextInt();
        }
        // The code starts to execute from begin to exit.
        int begin = 0;
        int exit = size - 1;
        while (begin < exit){
            int place = Arr[begin];
            Arr[begin] = Arr[exit];
            Arr[exit] = place;
            begin++;
            exit--;
        }
        System.out.println("After reversing an array The Final Output is.");
        //Calling the Arr using for each loop
        for (int num : Arr){
            System.out.println(num + " ");
        }
    }
}
