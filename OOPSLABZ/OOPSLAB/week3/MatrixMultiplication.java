import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the rows and cols of the first matrix:");
        int rowsA = in.nextInt();
        int colsA = in.nextInt();

        System.out.println("Enter the elements of the first matrix:");
        int[][] matA = readMatrix(rowsA, colsA, in);

        System.out.println("Enter the rows and cols of the second matrix:");
        int rowsB = in.nextInt();
        int colsB = in.nextInt();

        System.out.println("Enter the elements of the second matrix:");
        int[][] matB = readMatrix(rowsB, colsB, in);

        if (colsA != rowsB) {
            System.out.println("Invalid dimensions for matrix multiplication andi...!");
        } else {
            int[][] result = multiplyMatrices(matA, matB);

            
            System.out.println("Resultant Matrix:");
            printMatrix(result);
        }

        in.close();
    }

    public static int[][] readMatrix(int rows, int cols, Scanner in) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements row-wise:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        return matrix;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
