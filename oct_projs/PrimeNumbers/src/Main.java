
import java.*;
import java.util.Scanner;

public class Main {

	public static float Primes(float n, float k) {
		return ((n % k) != 0 ? Primes(n, k-1) : Primes(n-1, n-1));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(Primes(s.nextFloat(), s.nextFloat()-1));
	}

}
