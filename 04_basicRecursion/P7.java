package recursion;

public class P7 {

	

	private static void reverseArray(int[] arr) {
		// TODO Auto-generated method stub

		System.out.println("Original array:-");
		for(int i = 0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Reversed array:-");
		
		for(int i = arr.length-1 ;i >= 0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}


	private static void reverseArrayRec(int[] arr,int index) {
		// TODO Auto-generated method stub
		
		if(index == 0) {
			return;
		}
		
		System.out.print(arr[index]+ " ");
		index--;
		reverseArrayRec(arr, index);
		
	}
	
	public static void main(String[] args) {
	
		int arr[] = {5,4,3,2,1};
		
		reverseArray(arr);
		System.out.println("Recersion:-");
		reverseArrayRec(arr,arr.length-1);
	}
}
