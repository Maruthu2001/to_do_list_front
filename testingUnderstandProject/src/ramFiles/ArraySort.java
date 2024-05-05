package ramFiles;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 3, 7, 1, 8, 4, 6, 2 };
		//method using brute force
		for(int i =0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		//inbuilt method
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
