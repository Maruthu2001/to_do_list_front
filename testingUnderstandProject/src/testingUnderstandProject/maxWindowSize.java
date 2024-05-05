package testingUnderstandProject;

public class maxWindowSize {

	public static void main(String[] args) {
		int k = 3;
		int[] arr = { 1, 1, 5, 2, 6, 2, 4, 8, 9 };
		int max = 0;
		for (int i = 0; i <= arr.length - k; i++) {
			max = 0;
			for (int j = 0; j < k; j++) {
				if (max < arr[i + j]) {
					max = arr[i + j];
				}
			}
			System.out.print(max + " ");
		}
	}
}
