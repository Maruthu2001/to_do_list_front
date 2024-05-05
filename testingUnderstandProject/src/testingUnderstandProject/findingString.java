package testingUnderstandProject;

import java.util.Arrays;

public class findingString {

	public static void main(String[] args) {
		String name = "WELCOMETOZOHOCORPORATION ";
		int matrixLen = (int) Math.round(getStringSqrt(name.length()));
		char arr[][] = new char[matrixLen][matrixLen];
		String givenString = "TOO";
		int charCount =0;
		for (int i = 0; i < matrixLen; i++) {
			for (int j = 0; j < matrixLen; j++) {
				arr[i][j] = name.charAt(charCount);
				charCount++;
			}
		}
		for (int i = 0; i < matrixLen; i++) {
			for (int j = 0; j < matrixLen; j++) {
				if(arr[i][j] == 'T') {
					String formedString = "";
					if(j < matrixLen/2) {						
						formedString = ""+arr[i][j]+arr[i][j+1]+arr[i][j+2];
						if(givenString.equals(formedString)) {
							int end = j+2;
							System.out.println("start : <"+i+","+j+">" );
							System.out.println("start : <"+i+","+end+">" );
						}
					}
					if(i < matrixLen/2) {						
						formedString = ""+arr[i][j]+arr[i+1][j]+arr[+2][j];
						if(givenString.equals(formedString)) {
							int start = i+2;
							System.out.println("start : <"+i+","+j+">" );
							System.out.println("start : <"+start+","+j+">" );
						}
					}
				}
			}
		}
	}

	private static double getStringSqrt(int num) {
		double t;
		double sqrt = num / 2;
		do {
			t = sqrt;
			sqrt = ((t + (num / t)) / 2);
		} while ((t - sqrt) != 0);
		return sqrt;
	}
}
