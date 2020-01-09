
public class Main {

	
	public static double sum(int n) {
		return n > 0 ? sum(n-1) + 1/(Math.pow(2, n)) : 1;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(sum(1000));
	}

}
