package DsPrac;

import java.util.Scanner;

public class MXELE {
    public static void main(String[] args) {
        //Time Complexity: O(n)
        /*
        int[] arr = {5, 6, 7, 8, 9, 45};
        int max = arr[0]; //O(1)
        for (int i = 1; i < arr.length; i++){  //O(n)
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum is :" + max);
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size  = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the " + size + " elements. ");
        for (int i = 0; i < size; i++){
           arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == min){
                min = arr[i];
            }
        }
        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);
    }
}