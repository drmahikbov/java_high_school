import java.util.*;
public class Main {

	
	// This function takes the matrix product of two square matrices, as in
	// A * B = C. This function provides C.
	public static int[][] matrixProd(int[][] B, int[][] A) {
		
		int[][] C = new int[4][4];
		
		for (int i = 0; i < B.length; i++) {
			for (int k = 0; k < C.length; k++) {
				
				
				for (int m = 0; m < A.length; m++) {
				C[i][k] += A[i][m]*B[m][k] ;	
				}
			if (k == C.length -1) {				
				System.out.println(Arrays.toString(C[i]));
			}
			}
		}
		
		System.out.println("");
		return C;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create the matrix
		int[][] ar = {  { 1, 2, 3, 5},
						{ 0, 2, 4, 6},
						{ 0, 0, 3, 6},
						{ 0, 0, 0, 4} };
		
		

		matrixProd(matrixProd(ar, ar), ar);
		
		
	}

}
