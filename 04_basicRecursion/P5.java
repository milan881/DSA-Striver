//N to 1 using backtracking i--; should not be used

package recursion;

public class P5 {
	
	public static void main(String[] args) {
		printInt(5);
	}
	
	private static void printInt(int i) {
		
		if(i <= 0 )
			return;
		
		System.out.println(i);		
		printInt(i-1);
		
		
	}

}
