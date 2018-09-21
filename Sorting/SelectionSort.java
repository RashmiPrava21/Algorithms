package SortingSearching;

import java.util.Arrays;

public class SelectionSort {
	
	public void sort(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++) {
			int min = i;
			
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			
			int temp = arr[min];
			arr[min] =  arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		
		SelectionSort ss = new SelectionSort();
		
		int[] arr = {64, 11, 25, 12, 22, 11, 90};
		ss.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
