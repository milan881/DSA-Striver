package pattern;

public class P10 {

	public static void nStarTriangle(int n) {
		
		for(int i=0;i<=n;i++) {
			for(int j =0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");	
		}
		for(int i=0;i<=n;i++) {
		for(int m =0;m<n-i-1;m++) {
			System.out.print("*");
		}
		System.out.println("");	
		}
		
	}
	
	public static void main(String[] args) {
		nStarTriangle(3);
	}
}

