package testingUnderstandProject;

public class grandChildren {

	public static void main(String[] args) {
		String arr[][] = { { "luke", "shaw" }, { "wayne", "rooney" }, { "rooney", "ronaldo" }, { "shaw", "rooney" } };
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j < 2; j++) {
				if (arr[i][j] == "ronaldo") {
					int count = getCount(arr, arr[i][j - 1]);
					System.out.println(count);
					break;
				}
			}
		}
	}

	private static int getCount(String arr[][], String name) {
		int count = 0;
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j < 2; j++) {
				if (arr[i][j] == name) {
					count++;
				}
			}
		}
		return count;
	}
}
