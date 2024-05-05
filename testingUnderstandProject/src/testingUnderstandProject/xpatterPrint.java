package testingUnderstandProject;

public class xpatterPrint {

	public static void main(String[] args) {
		String ss = "programming";
		int len = ss.length();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i == j || j == len-i-1) {
					System.out.print(ss.charAt(j));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
