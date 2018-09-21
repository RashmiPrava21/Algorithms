package SortingSearching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountingSort {
	
	public char findfirstrepeatingmapsort(char[] arr) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		//Using Iterator
		Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator();
		char ch = 0;
		int max = 0;
		while(itr.hasNext()) {
			Map.Entry<Character, Integer> entry = itr.next();
			if(entry.getValue() > max) {
				max = entry.getValue();
				ch = entry.getKey();
			}
		}
		System.out.println("Using Iterator found first repeating character: "+ ch);

		
		//using entryset
		int largest = 0;
		char c = 0;
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() > largest) {
				largest = entry.getValue();
				c = entry.getKey();
			}
		}
		System.out.println("Using map entryset found the first repeating character: " + c);
		return ch;
	}
	
	public void charactersort(char[] arr) {
		
		int n = arr.length;
		char[] output = new char[n];
		int[] count = new int[256];
		
		for(int i = 0; i < 256; i++) {
			count[i] = 0;
		}
		
		for(int i = 0; i < n; i++) {
			++count[arr[i]];
		}
		
		for(int i = 1; i < 256; i++) {
			count[i] += count[i-1];
		}
		
		for(int i = 0; i < n; i++) {
			output[count[arr[i]] - 1] = arr[i];
			--count[arr[i]];
		}
		
		for(int i = 0; i < n; i++) {
			arr[i] = output[i];
		}
	}
	
	public void countingsort(int[] arr) {
		
		int[] output = new int[arr.length];
		int[] count = new int[30];
		
		for(int i = 0; i < 30; i++) {
			count[i] = 0;
		}
		
		for(int j = 0; j < arr.length; j++) {
			++count[arr[j]];
		}
		
		for(int i = 1; i < 30; i++) {
			count[i] += count[i - 1];
		}
		
		for(int i = 0; i < arr.length; i++) {
			output[count[arr[i]] - 1] = arr[i];
			--count[arr[i]];
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = output[i];
		}
	}

	public static void main(String[] args) {
		
		CountingSort cs = new CountingSort();
		int[] array = {1, 4, 1, 2, 7, 5, 2};
		char[] ch_array = {'g', 'e', 'k', 's', 'k', 'k', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'};
		cs.countingsort(array);
		cs.charactersort(ch_array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(ch_array));
		System.out.println(cs.findfirstrepeatingmapsort(ch_array));
	}

}