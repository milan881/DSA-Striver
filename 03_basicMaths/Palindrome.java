package basicMaths;

public class Palindrome {

	public boolean isPalindrome(int x) {
		int rev = 0;
		int digit = 0;
		int original = x;
		
		while(x>0) {
			digit = x % 10;
			rev = rev * 10 + digit;
			x = x / 10;
		}
		System.out.println(rev);
		if(rev == original) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		Palindrome pa = new Palindrome();
		System.out.println(pa.isPalindrome(121));
	}
	
}
