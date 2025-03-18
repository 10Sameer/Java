import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter rows of first matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter columns of first matrix (rows of second matrix): ");
        int cols1 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int cols2 = sc.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[cols1][cols2];
        int[][] result = new int[rows1][cols2];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < cols1; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

      