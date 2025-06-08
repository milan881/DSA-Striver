package pattern;

public class P7 {
	
	  public static void nStarTriangle(int n) {
	         // Write your code here
	    
	        for(int i =0;i<n;i++){
	        	//space
	        	for(int j=0;j<n-i;j++) {
	        		System.out.print(" ");
	        	}
	        	//star
	        	for(int k =0;k<i*2+1;k++) {
	        		System.out.print("*");
	        	}
	        	//space
	        	for(int j=0;j<n-i;j++) {
	        		System.out.print(" ");
	        	}
	        	System.out.println("");
	        }
	    }
	

	public static void main(String[] args) {
		nStarTriangle(5);
		
	}
}

