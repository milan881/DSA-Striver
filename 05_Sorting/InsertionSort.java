package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		//int arr[] = {13,46,24,54,20,9};
		int arr[] = {4,1,3,9,7};
		insertionSort(arr);
	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i<=arr.length-1;i++) {
			int j = i;
			
			while(j > 0 && arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		

		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		
	}
	
}
