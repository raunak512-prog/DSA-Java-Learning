package JavaCore;

public class ps6 {
    public static void main(String[] args) {

        /* Question 1.
        float [] arrr = {10.0f,20.0f,20.0f,49.45f,89.75f};
        float  sum = 0;
        for (float element: arrr){
            sum  = sum + element;
        }
        System.out.println(sum);
         */

        //Question 2.
        /*
        float [] arrr = {10.0f,20.0f,20.0f,49.45f,89.75f};
        float  num = 10.0f;
        boolean isInArray = false;
        for (float element: arrr){
           if(num==element){
               isInArray = true;
               break;
           }
        }
        if (isInArray){
            System.out.println("The is present in the JavaCore.array.");
        }
        else {
            System.out.println("The is not present in the JavaCore.array.");
        }

         */
        //Question 3.
        /*
        float [] arrr = {95.0f,75.5f,89.0f,78.45f,89.5f};
        float  sum = 0;
        for (float element: arrr){
            sum  = sum + element;
        }
        System.out.println("The sum of your results are: " + sum);
        float avg = sum/ arrr.length;
        System.out.println("The average of your numbers are: " + avg);

         */
        //Question 4.
        int [][] mat1 = { {1,2,3},
                          {4,5,6} };
        int [][] mat2 = { {3,5,8},
                          {7,5,9} };

        int [][] result = { {0,0,0},
                            {0,0,0} };

        for(int i = 0; i<mat1.length;i++){
            for (int j =0;j<mat1[i].length;j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
            }

        }
        for(int i = 0; i<mat1.length;i++){
            for (int j =0;j<mat1[i].length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
