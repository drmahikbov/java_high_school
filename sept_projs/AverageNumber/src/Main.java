import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static double aver(int[] ar) {
		int sum = 0;
		for(int i = 0; i < ar.length; i++) {
			sum += ar[i];
			System.out.println(sum);
		}
		
		return (double) sum/ar.length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Number 1 makes it all crash
		 * and numbers are sometimes repeated
		 * for no apparent reason
		 * */
		
		System.out.println("Please enter the amount of numbers to calculate the average with: ");
		Scanner amount = new Scanner(System.in);
		int[] array = new int[amount.nextInt()]; 
		System.out.println(array.length);
		//amount.close();
	
		for(int i = 0; i < amount.nextInt() - 1; i++) {
			System.out.println("Please enter a number: ");
			array[i] = new Scanner(System.in).nextInt();
			//this.close();
			//System.out.println(array[i]);
			
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Answer is: ");
		System.out.println(aver(array));
	
	}

}
