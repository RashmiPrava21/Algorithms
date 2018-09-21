package SortingSearching;

import java.util.Arrays;

public class ShellSort {
	
	public void sort(int[] arr) {
		
		for(int gap = arr.length/2; gap > 0; gap /= 2) {
			for(int i = gap; i < arr.length; i++) {
				int temp  = arr[i];
				int j = i;
				
				while(j >= gap && arr[j - gap] > temp) {
					arr[j] = arr[j-gap];
					j = j - gap;
				}
				
				arr[j] = temp;
			}
		}
	}

	public static void main(String[] args) {
		ShellSort ss = new ShellSort();
		int[] arr = {64, 11, 25, 12, 22, 11, 90};
		ss.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
