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
    

      