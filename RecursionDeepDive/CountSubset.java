package RecursionDeepDive;

import java.util.Scanner;

public class CountSubset {

    int CountSubset(int[] arr, int index, int sum, int target){
        if (index == arr.length){
            if (sum == target){
                return 1;
            }
            else return 0;
        }

        int include = CountSubset(arr, index + 1, sum + arr[index], target);

        int exclude = CountSubset(arr, index + 1, sum, target);

        return include + exclude;
    }

    public static void main(String[] args) {
        CountSubset ac = new CountSubset();
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

        int result = ac.CountSubset(arr, 0, 0, target);

        System.out.println("The required subset is: " + result);


    }
}
