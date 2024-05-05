package testingUnderstandProject;

import java.util.Arrays;

public class arrayAlternateSorting {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6, 7 };
		Arrays.sort(ar);
		int len = ar.length, k = 1;
		int temp[] = new int[len];
		int mid = len / 2;
		for (int i = 0; i < len - 1; i++) {
			temp[i] = ar[len - k];
			k++;
			i++;
		}
		for(int j =0;j<len-1;j++) {
			temp[j+1] = ar[j];
			j++;
		}
		System.out.println(Arrays.toString(temp));
	}
}
