package DsPracProblems;

import java.util.Scanner;

public class ArrayMaxMinProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int size = sc.nextInt();
        int[] Arr = new int[size];

        System.out.println("Enter the " + size + " elements.");
        for (int i = 0; i < size; i++) {
            Arr[i] = sc.nextInt();
        }
        int max = Arr[0];
        int min = Arr[0];
        for (int i = 0; i < size; i++){
            if (Arr[i] > max){
                max = Arr[i];
            }
            if (Arr[i] < min){
                min = Arr[i];
            }
        }
        System.out.println("The maximum element is " + max);
        System.out.println("The minimum element is " + min);
    }
}
