package DsPracProblems;

import java.util.Scanner;

public class ArrayInsertProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int size = sc.nextInt();
        int[] Arr = new int[size];
        System.out.println("Enter the " + size + " elements.");
        for (int i = 0; i < size; i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to insert in an array.");
        int number  = sc.nextInt();
        System.out.println("Enter the position you want to enter in an array. (0 TO " + size  + " )");
        int pos = sc.nextInt();

        if (pos < 0 || pos > size){
            System.out.println("Invalid Position. Try Again!");
            return;
        }
        int[] newArr = new int[size + 1];
        for (int i = 0; i < pos; i++){
            newArr[i] = Arr[i];
        }
        newArr[pos] = number;
        for (int i = pos; i < size; i++){
            newArr[i + 1] = Arr[i];
        }
        System.out.println("After Insertion the new Array is.");
        for (int value : newArr){
            System.out.println(value +  " ");
        }
    }
}
