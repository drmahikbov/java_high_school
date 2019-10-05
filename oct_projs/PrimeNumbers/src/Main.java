import java.*;
import java.util.Scanner;

public class Main {

	public static int Primes(int n, int k) {
		//System.out.println("The values for n and k are: " + n + " and " + k);
		return ((k < 2 && n < 2) ? PrintPrimes(n) : (k == 1 && n > 1) ? PrintPrimes(n) : (n % k) != 0 ? Primes(n, k-1) : Primes(n-1, n-2));
		// Check if k and n are lower than 2 we're done
		// If k is 1 and n is greater we've found a prime and have to print it
		// If n modulo k yields 0 then n is not prime and check with the following number
		// If it doesn't, then k doesn't divide n and we'll do n modulo k - 1 until k = 1 and we have our prime number
	}
	
	public static int PrintPrimes(int n) {
		System.out.println(n);
		return ((n == 1) ? n : Primes(n-2, n-3));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		Primes(num, (num-1));
	}

}
