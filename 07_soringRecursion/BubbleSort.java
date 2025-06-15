package soringRecursion;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr[]= {3,46,24,54,20,9};
		
		bubbleSorting(arr,0,0);
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	private static void bubbleSorting(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(i == arr.length-1) {
			return;
		}
		if(j  < arr.length - 1 - i) {
			if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			bubbleSorting(arr, i, j+1);
		}else {
			bubbleSorting(arr, i+1, 0);
		}
		
	}
}