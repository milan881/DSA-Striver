//Print the Subsequences

package recursion;

import java.util.ArrayList;

public class Subsequence {

		
	public static void sub(int i ,int[] arr, ArrayList<Integer> list) {
		
		if(i  == arr.length) {
			System.out.println(list);
			return;
		}
		
		list.add(arr[i]);  //take
		sub(i+1, arr, list);
		
		list.remove(list.size()-1);//remove
		sub(i+1, arr, list);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {3,1,2};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		sub(0, arr , list);
		
	}
	
}
