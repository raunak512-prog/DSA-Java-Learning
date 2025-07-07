package RecursionDeepDive;

import java.util.Scanner;

public class SumOfArray {

    int SumArray(int[] arr, int index){

        if (index == arr.length)return 0;

        return arr[index] + SumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfArray er = new SumOfArray();

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int result = er.SumArray(arr, 0);
        System.out.println("The addition of the array numbers are: " + result);

    }
}
