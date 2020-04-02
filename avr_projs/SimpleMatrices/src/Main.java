import java.util.Arrays;

public class Main {

	
	public static int[][] matrixCalc(int k, int[][] matrix) {
		
		for (int lignes = 0; lignes < matrix.length; lignes++) {
			for (int colonnes = 0; colonnes < matrix[lignes].length; colonnes++) {
				matrix[lignes][colonnes] *= k;	
			}
		}
		
		return matrix;
	}
	
	public static int[][] addMatrices(int[][] m1, int[][] m2, int[][] m3) {
		int[][] supermatrix = new int[2][3];
		
		for (int i = 0; i < m3.length; i++) {
			for (int j = 0; j < m3[i].length; j++) {
			supermatrix[i][j] = m1[i][j] + m2[i][j] + m3[i][j];
			}
		}
	
		return supermatrix;
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[][] matrix1 = { {1, 2, -1},
						{2, 1, 1} };
	int coef1 = 4;
	
	int[][] matrix2 = { {-1, 3, 1},
						{2, 1, 2} };
	int coef2 = 3;
	
	int[][] matrix3 = { {2, 4, 1},
						{-1, 3, 2} };
	int coef3 = -2;
	
//	System.out.println(Arrays.deepToString(matrixCalc(coef1, matrix1)));
//	System.out.println(Arrays.deepToString(matrixCalc(coef2, matrix2)));
//	System.out.println(Arrays.deepToString(matrixCalc(coef3, matrix3)));
	System.out.println();
	
	
	System.out.println(Arrays.deepToString(addMatrices(matrixCalc(coef1, matrix1), matrixCalc(coef2, matrix2), matrixCalc(coef3, matrix3))));

	
	
	}

}
