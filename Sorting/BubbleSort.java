package SortingSearching;

import java.util.Arrays;

public class BubbleSort {
	
	public void sort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {// i < arr.length - 1
			for(int j = 0; j < arr.length - 1; j++) {// j < arr.length-i-1
				if(arr[j+1] <= arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
//		int[] arr = {64, 11, 25, 12, 22, 11, 90};
		int[] arr = {1, 4, 1, 2, 7, 5, 2};
		bs.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
