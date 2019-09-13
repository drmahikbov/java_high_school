import java.util.Scanner;

public class Main {

	public static int fact(int n) {
		return (n == 0 ? 1 : n * fact(n - 1));
	}
	
	public static long comb(int n, int k) {
		return (fact(n) / (fact(k)*fact(n - k)));
	}
	
	public static void pasc(int p) {
		for(int i = 0; i < p + 1; i++) {
			System.out.println("Coefficients are: ");
				for(int j = 0; j < i + 1; j++) {
					System.out.print(comb(i, j) + " ");
				}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your desired number for Pascal's triangle: ");
		pasc(s.nextInt());
	}

}
