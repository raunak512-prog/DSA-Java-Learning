package LeetCode;

import java.util.Scanner;

public class Best_Time_Buy_Sell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price range. ");
        int size = sc.nextInt();
        int[] Arr = new int[size];
        System.out.println("Enter the prices between price range: " + size);
        for (int i = 0; i < size; i++){
            Arr[i] = sc.nextInt();
        }
        int max = Arr[0];
        int min = Arr[0];
       for (int i = 1;i < Arr.length; i++){
           if (Arr[i] > max){
               max = Arr[i];
           }
       }
       for (int j = 1; j < Arr.length; j++){
           if (Arr[j] < min){
               min = Arr[j];
           }
       }
       int result = max - min;

    }
}
