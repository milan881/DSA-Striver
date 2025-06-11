package recursion;

public class P2 {
/*
	static int cn = 1;
	
	public static void printInt(int n) {
		
		if(cn > n )
			return ;
		System.out.println(cn);
		cn++;
		printInt(n);
	}
*/
	
	public static void printInt(int n , int i) {
		
		if(i > n)
			return;
		System.out.println(i);
		i++;
		printInt(n, i);
		
	}
	
	public static void main(String[] args) {
	//	printInt(5);
	
		printInt(5, 1);
	}
	
}
