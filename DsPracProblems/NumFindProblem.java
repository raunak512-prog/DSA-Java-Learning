package DsPracProblems;

import java.util.Scanner;

public class NumFindProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the " + size + " elements");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to find.");
        int num = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length;i++){
            if (arr[i] == num){
                found = true;
                break;
            }
        }

        if (found){
            System.out.println("The number is in the array");
        }
        else {
            System.out.println("The number is not in the array");
        }
    }
}
