import java.lang.Math;
import java.util.Scanner;

public class Main {

	public static double quadPos(float a, float b, float c) {
		return (( -b + Math.sqrt(b*b - 4*a*c)) / 2*a);
	}
	
	public static double quadNeg(float a, float b, float c) {
		return (( -b - Math.sqrt(b*b - 4*a*c)) / 2*a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please choose a value for a: ");
		Scanner a = new Scanner(System.in);
		
		System.out.println("Please choose a value for b: ");
		Scanner b = new Scanner(System.in);
		
		System.out.println("Please choose a value for c: ");
		Scanner c = new Scanner(System.in);
		
		
		System.out.println(quadPos((float)a.nextInt(), (float)b.nextInt(), (float)c.nextInt()));
		System.out.println(quadNeg((float)a.nextInt(), (float)b.nextInt(), (float)c.nextInt()));
	}

}
