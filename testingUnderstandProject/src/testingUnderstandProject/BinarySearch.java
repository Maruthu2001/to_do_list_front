package testingUnderstandProject;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int len = arr.length;
		int num = 7;
		int x =0;
		System.out.println(System.currentTimeMillis());
//		int x = getByBinarySearch(arr, len-1, num);
		for(int i =0;i<len-1;i++) {
			if(arr[i]==num) {
				x = i;
			}
		}
		System.out.println(System.currentTimeMillis());
		System.out.println("position : "+x);
	}

	private static int getByBinarySearch(int[] arr, int len, int num) {
		int left = 0;
		int right = len;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == num) {
				return mid;
			}
			if (arr[mid] < num) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return 0;
	}
}
