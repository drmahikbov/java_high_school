
public class Main {

	// Code your function here
	// We have x squared in our case
	public static double f(int x) {
		return x*x;
	}
	
	// Here comes the Riemann sum
	public static double riemannSum(int a, int b) {
		long N = 10000000;
		double base = ((b-a)/N) - a;
		double sumleft = 0;
		
			for(int i = a; i <= N; i++) {
				sumleft += base*f(i-1);
			}
			
		System.out.println(sumleft);
		// My formula in order to convert one sum to the other
		double sumright = sumleft - base*f(a) + base*f(b);
		return sumright;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(riemannSum(1, 2));
	}

}
