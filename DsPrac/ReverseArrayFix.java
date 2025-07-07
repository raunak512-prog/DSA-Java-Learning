package DsPrac;

import java.util.Scanner;

public class ReverseArrayFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        System.out.println("The size of the array is." + size);
         // Takes and stores the size element from the user in the size variable.
        int[] Arr = new int[size];
        System.out.println("Enter the " + size  + " elements.");
        // using for loop for storing user input values in the array.
        for (int i = 0; i < size; i++){
             Arr[i] = sc.nextInt();
        }
        // Using a local variable temp for holding value of index.
        int i = 0;
        int j = 4;
        int temp = Arr[i];
        Arr[i] = Arr[j];
        Arr[j] = temp;

        int k = 1;
        int l = 3;
        int temp1 = Arr[k];
        Arr[k] = Arr[l];
        Arr[l] = temp1;

        int m = 2;
        int n = 2;
        int temp2 = Arr[m];
        Arr[m] = Arr[n];
        Arr[n] = temp2;
        // Calling the Arr using for each loop
        for (int num : Arr){
            System.out.print(num + " ");
        }
    }
}
