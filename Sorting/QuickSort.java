package SortingSearching;

import java.util.Arrays;

public class QuickSort {
	
	public void sort(int[] arr, int l, int r) {
		
		if(l < r) {
			
			int pivot = findpivot(arr, l, r);
			
			sort(arr, l, pivot - 1);
			sort(arr, pivot + 1, r);
		}
	}
	
	public int findpivot(int[] arr, int low, int high) {
		
		int p = arr[high];
		int i = low - 1;
		
		for(int j = low; j <= high - 1; j++) {
			if(arr[j] <= p) {
				i++;
				
				swap(arr, i, j);
			}
		}
		
		swap(arr, i+1, high);
		
		return i+1;
	}
	
	public void swap(int[] arr, int l_index, int r_index) {
		
		int temp  = arr[l_index];
		arr[l_index] = arr[r_index];
		arr[r_index] = temp;
	}

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		
		int[] arr = {64, 11, 25, 12, 22, 11, 90};
		
		qs.sort(arr, 0, arr.length - 1);
		
		System.out.println(Arrays.toString(arr));
	}

}
