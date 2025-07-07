package RecursionDeepDive;

import java.util.Scanner;

public class SubsetSumProblem {

    void SSubset(int[] arr, int index, int sum, int target){
        if (index == arr.length){
            if (sum == target){
                System.out.println("Yes: Found a valid subset.");
            }
            else {
                System.out.println("No: Not found any valid subset.");
            }
            return;
        }

        // Include current element.
        SSubset(arr, index + 1, sum + arr[index], target);

        // Exclude current element.
        SSubset(arr, index + 1, sum, target);
    }

    public static void main(String[] args) {
        SubsetSumProblem ac = new SubsetSumProblem();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        System.out.println("The required answer is: ");
        ac.SSubset(arr, 0, 0, target);
    }
}
