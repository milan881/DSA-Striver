package recursion;

public class P8 {

	public static void main(String[] args) {
		String str ="abbaa";
		System.out.println(palinderome(0, str.length() - 1, str));
	}

	private static boolean palinderome(int left, int right, String str) {
		
		if(left >= right)
			return true;
		if(str.charAt(left) != str.charAt(right)) {
			return false;
		}
		return palinderome(left+1, right-1, str);
	}
	
}
