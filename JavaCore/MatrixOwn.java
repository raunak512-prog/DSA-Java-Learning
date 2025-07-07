package JavaCore;

import java.util.Scanner;

public class MatrixOwn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 2;
        int cols = 3;
        int [][] mat1 = new int[rows][cols];
        int [][] mat2 = new int[rows][cols];
        int [][] mat3 = new int[rows][cols];
        System.out.println("Enter the elements for matrix1 (2X3) ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.println("Matrix1 [" + i + "] [" + j + "]: ");
                 mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements for matrix2 (2X3) ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.println("Matrix2 [" + i + "] [" + j + "]: ");
                mat2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
