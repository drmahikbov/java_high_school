import java.util.Scanner;

public class Main2 {

	public static int fibo(int k) {
		return ((k == 0) ? 0 : (k == 1) ? 1 : fibo(k - 1) + fibo(k - 2));
	}
	
	public static String fiboSeq(int k) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < k +1; i++) {
			sb.append(fibo(i) + " ");
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please input the amount of numbers of the fibonacci series you want to see:  ");
		Scanner s = new Scanner(System.in);
		System.out.print(fiboSeq(s.nextInt()));
		//s.close();
		//System.out.println(fibo(20));
	}
	

}
