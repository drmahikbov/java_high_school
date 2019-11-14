import java.*;
public class Main {

	public static double f(float x) {
		return x*x;
	}
	
	
	public static double carlito() {
	
	long N = 10000000;
	double sum = 0;	
		
		for(int i = 0; i < N; i++) {
			float r = (float) Math.random();
			sum += f(r);
		}
	
	return (sum/N);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(carlito());
	}

}
