package testingUnderstandProject;

public class Recursion {

	public static void main(String [] args) {
		
		int sum = fact(3,5);
		System.out.println(sum);
	}
	
	private static int fact(int n , int m) {
		if(n==1)
			return 1;
		return fact(fact(n-1,m),fact(m-1,m-1));
	}
}
