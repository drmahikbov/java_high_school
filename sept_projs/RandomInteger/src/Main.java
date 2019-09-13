import java.util.Scanner;
import java.lang.Math;

public class Main {

	/*
	public static int randInt(float n) {
		return (int) (Math.random()*n);
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a value for N: ");
		Scanner N = new Scanner(System.in);
		System.out.println((int) (Math.random()*N.nextDouble()));
	}
}
