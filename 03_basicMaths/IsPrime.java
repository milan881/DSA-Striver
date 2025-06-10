package basicMaths;

public class IsPrime {

	public static void main(String[] args) {
		/*
		int n = 7;
		int count = 0;
		for(int i = 1;i<= n;i++) {
			if(n % i == 0)
				count++;
		}
		
		if(count == 2) {
			System.out.println("prime no");
		}
		else {
			System.out.println("Not a prime no");
		}
		*/
		
		int n = 10;
		boolean isPrime = true;
		for(int i = 2 ;i<=Math.sqrt(n);i++) {
			if(n % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not A Prime");
		}
	}	
}
