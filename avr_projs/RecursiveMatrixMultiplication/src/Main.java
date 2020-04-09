import java.util.Arrays;
import java.util.Scanner;

public class Main {

	// This method takes as input matrix size
	public static int[][] createMatrix(int n) {
		
		// Create matrix with input size
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				// Fill in the values for the inferior triangular matrix
				if (i >= j) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = 0;					
				}
			}
//			System.out.println(Arrays.toString(matrix[i]));
		}
		
		return matrix;
	}
		
	// This function takes as input the matrix product of two  matrices of following sizes, as in
	// A * B = C, n x m * m x p = n x p
	public static int[][] multiplyMatrix(int[][] A, int[][] B, int n, int m, int p) {
//		System.out.println("Start matrix product");
//		System.out.println("");
		
		// Create matrix in order to store the product
		int[][] C = new int[n][p];
		
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < p; k++) {
				
				// Just fill in the math
				for (int j = 0; j < m; j++) {
				C[i][k] += A[i][j]*B[j][k] ;	
				}
				
//				if (k == (n - 1)) {				
//					System.out.println(Arrays.toString(C[i]));
//				}
			
			}
//			System.out.println(Arrays.toString(C[i]));
		}
		
//		System.out.println("");
//		System.out.println("End the matrix product");
		return C;
	}
		
	public static int[][] powerMatrix(int[][] A, int[][] B, int k, int n, int m, int p) {
		return ((k == 1) ? B : powerMatrix(A, multiplyMatrix(A, B, n, m, p), k-1, n, n, n));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Input matrix size: ");
		int n = s.nextInt();
		System.out.println("Input matrix power: ");
		int k = s.nextInt();
		

//		Recursive k-th call of matrix multiplication method
		System.out.println(Arrays.deepToString(powerMatrix(createMatrix(n), createMatrix(n), k, n, n, n)).replaceAll("],", "]" + System.lineSeparator()));	
	}
}
