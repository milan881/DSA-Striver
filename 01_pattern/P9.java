package pattern;

public class P9 {

    public static void nStarDiamond(int n) {
    	for(int i =0;i<n;i++){
        	for(int j=0;j<n-i-1;j++) {
        		System.out.print(" ");
        	}
        	for(int k =0;k<i*2+1;k++) {
        		System.out.print("*");
        	}
        	for(int j=0;j<n-i-1;j++) {
        		System.out.print(" ");
        	}
        	System.out.println("");
    	}
    	for(int i =0;i<n;i++) {
            for(int j =0;j<i;j++){
                System.out.print(" ");
            }
            for(int k =0 ;k<2*(n-i)-1;k++){
                System.out.print("*");
            }
            for(int j =0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void main(String [] args){
    	nStarDiamond(3);
    }

}