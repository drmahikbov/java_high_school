import java.util.Scanner;

public class Main {

	public static StringBuilder randseq(float n) {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(Math.random() + " ");
		}
		
		return sb;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a value for N: ");
		Scanner N = new Scanner(System.in);
		System.out.println(randseq(N.nextFloat()));
	}

}
