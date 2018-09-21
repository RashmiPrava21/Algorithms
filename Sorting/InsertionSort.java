package SortingSearching;

import java.util.Arrays;

public class InsertionSort {
	
	public void sort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int j = i-1;
			int k = arr[i];
			
			while(j >= 0 && arr[j] > k) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = k;
		}
	}

	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		int[] arr = {64, 11, 25, 12, 22, 11, 90};
		is.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
