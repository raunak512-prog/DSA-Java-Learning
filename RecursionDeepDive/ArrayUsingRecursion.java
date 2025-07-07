package RecursionDeepDive;

import java.util.Scanner;

public class ArrayUsingRecursion {

    void printArray(int[] arr, int index){
        if (index == arr.length)return;

        System.out.print(arr[index] + " ");

        printArray(arr, index + 1);
    }

    public static void main(String[] args) {

        ArrayUsingRecursion re = new ArrayUsingRecursion();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array using head recursion: ");
        re.printArray(arr, 0);
    }
}
