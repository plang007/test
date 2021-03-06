package laioffer1;

public class class2quiz {
//	Every even number greater than 2 can be expressed as the sum of two primes
//  Check if this is true, starting from 4
	public static void main(String arg[]) {
		for (int i = 4; i<10000000; i+=20) {
			if (!twosumprime(i)) {
				System.out.println("GoldBach is not always right");
				continue;
			}
		}
	}
	
	public static boolean twosumprime(int even){
		for (int i = 2; i <= even/2; i++) {
			if (isPrime(i) & isPrime(even-i)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isPrime(int n) {
		// Write your solution here
		if (n == 2) {
			return true;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

