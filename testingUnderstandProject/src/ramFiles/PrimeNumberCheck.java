package ramFiles;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("Welcome to prime number check function");
		System.out.println("Enter the number : ");
		number = sc.nextInt();
		boolean bool = Boolean.FALSE;
		if (number <= 1)
			bool = Boolean.FALSE;
		else
		for(int i =2;i<=number/2;i++) {
			if(number%i==0) {
				bool = Boolean.FALSE;
				break;
			}
			bool = Boolean.TRUE;
		}
		if(!bool) {
			System.out.println("It is not a prime number");
		} else {
			System.out.println("It is a prime number");
		}
	}
}
