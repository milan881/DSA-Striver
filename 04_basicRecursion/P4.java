// print form 1 to N without using i++;

package recursion;

public class P4 {

	
	public static void main(String[] args) {
	
		printInt(5,5);
		
	}

	private static void printInt(int i, int j) {
		if (i < 1)
			return;
		
		printInt(i-1, j);
		System.out.println(i);
	}
	
}
