
public class Main {

	
	public static double zetaSum(double n) {
		return (n > 0 ? zetaSum(n-1) + 1/n : 0);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(zetaSum(5));
	}

}
