package JavaCore;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 2;
        int cols = 3;
        int [][] matrix1 = new int[rows][cols];
        int [][] matrix2 = new int[rows][cols];
        int [][] matrixSum = new int[rows][cols];

        //Input for matrix1.
        System.out.println("Enter the elements for the JavaCore.matrix 1 (2X3): ");
        for (int i = 0; i < rows;i++){
            for (int j = 0;j < cols;j++){
                System.out.println("Matrix1 [" + i + "] [" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        //Input for matrix2.
        System.out.println("Enter the elements for the JavaCore.matrix 2 (2X3): ");
        for (int i = 0; i < rows;i++){
            for (int j = 0;j < cols;j++){
                System.out.println("Matrix2 [" + i + "] [" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }

       //Addition of JavaCore.matrix.
        for (int i = 0;i < rows; i++){
            for (int j = 0;j < cols; j++){
                System.out.print(matrixSum[i][j] = matrix1[i][j] + matrix2[i][j]);
            }
        }

        //Displaying the result.
        System.out.println("\n Sum of the matrices:");
        for (int i = 0;i < rows; i++){
            for (int j = 0;j < cols;j++){
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
