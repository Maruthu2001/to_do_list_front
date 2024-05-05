package ramFiles;

public class RecursiveFunctionArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int len = arr.length;
		System.out.println("Sum of array " + findSum(arr, len-1));
	}

	static int findSum(int[] arr, int len) {
		if (len == -1) 			
			return 0;
		return arr[len] + findSum(arr, len-1);
	}
}
