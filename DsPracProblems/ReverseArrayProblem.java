package DsPracProblems;

import java.util.Scanner;

public class ReverseArrayProblem {
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
        int begin = 0;
        int exit  = size - 1;
        while (begin < exit){
           int place = Arr[begin];
           Arr[begin] = Arr[exit];
           Arr[exit]= place;
           begin++;
           exit--;
        }
        System.out.println("After reversing the array.");
        for (int value : Arr){
            System.out.println(value + " ");
        }

    }
}
