import java.*;
import java.util.Scanner;

public class Main {

	public static double pi(double N) {
		int nc = 0;
		int no = 0;
		double x = 0;
		double y = 0;
		double r = 0;
		
		for(int i = 0; i < N; i++) {
			x =  Math.random();
			y =  Math.random();
	
			r = x*x + y*y;
			if (r < 1) {
				nc++;
			} else {
				no++;
			}
		}
		System.out.println("Values are: " + no + " " + nc);
		
		return ((float)4*nc/N);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a value for N in order to get a precise value for pi: ");
		Scanner N = new Scanner(System.in);
		System.out.println(pi(9999*N.nextDouble()));
	}
}
