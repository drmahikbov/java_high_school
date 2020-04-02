import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Fill in manually the matrix
		int[][] mymatrix = { {1, 2, 3, 5, 7},
							  {0, 2, 4, 6, 8} };
		
		// Set the size of the transpose matrix
		int[][] mytranspose = new int[5][2];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				// The transpose is nothing more than the elements switched
				mytranspose[i][j] = mymatrix[j][i];				
			}
			// Print each row
		System.out.println(Arrays.toString(mytranspose[i]));
		}
	}
}
