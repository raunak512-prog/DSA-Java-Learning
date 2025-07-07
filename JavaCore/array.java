package JavaCore;

public class array {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int i = 0;
        for (i = 0;i < arr.length;i++){
           System.out.println(arr[i]);
        }

        for (i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }

        // for each loop
        System.out.println("Printing using for each loop");

        for(int element: arr){
            System.out.println(element);
        }
    }

}
