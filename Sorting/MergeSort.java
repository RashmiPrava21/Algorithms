package SortingSearching;

import java.util.Arrays;

public class MergeSort {
	
	public void mergesort(int[] arr) {
		
		sort(arr, 0, arr.length - 1);
	}
	
	public void sort(int[] arr, int l, int r) {
		if(l < r) {
			int mid = (l + r)/2;
			sort(arr, l, mid);
			sort(arr, mid+1, r);
			
			merge(arr, l, mid, r);
		}
	}
	
	public void merge(int[] arr, int l, int mid, int r) {
		
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		
		for(int i = 0; i < n1; i++) {
			L[i] = arr[l+i];
		}
		
		for(int j = 0; j < n2; j++) {
			R[j] = arr[mid + 1 + j];
		}
		
		int i = 0;
		int j = 0;
		int k = l;
		
		while(i < n1 && j < n2) {
			
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}else {
				arr[k] = R[j];
				j++;
			}
			
			k++;
			
		}
		
		while(i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		
		MergeSort ms = new MergeSort();
		int[] array = {1, 4, 1, 2, 7, 5, 2};
		
		ms.mergesort(array);
		System.out.println(Arrays.toString(array));
	}

}
