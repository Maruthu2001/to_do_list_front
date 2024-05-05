package ramFiles;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("///***    Welcome to simple calculator    ***///");
		Scanner sc = new Scanner(System.in);
		double num1 = 0, num2 = 0;
		int operation = 0;
		System.out.println("\nEnter the first number : ");
		num1 = sc.nextDouble();
		System.out.println("Enter the second number : ");
		num2 = sc.nextDouble();
		boolean doContinue = Boolean.TRUE;
		while (doContinue) {
			System.out.println("Choose operations\n1)Addition\n2)Subtraction\n3)Multiplication\n4)Division\n5)Exit");
			operation = sc.nextInt();
			switch (operation) {
			case 1:
				System.out.println("After adding two numbers total is : " + (num1 + num2));
				break;
			case 2:
				System.out.println("After adding two numbers total is : " + (num1 - num2));
				break;
			case 3:
				System.out.println("After adding two numbers total is : " + (num1 * num2));
				break;
			case 4:
				System.out.println("After adding two numbers total is : " + (num1 / num2));
				break;
			case 5:
				System.out.println("Exited...");
				sc.close();
				doContinue = Boolean.FALSE;
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid operation");
			}
		}
	}

}
