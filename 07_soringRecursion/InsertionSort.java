package soringRecursion;

public class InsertionSort {
	
	private static void insertionSort(int[] arr, int i) {
		// TODO Auto-generated method stub
		if(i == arr.length) {
			return;
		}
		
		insert(arr,i);
		insertionSort(arr, i+1);
		
	}
	
	
	private static void insert(int[] arr, int j) {
		// TODO Auto-generated method stub
		if(j > 0 && arr[j-1]>arr[j]) {
			int temp = arr[j-1];
			arr[j-1] = arr[j];
			arr[j] = temp;
		
		insert(arr,j-1);
		}
	}
			

	public static void main(String[] args) {
		int arr[] = {13,46,24,54,20,9};
		/*
		for(int i = 0; i<= arr.length-1;i++) {
			int j = i;
			while(j > 0 && arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		
*/		insertionSort(arr,0);
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}


}
