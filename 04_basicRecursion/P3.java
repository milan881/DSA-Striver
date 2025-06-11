//sum of no

package recursion;

public class P3 {
	
	static int count = 1, sum =0;
	
	public static int NnumbersSum(int N) {
/*
		if(count > N) {
			return 0;
		}

		sum = sum + count;
		count++;
		NnumbersSum(N);
		return sum;
  */
		
		if(N == 0) {
			return 0;
		}
		
		return N + NnumbersSum(N-1);
    }
	
	public static void main(String[] args) {

		System.out.println(NnumbersSum(3));//1 2 3 =6
		System.out.println(NnumbersSum(4));
	}
	
}
