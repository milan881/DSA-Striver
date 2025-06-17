package sorting;

import java.util.ArrayList;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {3,1,2,4,1,5,2,6,4};
		merg(arr,0,arr.length-1);
		for (int k : arr) {
			System.out.print(k+" ");
		}
	}

	private static void merg(int[] arr, int i, int j) {
		// TODO Auto-generated method stub

		if(i>=j) {
			return;
		}
		int mid = (i+j)/2;

		merg(arr, i, mid);
		merg(arr, mid+1, j);
		mergSort(arr, i, mid,j);		
	}

	private static void mergSort(int[] arr, int i, int mid, int j) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int left = i;
		int right = mid+1;
		
		while(left <= mid && right <= j) {
			if(arr[left] <= arr[right]) {
				list.add(arr[left]);
				left++;
			}else {
				list.add(arr[right]);
				right++;
			}
		}
		while(right<=j) {
			list.add(arr[right++]);
		}
		while(left <= mid) {
			list.add(arr[left++]);
		}
		
		for(int k = 0; k < list.size(); k++) {
			arr[i+k] = list.get(k);
		}
		
	}
}
