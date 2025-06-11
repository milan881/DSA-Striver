package recursion;

public class P1 {
	static int count = 0;
	public static void printString(int n) {
		
		if(n == count) {
			return ;
		}
		else {
			System.out.println("GFG");
			count++;
			printString(5);
		}	
	}
	
	public static void main(String[] args) {
	
		P1.printString(5);
		
	}
}
