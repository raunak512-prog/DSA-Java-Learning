package DsPrac;

import java.util.Scanner;

public class newAI {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array..");
        int size = sc.nextInt();
        int[] Arr = new int[size];
        System.out.println("Enter " + size + " elements..");
        for (int i = 0;i < size; i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to insert..");
        int element = sc.nextInt();
        System.out.println("Enter the position between (0 to "+ size + ") you want to insert..");
        int pos = sc.nextInt();
        if (pos < 0 || pos > size){
            System.out.println("Invalid position...");
            return;
        }
        int[] newArr = new int[size + 1];
        for (int i = 0;i < pos; i++){
            newArr[i] = Arr[i];
        }
        newArr [pos] = element;
        for (int i = pos; i < size; i++){
            newArr[i + 1] = Arr[i];
        }
        System.out.println("After insertion the new array is..");
        for (int value : newArr){
            System.out.println(value + " ");
        }
    }
}