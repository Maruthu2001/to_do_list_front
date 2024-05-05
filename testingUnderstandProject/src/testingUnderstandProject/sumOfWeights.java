package testingUnderstandProject;

public class sumOfWeights {

	public static void main(String []args) {
		int arr[] = {10,36,54,89,12};
		for(int num : arr) {
			int weigth = 0;
			double sqr = Math.sqrt(num);
			if(sqr * sqr == num) {
				weigth += 5;
			}
			if(num % 4 == 0 && num % 6 ==0) {
				weigth += 4;
			}
			if(num%2 ==0) {
				weigth += 3;
			}
			System.out.println(num+", "+weigth);
		}
	}
}
