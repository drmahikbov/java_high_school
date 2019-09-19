import java.util.Scanner;

public class Main {

	public static int fibo(int k) {
		return ((k == 0) ? 0 : (k == 1) ? 1 : fibo(k - 1) + fibo(k - 2));
	}
	
	public static String fiboSeq(int k) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < k + 1; i++) {
			sb.append(fibo(i) + " ");
		}
		return sb.toString();
	}
	
	public static float divide(int a, int b) {
		return (float) a / b ;
	}
	
	public static String fiboConv(int k) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < k + 1; i++) {
			sb.append(divide(fibo(i+1), fibo(i)) + " ");
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please input the amount of numbers of the fibonacci series you want to see:  ");
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[2];
		arr[0] = s.nextInt();
		arr[1] = arr[0];
		
		System.out.print(fiboSeq(arr[0]));
		System.out.println("\n");
		System.out.print(fiboConv(arr[0]));
		
		//s.close();
		//System.out.println(fibo(20));
	}
	

}