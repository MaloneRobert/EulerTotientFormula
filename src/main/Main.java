package main;

/**
 * This program is all contained in the Main class. This program contains a method that calculates
 * the Euler Totient function for any number n with a gcd method. This code was completed for a
 * discrete mathematics course at Colorado College.  Euler's totient function counts the positive
 * integers up to a given number n that are relatively prime to n. Test
 *
 * @author Robert Malone
 */

public class Main {

	public static void main (String args[]){
		System.out.println("EulerTotientFunctionTest");
		System.out.println("");
		//test with new Branch

		//Calculate Euler's Totient for 1-10
		for(int n=1; n<=10; n++){
			System.out.printf("phi(%d) = %d\n", n, phiFunction(n));
		}

		//Calculate Euler's Totient for larger random numbers
		int h = 76;
		System.out.printf("phi(%d) = %d\n", h, phiFunction(h));
		int x = 146;
		System.out.printf("phi(%d) = %d\n", x, phiFunction(x));
		int b = 248;
		System.out.printf("phi(%d) = %d\n", b, phiFunction(b));
		int a = 1354;
		System.out.printf("phi(%d) = %d\n", a, phiFunction(a));
		int c = 86345;
		System.out.printf("phi(%d) = %d\n", c, phiFunction(c));
		int d = 8404968;
		System.out.printf("phi(%d) = %d\n", d, phiFunction(d));
	}

	/***
	 * This method returns the Euler's Totient
	 * @param input is the number we want to find the Euler's Totient of
	 * @return Euler's Totient
	 */
	private static int phiFunction(int input){
		int result = 1;
		for(int i=2; i<input; i++){
			if(gcd(i, input) == 1){
				result++;
			}
		}
		return result;
	}

	/***
	 * This method calculates the gcd of two numbers
	 * @param a
	 * @param b
	 * @return
	 */
	private static int gcd(int a, int b){
		if(a==0){
			return b;
		}
		return gcd(b%a, a);
	}
}
