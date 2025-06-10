package basicMaths;

public class Reverse {

	public static void main(String[] args) {
		int n = -12;
		int reversed = reverseNumber(n);
		System.out.println(reversed);  // Expected output: 0
	}

	static int reverseNumber(int n) {
		int rev = 0;

		while (n != 0) {
			int digit = n % 10;

			// Check for overflow BEFORE updating rev
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
				return 0;
			}
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
				return 0;
			}

			rev = rev * 10 + digit;
			n = n / 10;
		}

		return rev;
	}
}
