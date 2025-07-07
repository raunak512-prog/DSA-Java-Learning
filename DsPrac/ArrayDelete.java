package DsPrac;

import java.util.Scanner;

public class ArrayDelete {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size  = sc.nextInt();
        System.out.println("Enter the " + size + " elements");
        int[] Arr = new int[size];
        for (int i = 0; i < size; i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position of the array you want to delete.");
        int pos = sc.nextInt();
        if (pos <= 0 || pos >= size){
            System.out.println("Invalid position.. Try Again!");
            return;
        }
        int[] newArr = new int[size - 1];
        for (int i = 0; i < pos; i++){
            newArr[i] = Arr[i];
        }
          //newArr[pos] = pos - pos;
        for (int i = pos; i < size;i++){
            newArr[i - 1] = Arr[i];
        }
        System.out.println("After deletion the new array is. ");
        for (int value : newArr){
            System.out.println(value + " ");
        }
    }
}
