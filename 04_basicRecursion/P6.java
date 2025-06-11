//Factorial of a Number : Iterative and Recursive

package recursion;

public class P6 {
	
	private static void factroial(int n) {
		// TODO Auto-generated method stub
		int fact = 1;
		for(int i = n ; i >= 1; i--) {
			fact = fact *i;
		}
		System.out.println(fact);
	}
	
	private static int factorialRec(int n) {
	    if (n == 0 || n == 1) {
	        return 1;
	    }
	    return n * factorialRec(n - 1);
	}
	
	
	
	public static void main(String[] args) {

		factroial(5);
		System.out.println(factorialRec(5));
		
	}
}
