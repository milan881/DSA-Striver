package recursion;

public class P9 {

	static int num1 = 0;
	static int num2 = 1;
	static int num3;
	static int n;
	
	public static void main(String[] args) {
		
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		//fibo(5);
		fiboRec(4);
	}
	/*
	private static void fibo(int fibo) {
		// 0 1 1 2 3 4 5
		for(int i = 0; i <= fibo;i++) {
			num3 = num1+num2;
			System.out.print(num3+" ");
			num1 = num2;
			num2 = num3;
		}
	}
	*/
	public static void fiboRec(int fo) {
		if(fo <= n)
			return;
		num3 = num1+num2;
		System.out.print(num3+" ");
		num1 = num2;
		num2 = num3;
		n++;
		fiboRec(fo);
	}
	
}
