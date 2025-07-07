package LeetCode;

import java.util.Scanner;

public class Two_Sum {

    public static int[] twoSum(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++){
                for (int j = i + 1; j < arr.length;j++){
                    if (arr[i] + arr[j] == target){
                        return new int[]{i,j};
                    }
                }
            }
            return new int[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array..");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the " + size + " elements.");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int[] result = twoSum(arr, target);
        if (arr.length == 0){
            System.out.println("No indices are found. ");
        }
        else {
            System.out.println("Indices found : " + "[" + result[0] + " , " + result[1] + "]");
        }
    }
}
