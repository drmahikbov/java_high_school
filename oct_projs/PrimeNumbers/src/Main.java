
import java.*;
import java.util.Scanner;

public class Main {

	public static int Primes(int n, int k) {
		return ((k == 1) ? n : (n % k) != 0 ? Primes(n, k-1) : (n % k) == 0 ? (n*1000+k) : 1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("The primes are: " + Primes(num, (num-1)));
		//System.out.print(8/0);
		System.out.println(num + " " + (num-1));
	}

}
