package basicMaths;

public class DivisorOfNo {

    public int divisors(int n) {
		
    	int m = 1;
    	int div = 0;
    	while(n >= m) {
    		if(n % m == 0) {
    			System.out.println(m);
    			div = m;
    			m++;
    			
    		}
    		else {
    			m++;
    		}
    	}
    	
    	return div;
    }
	
	public static void main(String[] args) {
		
		DivisorOfNo d1 = new DivisorOfNo();
		d1.divisors(8);
		
	}
	
}
