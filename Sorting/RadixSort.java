package SortingSearching;

import java.util.Arrays;

public class RadixSort {
	
	public void sort(int[] arr) {
		
		int max = arr[0];
		int exp = 1;
		int[] output = new int[10];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		while(max/exp > 0) {
			
			int[] bucket = new int[10];
			
			for(int i = 0; i < arr.length; i++) {
				bucket[(arr[i]/exp) % 10]++;
			}
			
			for(int i = 1; i < 10; i++) {
				bucket[i] += bucket[i-1];
			}
			
			for(int i = arr.length - 1; i >= 0; i--) {
				output[--bucket[(arr[i]/exp) % 10]] = arr[i];
			}
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = output[i];
			}
			
			exp *= 10;
		}
	}

	public static void main(String[] args) {
		
		RadixSort rs = new RadixSort();
		int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
		rs.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
