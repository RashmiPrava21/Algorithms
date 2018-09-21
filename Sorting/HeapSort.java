package SortingSearching;

import java.util.Arrays;

public class HeapSort {
	
	public void sort(int[] arr) {
		
		for(int i = arr.length/2 - 1; i >= 0; i--) {
			heapify(arr, arr.length, i);
		}
		
		for(int i = arr.length - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, i, 0);
		}
	}
	
	//find the Kth largest element
	
	public int sort(int[] arr, int k) {
		int n = arr.length;
		
		for(int i = n/2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}
		
//		int count = 0;
		int value = 0;
		for(int i = n - 1; i >= 0; i--) {
			
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			k--;
			
			if(k == 0) {
				value = arr[i];
				break;
			}
			
			heapify(arr, i, 0);
		}
		
		return value;
	}
	
	public void heapify(int[] arr, int len, int index) {
		
		int largest = index;
		int left = 2*index + 1;
		int right = 2*index + 2;
		
		if(left < len && arr[left] > arr[largest]) {
			largest = left;
		}
		
		if(right < len && arr[right] > arr[largest]) {
			largest = right;
		}
		
		if(largest != index) {
			
			int temp = arr[index];
			arr[index] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, len, largest);
		}
	}

	public static void main(String[] args) {
		HeapSort hs = new HeapSort();
		int[] arr = {64, 11, 25, 12, 22, 11, 90};
		
//		hs.sort(arr);
//		System.out.println(Arrays.toString(arr));
		System.out.println(hs.sort(arr, 4));

	}

}
