package ramFiles;

import java.util.Scanner;

import javax.crypto.spec.PSource;

public class ArraySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find : ");
		int number = sc.nextInt();
		int position = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == number)
				position = i;
		}
		if (position != -1)
			System.out.println("Element at the position : " + (position + 1));
		else
			System.out.println("Element at the position : " + -1);
	}

}
