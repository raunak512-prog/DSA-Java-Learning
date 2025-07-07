package RecursionDeepDive;

import java.util.Scanner;

public class ArrayUsingRecursionReverse {
    void PrintArray(int[] arr, int index){
        if (index == arr.length)return;

        PrintArray(arr, index + 1);

        System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayUsingRecursionReverse er = new ArrayUsingRecursionReverse();

        System.out.println("Enter the size of the array: ");
        int size  = sc.nextInt();

        int[] arr= new int[size];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array after reverse: ");

        er.PrintArray(arr, 0);
    }

}
