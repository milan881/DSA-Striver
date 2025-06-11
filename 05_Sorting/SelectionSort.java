package sorting;

public class SelectionSort {
		
	public static void main(String[] args) {
	
		int arr[] = {13,46,24,54,20,9};
		selection(arr);
		
	}

	private static void selection(int[] arr) {
	for(int i = 0;i<=arr.length-2;i++) {
		int min = arr[i];
		for(int j = i+1;j<=arr.length-1;j++) {
			if(min >= arr[j]) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
 			}
		}
	}
	
	for (int i : arr) {
		System.out.println(i);
	}
		
		
	}
}
