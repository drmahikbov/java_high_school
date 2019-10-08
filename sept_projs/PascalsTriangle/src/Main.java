import java.util.Scanner;

public class Main {

	public static int fact(int n) { // Simple factorial method
		return (n == 0 ? 1 : n * fact(n - 1));
	}
	
	public static long comb(int n, int k) {
		// n is the y-axis and k is the x-axis
		// This is the formula for any given number in the triangle
		return (fact(n) / (fact(k)*fact(n - k)));
	}
	
	public static void pasc(int n, int stories) {
		// Cycle through each value of x and y with a nested loop
		// and print each number 
		
		for(int y = 0; y < n; y++) {
			//System.out.println("Coefficients for story " + y + " are: ");
			
				for(int x = 0; x < y + 1; x++) {
					// Simply apply the formula and print the number
					
					System.out.print(spaces(y, x, comb(y, x), stories) + " ");
				}
			System.out.println(""); // Make a newline each time a row is over
		}
	}
	
	// This method prints the whole output as an elegant equilateral triangle
	public static String spaces(int y, int x, long number, int stories) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < (stories - y + 1) - 1; i++) {
			sb.append(" ");
		}
		sb.append(number);
		return ( x != 0 ? Long.toString(number) : sb.toString());
	}
	
	// Method that adds the necessary spacing to each number
	public static String charWidth(int n) {
		// For now, it outputs the greatest number in the triangle
		long gn = comb(n-1, (((n-1)/2)));
		int l = Long.toString(gn).length();
		return Long.toString(gn);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ask the user for the number of rows
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your desired number for Pascal's triangle, although not recommended above 10: ");
		int stories = s.nextInt();
		pasc(stories, stories);
		System.out.println("");
		System.out.println("The greatest number in the triangle is: " + charWidth(stories));
		
	}

}
