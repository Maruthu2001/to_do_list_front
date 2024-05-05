package testingUnderstandProject;

public class fibonacci {

	public static void main(String [] args) {
		int n = 5;
		System.out.print(1);
//		fibo(n);
		
	}
	
	private static int fibo(int m) {
		System.out.print(m);
		if(m == 1 || m==2) {
			return 1;
		}
		return fibo(m-1);
	}
}
